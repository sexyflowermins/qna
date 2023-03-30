<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/Layout/headerQna.jsp"/>
<main>
	<form action="qnaUpLoad" method="post">
	<label>제목 : </label>
	<input type="text" name="id" id="id">

	<label>내용 : </label>
	<input type="text" name="content" id="content">

	<label>이메일 : </label>
	<input type="email" name="email" id="email">
	<button type="submit">질문하기</button>
	</form>
</main>
<jsp:include page="/Layout/footer.jsp"/>