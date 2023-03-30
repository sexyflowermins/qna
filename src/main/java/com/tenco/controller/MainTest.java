package com.tenco.controller;

import com.tenco.controller.DAO.QnaDAO;
import com.tenco.controller.DAO.SoloDAO;
import com.tenco.controller.DTO.QnaDTO;
import com.tenco.controller.DTO.SoloDTO;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SoloDAO dao = new SoloDAO();
		//dao.insert("asdasdasd","asdasd","asdasd","asdasd");
//		SoloDTO dto = new SoloDTO("alsdn@naver.com","1234","kim","부산");
		//SoloController controller = new SoloController();
		//SoloDTO result = controller.requesetSingIn("asdasdasd.com","1234");
		//System.out.println(result);
		QnaDAO dao = new QnaDAO();
		//dao.selectReply("몇살이에요?", "m@naver.com");
//		System.out.println(dao.selectReply("몇살이에요", "m@naver.com"));
//		System.out.println(dao.selectReplyList());
//		System.out.println(dao.replyWrite("몇살이에요", "20살 애굣살만땅"));
		
		//dao.insert("안녕하세요", "반갑슷ㅂ니다", "ㅁㄴㅇㅁㄴㅇ");
		dao.replyWrite("수정", "1");
	}

}
