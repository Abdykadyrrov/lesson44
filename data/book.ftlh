<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <title>Books</title>
    <link href="css/freemarker.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<div class="container">

    <h1>Book description:</h1>
        <div class="card" style="width: 18rem;">
            <div class="card-header">
                Book: ${book.name}
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Status: ${book.status?string('yes', 'no')}  </li>
                <li class="list-group-item">Author: ${book.author} </li>
                <li class="list-group-item">Year: ${book.year} </li>
            </ul>
        </div>
    </div>
</div>

</div>
</body>
</html>