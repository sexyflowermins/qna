<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.util.*" %>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<jsp:include page="/Layout/headerManagerReply.jsp"/>
<main>
		<h1>질문 목록</h1>
		<c:forEach var="replyList"  items="${replyList}">
		<c:set var="number" value="${number+1}"/>
			<p> 질문 번호 ${replyList.id}</p>
			<p> 질문 제목 : ${replyList.title}</p>
			<p> 질문 내용 : ${replyList.content}</p>
			<p> 질문 답변 현황 : ${replyList.reply}</p>
			<p> 질문자 아이디 : ${replyList.userEmail}</p>
			<br>
		</c:forEach>
</main>
<jsp:include page="/Layout/footer.jsp"/>