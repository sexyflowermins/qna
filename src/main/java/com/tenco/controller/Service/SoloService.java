package com.tenco.controller.Service;

import com.tenco.controller.DAO.SoloDAO;
import com.tenco.controller.DTO.SoloDTO;

public class SoloService {

	private SoloDAO dao;
	
	public SoloService() {
		dao = new SoloDAO();
	}
	
	// 회원 정보 찾기 - 로그인 로직 구현
	public SoloDTO checkUser(String email, String password) {
		boolean isValid = true;
		if (email.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}

		SoloDTO soloDTO = null;
		if (isValid) {
			soloDTO = dao.selectUserByUsernameAndPassword(email, password);
		}
		return soloDTO;
	}
	
}
