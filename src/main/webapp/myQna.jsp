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
	background: #E8E9EE;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	box-shadow: -5px -5px 30px 5px gray, 5px 5px 30px 5px white;
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
			<a href="/qna/replySelect?qnaId=${myQnaList.id}" class="btn">답변 확인하기</a>
			</div>
		</c:forEach>
		</div>
</main>
<jsp:include page="/Layout/footer.jsp"/>