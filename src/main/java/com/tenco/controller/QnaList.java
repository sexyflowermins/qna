package com.tenco.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.QnaDAO;
import com.tenco.controller.DTO.QnaDTO;

/**
 * Servlet implementation class Reply
 */
@WebServlet("/qnaList")
public class QnaList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QnaList() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaDAO dao = new QnaDAO();
		ArrayList<QnaDTO> result = dao.selectReplyList();
		request.setAttribute("qnaList", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("qnaList.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
