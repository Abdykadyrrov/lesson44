<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="css/forms.css">
</head>
<body>
<form action="/register" method="post">
    <fieldset>
        <div class="legend">
            <p>Welcome employee!</p>
        </div>
        <div class="form-element">
            <label for="user-id">id</label>
            <input type="id"  id="user-id" placeholder="your id" required>
        </div>
        <div class="form-element">
            <label for="user-email">email</label>
            <input type="email" name="email" id="user-email" placeholder="your email" required >
        </div>
        <div class="form-element">
            <label for="user-password">password</label>
            <input type="password" name="user-password" id="user-password" placeholder="your password" required>
        </div>
        <div class="hr-line">
            <span class="details">one more step to go</span>
        </div>
        <div class="form-element">
            <button class="register-button" type="submit">Login!</button>
        </div>
    </fieldset>
</form>


</body>