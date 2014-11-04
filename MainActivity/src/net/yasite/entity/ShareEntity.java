package net.yasite.entity;

import java.io.Serializable;

public class ShareEntity implements Serializable{
	private String state;
	private String message;
	private ShareInfoEntity info;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ShareInfoEntity getInfo() {
		return info;
	}
	public void setInfo(ShareInfoEntity info) {
		this.info = info;
	}
	public ShareEntity() {
		super();
	}
	
}
