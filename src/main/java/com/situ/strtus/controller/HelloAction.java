package com.situ.strtus.controller;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	public HelloAction() {
		System.out.println("HelloController.HelloController()");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("HelloController.execute()");
		return "success";
	}
	
	public String add() {
		System.out.println("HelloController.add()");
		//return "error";
		return "success";
	}
	
	public String delete() {
		System.out.println("HelloController.delete()");
		return "delete";
	}
	
}
