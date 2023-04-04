<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String qnaId = request.getParameter("id");
	application.setAttribute("id", qnaId);
%>
<jsp:include page="/Layout/headerReply.jsp"/>
<style>
main{
	height: 600px;
}
</style>
<main>
	<form action="replyDelete.jsp" method="post">
		<h1>답변</h1>
		<c:forEach var="reply"  items="${reply}">
			<p> 답변 내용 : ${reply.reply}</p>
			<br>
		</c:forEach>
		<input type="submit" value="답변을 확인하셨으면  삭제 하시겠습니까?">
	</form>
</main>
<jsp:include page="/Layout/footer.jsp"/>