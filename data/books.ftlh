<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <title>info</title>
    <link href="css/freemarker.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h3>List of books:</h3>
    <table class="table table-warning table-group-divider">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Books</th>
            <th scope="col">Author</th>
            <th scope="col">Year</th>
            <th scope="col">Status</th>

        </tr>
        </thead>
        <tbody class="table-group-divider">

        <#list books as book>
            <tr>
                <th scope="row">${book?counter}</th>
                <td> <a href = "https://localhost:9889/books/book"> ${book.name!"-- не указано --"}</a></td>
                <td> ${book.author!"-- не указано --"}</td>
                <td> ${book.year!"-- не указано --"}</td>
                <td> ${book.status?string('yes', 'no')}</td>
            </tr>
        </#list>
        </tbody>
    </table>

</div>
</body>
</html>