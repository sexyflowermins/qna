<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/Layout/headerManagerReply.jsp"/>

<style>
	main{
		height: 300px;
		display: flex;
		justify-content: center;
		align-items: center;
	}
</style>
<main>
	<form action="replyWrite"  method="post">
	<label>질문 번호 : </label>
	<input type="text" name="id" id="id">

	<label>답변 : </label>
	<input type="text" name="reply" id="reply">
	
	<input type="submit" value="답변 저장 하기" >	
	</form>
</main>

<jsp:include page="/Layout/footer.jsp"/>