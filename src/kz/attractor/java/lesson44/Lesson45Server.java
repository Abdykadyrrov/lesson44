package kz.attractor.java.lesson44;

import com.sun.net.httpserver.HttpExchange;
import kz.attractor.java.server.ContentType;
import kz.attractor.java.server.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;


public class Lesson45Server  extends Lesson44Server{

    private Employee employee = null;


    public Lesson45Server(String host, int port) throws IOException {
        super(host, port);

        registerGet("/login", this::loginGet);
        registerPost("/login", this::loginPost);

        registerGet("/register", this::registerGet);
        registerPost ("/register", this::registerPost);
        registerGet("/profile", this::profileGet);
        registerGet("/success", this::profileSuccessGet);


    }

    private void profileSuccessGet(HttpExchange exchange) {
        renderTemplate(exchange, "profile.ftlh", null);

    }


    private void profileGet(HttpExchange exchange) {
        renderTemplate(exchange, "profile.ftlh", getBooksDataModel());
    }

    private void registerGet(HttpExchange exchange) {
        renderTemplate(exchange, "register.ftlh", null);
    }

    private void registerPost(HttpExchange exchange) {
        Map<String, Object> map = new HashMap<>();
        String cType = getContentType(exchange);
        String raw = getBody(exchange);
        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");

        try {
            if (parsed.size() == 3) {
                List<Employee> employees = EmployeeFileService.readFile();
                Employee employee = Employee.createEmployee(employees.size() + 1, parsed);
                for (Employee user : employees) {
                    if (Employee.compareEmployee(employee, user)) {
                        throw new RuntimeException("user already exist!");
                    }
                }
                employees.add(employee);
                EmployeeFileService.writeFile(employees);
                redirect303(exchange, "/success");
            } else {
                map.put("fail", "Заполните поля!");
                renderTemplate(exchange, "register.ftlh", map);
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail", "Ошибка");
            renderTemplate(exchange, "register.ftlh", map);
        }
    }

    private void loginPost (HttpExchange exchange) {
        Map<String, Object> map = new HashMap<>();
        String cType = getContentType(exchange);
        String raw = getBody(exchange);
        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
        try {
            if (parsed.size() == 2) {
                List<Employee> employees = EmployeeFileService.readFile();
                for (Employee user : employees) {
                    if (user.getMail().equals(parsed.get("mail")) && user.getPassword().equals(parsed.get("password"))) {
                        employee = user;
                        redirect303(exchange, "/profile");
                    }
                }
            }
            map.put("fail", true);
            renderTemplate(exchange, "login.ftlh", map);
        } catch (Exception e) {
            redirect303(exchange, "/profile");
        }
    }

    private void loginGet(HttpExchange exchange) {
        HashMap<String, Object> parsed = new HashMap<>();
        parsed.put("fail", false);
        renderTemplate(exchange, "login.ftlh", parsed);

    }


    public String getContentType(HttpExchange exchange) {
        return exchange.getRequestHeaders()
                .getOrDefault("Content-Type", List.of(""))
                .get(0);
    }

    protected String getBody(HttpExchange exchange) {
        InputStream input = exchange.getRequestBody();
        Charset utf8 = StandardCharsets.UTF_8;
        InputStreamReader isr = new InputStreamReader(input, utf8);
        try (BufferedReader reader = new BufferedReader(isr)) {
            return reader.lines().collect(joining(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    protected final void redirect303(HttpExchange exchange, String path) {
        try {
            exchange.getResponseHeaders().add("Location", path);
            exchange.sendResponseHeaders(303, 0);
            exchange.getResponseBody().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private BooksDataModel getBooksDataModel(){
        return new BooksDataModel();
    }
}