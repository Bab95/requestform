<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <title>Conformation Page</title>
    <head>
        <div class="header-box"><h1>Confirmation page</h1></div>
        <style type="text/css">
            body {
              margin:0;
              padding:0;
              font-family: sans-serif;
              background:rgba(0,0,0,.5);
            }
            .header-box h1{
                position:absolute;
                top: 10%;
                left: 40%;
            }
            .login-box {
                position: absolute;
                top: 50%;
                left: 50%;
                width: 400px;
                padding: 40px;
                transform: translate(-50%, -50%);
                background: rgba(0,0,0,.5);
                box-sizing: border-box;
                box-shadow: 0 15px 25px rgba(0,0,0,.6);
                border-radius: 10px;
            }

        </style>
    </head>
    <body>
        <div class="login-box">
            The Student Name is: ${student.firstName} ${student.lastName} from ${student.country}
        </div>
    </body>
</html>