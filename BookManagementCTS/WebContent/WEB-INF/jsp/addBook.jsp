<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<form action="addBook.htm" method="post">

Book Code <input type="text" name="bcode" align="top" placeholder="Book Code" class="form"><br><br>
Book Name<input type="text" name="bname" align="top" placeholder="Book Name" class="form" ><br><br>
Book Type<input type="text" name="btype" align="top" placeholder="Book Type" class="form" ><br><br>
Price <input type="text" name="price" align="top" placeholder="Price" class="form" ><br><br>
Description<input type="text" name="description" align="top" placeholder="Description" class="form" ><br><br>

<input type="submit" value="Add" class="for">
	
</form>
</body>
</html>