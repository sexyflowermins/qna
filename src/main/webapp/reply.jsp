<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/Layout/headerReply.jsp"/>
<main>
	<form action="">
		<h1>답변</h1>
		<c:forEach var="reply"  items="${reply}">
			<p> 답변 내용 : ${reply.reply}</p>
			<br>
		</c:forEach>
	</form>
</main>
<jsp:include page="/Layout/footer.jsp"/>