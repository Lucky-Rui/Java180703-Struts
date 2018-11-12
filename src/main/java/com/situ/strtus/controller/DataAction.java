package com.situ.strtus.controller;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("DataAction.execute()");
		//方法一：直接获取servlet api，使用核心类ServletActionContext提供的静态方法。
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext application = ServletActionContext.getServletContext();
		request.setAttribute("request_data1", "request_data1");
		session.setAttribute("session_data1", "session_data1");
		application.setAttribute("application_data1", "application_data1");
		
		//方法二：通过ActionContext获取不同（代表request、session、application）的map。
		//ActionContext是Struts提供的方便拿Strtus数据的一个接口类
		ActionContext actionContext = ActionContext.getContext();
		// Strutsdu对HttpServletRequest对象进行封装，封装为一个Map
		// 拿到表示request对象的Map，这个Map就是往request域对象中放值
		Map<String, Object> contextMap = actionContext.getContextMap();
		Map<String, Object> sessionMap = actionContext.getSession();
		Map<String, Object> applicationMap = actionContext.getApplication();
		contextMap.put("request_data2", "request_data2");
		sessionMap.put("session_data2", "session_data2");
		applicationMap.put("application_data2", "application_data2");
		
		return "data";
	}
}
