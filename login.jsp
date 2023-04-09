<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link type="text/css" rel="stylesheet" href="css/login.css"> 
</head>
<body style="background-image: url('css/background.jpg');">

   <h1> AdminLogin </h1> 
    <form action="AdminServlet" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>UserName : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <input type="checkbox" checked="checked"> Remember me   
             
        </div>   
    </form>     


</body>
</html>