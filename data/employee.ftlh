<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>employee</title>
    <link href="css/freemarker.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>
<div class="container">


    <h3>List of employee:</h3>

    <table class="table table-primary table-striped">
        <thead>
        <tr class="table-group-divider">
            <th scope="col">#</th>
            <th scope="col">Employee</th>
            <th scope="col">Now reading
            <th scope="col">Read books</th>
        </tr>
        </thead>
        <tbody class="table-group-divider">

        <#list employees as employee>
            <tr>
                <th >${employee.id!"-a-"}</th>
                <td> ${employee.fullName!"-a-"}</td>
                <td> ${employee.currentBook!"-a-"}</td>
                <td> ${employee.readBook!"-a-"}</td>

            </tr>
        </#list>
        </tbody>
    </table>

</div>
</body>
</html>