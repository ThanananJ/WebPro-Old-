<%-- 
    Document   : index
    Created on : Sep 26, 2019, 3:30:06 PM
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <style>
        body, html {
            height: 100%;
            width: auto
        }

        .bg {
            /* The image used */
            background-image: url(./images/loginBG.png);

            /* Full height */
            height: 100%;

            /* Center and scale the image nicely */
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        * {box-sizing: border-box;}

        /* Style the input container */
        .input-container {
            display: flex;
            width: 400px;
            margin-bottom: 15px;
        }

        /* Style the input fields */
        .input-field {
            width: 100%;
            padding: 10px;
            outline: none;
        }


        .text{
            font-family: Prompt;
            font-weight: lighter;
        }
    </style>
    <body class="bg">
        <div style="text-align: right;margin: 50px 50px 0px 0px"><img src="./images/logo.png" width="400px" height="auto"></div>

            <form action="Login">
                <table style="float: right; margin: 50px 50px 0px 0px">
                    <tr>
                        <td>
                            <p class="text">Username : </p>
                        </td>
                        <td>
                            <input class="input-field" type="text" placeholder="Username" name="usrnm">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p class="text">Password : </p>
                        </td>
                        <td>
                            <input class="input-field" type="password" placeholder="Password" name="psw">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit" style="border: 0; background: transparent">
                                <img src="./images/loginbtn.png" width="90" height="auto" alt="submit" />
                            </button>
                        </td>
                    </tr>
                </table>
            </form>
    </body>
</html>
