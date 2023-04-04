<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.util.*" %>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<jsp:include page="/Layout/headerManagerReply.jsp"/>
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
		<h1>질문 목록</h1>
		<div class="replyList">
		<c:forEach var="replyList"  items="${replyList}" >
		<div class="for">
		<c:set var="number" value="${number+1}"/>
			<p> 질문 번호 ${replyList.id}</p>
			<p> 질문 제목 : ${replyList.title}</p>
			<p> 질문 내용 : 
			<p>${replyList.content}</p>
			<p> 질문 답변 현황 : </p>
			<p>${replyList.reply}</p>
			<p> 질문자 아이디 : ${replyList.userEmail}</p>
			<br>
			<a href="/qna/replyWrite?replyId=${replyList.id}" class="btn">답변 하러가기</a>
			</div>
		</c:forEach>
		</div>
</main>
<jsp:include page="/Layout/footer.jsp"/>