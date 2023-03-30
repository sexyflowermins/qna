package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.QnaDAO;

@WebServlet("/replyWrite")
public class ReplyWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	QnaDAO dao;
    public ReplyWrite() {
        super();
        dao = new QnaDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String reply = request.getParameter("reply");
		int a = dao.replyWrite(reply, id);
		PrintWriter out = response.getWriter();
		if(a != 0) {
			out.print("<script>alert('답변 작성에 성공하였습니다'); location.href='replyList'</script>");
		}else if (a == 0){
			out.print("<script>alert('답변 작성에 실패했습니다'); location.href='WriteAnswer.jsp'</script>");
			//response.sendRedirect("tag2.jsp");
		}
	}

}
