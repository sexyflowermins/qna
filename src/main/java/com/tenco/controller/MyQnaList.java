package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tenco.DAO.QnaDAO;
import com.tenco.DTO.QnaDTO;


@WebServlet("/myQnaList")
public class MyQnaList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyQnaList() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaDAO dao = new QnaDAO();
		String userEmail = request.getParameter("email");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		ArrayList<QnaDTO> result = dao.selectMyQnaList((String)session.getAttribute("useremail"));
		System.out.println(result.toString());
		PrintWriter out = response.getWriter();
		request.setAttribute("myQnaList", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("myQna.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
