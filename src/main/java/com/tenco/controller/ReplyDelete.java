package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.DAO.QnaDAO;

@WebServlet("/replyDelete")
public class ReplyDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	QnaDAO dao;

	public ReplyDelete() {
		super();
		dao = new QnaDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String userEmail = request.getParameter("email");
		int a = dao.delete(id, userEmail);
		PrintWriter out = response.getWriter();
		if (a != 0) {
			out.print("<script>alert('질문 삭제에 성공하였습니다'); location.href='index2.jsp'</script>");
		} else if (a == 0) {
			out.print("<script>alert('질문 삭제에 실패했습니다'); location.href='ReplyDelete.jsp'</script>");
		}
	}

}
