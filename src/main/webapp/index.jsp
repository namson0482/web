<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        function myFunction(e) {
            let text = "Do you want to go to servlet page";
            if (confirm(text) == true) {
                return true;
            } else {
                e.preventDefault();
                return false;
            }
            //document.getElementById("demo").innerHTML = text;
        }
    </script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<p/>
<a href="hello-servlet?name=vu nam son" onclick="myFunction(event)">Call servlet by GET Method</a> <br/><br/>

<a href="example_jsp_1.jsp?value=other_jps_by_get_method">Call a other JSP page by GET Method</a>
</body>
</html>