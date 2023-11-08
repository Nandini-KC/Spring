<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello welcome!!!</h1>
<h2>${Message}</h2>
<form action="send" method="post">
Sweet Name<input name=sweetName type="text"><br>
Price<input name=price type="number"><br>
<button type="submit">Submit </button>
${valid}
</form>

</body>
</html>