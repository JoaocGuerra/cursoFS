package com.jcga.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long TimaStamp;
	public StandardError(Integer status, String msg, Long timaStamp) {
		super();
		this.status = status;
		this.msg = msg;
		TimaStamp = timaStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimaStamp() {
		return TimaStamp;
	}
	public void setTimaStamp(Long timaStamp) {
		TimaStamp = timaStamp;
	}
}
