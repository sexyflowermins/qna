package com.tenco.controller;

import com.tenco.DTO.SoloDTO;
import com.tenco.Service.SoloService;

public class SoloController {

	private SoloService service;
	
	public SoloController() {
		service = new SoloService();
	}
	
	public SoloDTO requesetSingIn(String email, String password) {
		SoloDTO responseSoloDto = service.checkUser(email, password);
		return responseSoloDto;
	}
}
