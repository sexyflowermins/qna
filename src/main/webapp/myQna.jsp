<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.util.*" %>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
  <%
	String useremail = (String)session.getAttribute("useremail");
	String password = (String)session.getAttribute("password");
	
	if (useremail == null && password == null) {
	    out.println("<script>alert('로그인이 필요합니다'); location.href='login.jsp'</script>");
	}
%>
<jsp:include page="/Layout/headerMyQna.jsp"/>
<style>
main{
	display: flex;
}
.replyList{
 	display: flex;
	flex-wrap: wrap;
}
.for{
	background: #a8ff78; 
	background: -webkit-linear-gradient(to left, #78ffd6, #a8ff78);
	background: linear-gradient(to left, #78ffd6, #a8ff78);
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	box-shadow: -5px -5px 30px 5px green, 5px 5px 30px 5px blue;
	border: 1px solid black;
	border-radius: 20px;
	width: 300px;
	height: 200px;
	margin: 20px 0;
	margin-left: 3.65%;
}

</style>

<main>
		<h1>내 질문 목록</h1>
		<div class="replyList">
		<c:forEach var="myQnaList"  items="${myQnaList}" >
		<div class="for">
		<c:set var="number" value="${number+1}"/>
			<p> 질문 번호 ${myQnaList.id}</p>
			<p> 질문 제목 : ${myQnaList.title}</p>
			<p> 질문 내용 : 
			<p>${myQnaList.content}</p>
			<p> 질문자 아이디 : ${myQnaList.userEmail}</p>
			<br>
			</div>
		</c:forEach>
		</div>
</main>
<jsp:include page="/Layout/footer.jsp"/>