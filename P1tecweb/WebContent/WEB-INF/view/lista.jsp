<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="java.util.*,br.edu.insper.* "%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista</title>
<label><b><font size="+2"> Task Manager</font></b></label>
</head>
<br>
<br>
<body>
<table border='1'>
<tr>
<th> Tarefa</th>
<th> Data </th>
</tr>
<c:forEach var="pessoas" items="${pessoas}">
<tr>
<td>${pessoas.task}</td>
<td>${pessoas.data}</td>
<td>
<form action='Remove' method='post'>
<input type='hidden' name='id' value='${pessoas.id}'>
<input type='submit' value='remover'>
</form>
<form action='Atualiza' method='get'>
<input type='hidden' name='id' value='${pessoas.id}'>
<input type='hidden' name='task' value='${pessoas.task}'>
<input type='submit' value='atualizar'>
</form>
</td>

</tr>
</c:forEach>

</table>
<br>
<a href="Cria">Criar Tarefa</a>

</body>
</html>