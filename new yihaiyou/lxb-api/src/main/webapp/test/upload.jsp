<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/soutu/api/pub/comment/newimage" method="post" enctype="multipart/form-data">  
  		<input name="file"  type="file" /> 
  		<input name="commentId" value="1" />
  		<button type="submit">提交</button> 
	</form>  

</body>
</html>