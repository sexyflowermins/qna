package com.tenco.controller.DTO;

public class QnaDTO {
	private int id;
	private String title;
	private String content;
	private String reply;
	private String userEmail;
	
	public QnaDTO() {
	}
	
	
	
	public QnaDTO(String title, String userEmail) {
		this.title = title;
		this.userEmail = userEmail;
	}



	public QnaDTO(String title, String content, String reply, String userEmail) {
		super();
		this.title = title;
		this.content = content;
		this.reply = reply;
		this.userEmail = userEmail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "QnaDTO [title=" + title + ", content=" + content + ", reply=" + reply + ", userEmail=" + userEmail
				+ "]";
	}

}
