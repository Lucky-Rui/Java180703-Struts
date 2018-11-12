package com.situ.strtus.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.situ.strtus.entity.Admin;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	private Admin admin = new Admin();
	
	
	@Override
	public Admin getModel() {
		return admin;
	}
	
	
	public String register() {
		System.out.println(admin);
		return SUCCESS;
	}
}
