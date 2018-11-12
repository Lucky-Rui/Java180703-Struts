package com.situ.strtus.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.situ.strtus.entity.User;

public class UserAction2 extends ActionSupport{
	private User user;

	public UserAction2() {
		System.out.println("UserAction.UserAction()");
	}

	public String register() {
		System.out.println(user);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
