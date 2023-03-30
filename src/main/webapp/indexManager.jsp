<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
%>
<jsp:include page="/Layout/headerManager.jsp"/>

<style>
</style>
<main>
    <%= useremail %>
	관리자 시작화면 입니다
</main>

<jsp:include page="/Layout/footer.jsp"/>

