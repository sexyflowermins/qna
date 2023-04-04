<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
%>
<jsp:include page="/Layout/headerMyQna.jsp"/>
<style>
main{
		height: 600px;
}
</style>
<main>
	<form action="reply" method="get">
	<label>질문 번호 : </label>
	<input type="text" name="id" id="id">

	<label>이메일 확인: </label>
	<input type="email" name="email" id="email" value="<%=useremail %>">
	<button type="submit">답변 확인 하기</button>
	</form>
</main>

<jsp:include page="/Layout/footer.jsp"/>
