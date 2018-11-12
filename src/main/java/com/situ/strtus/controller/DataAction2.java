package com.situ.strtus.controller;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction2 extends ActionSupport 
	implements RequestAware, SessionAware, ApplicationAware{
	private Map<String, Object> requestMap;
	private Map<String, Object> sessionMap;
	private Map<String, Object> applicationMap;
	
	@Override
	public String execute() throws Exception {
		System.out.println("DataAction.execute()");
		requestMap.put("request_data3", "request_data3");
		sessionMap.put("session_data3", "session_data3");
		applicationMap.put("application_data3", "application_data3");
		
		return "data";
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}
}
