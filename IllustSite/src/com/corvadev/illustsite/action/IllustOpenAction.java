package com.corvadev.illustsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class IllustOpenAction extends ActionSupport{

	private String title;

	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}

}