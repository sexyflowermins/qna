<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
	if (useremail == null && password == null) {
	    out.println("<script>alert('로그인이 필요합니다'); location.href='login.jsp'</script>");
	}
%>
<jsp:include page="/Layout/headerManager.jsp"/>

<style>
	main{
		height: 600px;
	}
</style>
<main>
    <%= useremail %>
	관리자 시작화면 입니다
</main>

<jsp:include page="/Layout/footer.jsp"/>

