package com.zyd.struts.controller;

import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

  private String id;
  private String password;
   /** serialVersionUID*/  
  private static final long serialVersionUID = 2672423131683221354L;
  
  public String test() throws Exception {
    System.out.println(1);
    ServletContext servletContext=ServletActionContext.getServletContext();
    servletContext.setAttribute("id", "world");
    return SUCCESS;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
