<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
%>
<jsp:include page="/Layout/headerQna.jsp"/>
<main>
	<form action="qnaUpLoad" method="post">
	<label>제목 : </label>
	<input type="text" name="title" id="title">

	<label>내용 : </label>
	<input type="text" name="content" id="content">

	<label>이메일 : </label>
	<input type="email" name="email" id="email" value="<%= useremail%>">
	<button type="submit">질문하기</button>
	</form>
</main>
<jsp:include page="/Layout/footer.jsp"/>