<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualiza</title>
</head>
<body>
<label><b><font size="+2"> Atualizar Tarefa</font></b></label>
<br>
<br>
<form action='Atualiza' method='post'>
<input type="text" name="task" value='${param.task}'>
<input type="hidden" name="id" value='${param.id}'>
<input type="submit" value = "atualizar">
</form>

</body>
</html>