<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookList</title>
</head>
<body bgcolor="FED4CC">

	<section>
		<table border="1">
			<tr>
				<th>BookID</th>
				<th>BookName</th>
				<th>WriterName</th>
				<th>BookCategory</th>
				<th>BookPrice</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="book" items="${booklist}">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.writerName}</td>
					<td>${book.bookCategory}</td>
					<td>${book.bookPrice}</td>
					<td><button onclick="window.location.href='${pageContext.request.contextPath}/getbook/${book.bookId}'" type="button">Update</button></td>
					<td><button onclick="window.location.href='${pageContext.request.contextPath}/delete/${book.bookId}'" type="button">Delete</button></td>	
				</tr>
			</c:forEach>
		</table>
	</section>
	
	<br>
	
	<section>
		<form action="${pageContext.request.contextPath}/addBook" method="POST">
			<fieldset>
				<legend>Add New Book</legend>
				<label for="bID">Book ID</label> 
				<input type="number" name="bid"><br><br> 
				<label for="bname">Book Name</label> 
				<input type="text"name="bname"><br><br> 
				<label for="wname">Writer Name</label>
				<input type="text" name="wname"><br><br> 
				<label for="bcategory">Book Category</label> 
				<input type="text"name="bcategory"><br><br> 
				<label for="bprice">Book Price</label>
				<input type="number" name="bprice"><br><br>  
				<input type="submit"value="Add New Book">
			</fieldset>
		</form>
	</section>
	
	<br>
	<section>
		<form action="${pageContext.request.contextPath}/update/${updatelist.bookId}" method="POST">
			<fieldset>
				<legend>Update Book</legend>
				<label for="bID">Book ID</label> 
				<input type="number" name="bid" value="${updatelist.bookId}"><br><br> 
				<label for="bname">Book Name</label> 
				<input type="text"name="bname"value="${updatelist.bookName}"><br><br> 
				<label for="wname">Writer Name</label>
				<input type="text" name="wname"value="${updatelist.writerName}"><br><br> 
				<label for="bcategory">Book Category</label> 
				<input type="text"name="bcategory"value="${updatelist.bookCategory}"><br><br> 
				<label for="bprice">Book Price</label>
				<input type="number" name="bprice"value="${updatelist.bookPrice}"><br><br>  
				<input type="submit"value="Update Book">
			</fieldset>
		</form>
	</section>	
</body>
</html>