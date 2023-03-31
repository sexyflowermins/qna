<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
%>
<jsp:include page="/Layout/headerlogin.jsp"/>

<style>
main{
	font-size: 50px;
	height: 600px;
}
</style>
<main>
	<%= useremail %>
	로그인이 되었습니다, 질문과 답을 받아보세요!
</main>

<jsp:include page="/Layout/footer.jsp"/>

