package net.yasite.entity;

import java.io.Serializable;
import java.util.List;

public class ThirdCatEntity implements Serializable{
	private String state;
	private String message;
	private List<ThirdCatInfoEntity> info;
	public ThirdCatEntity() {
		super();
	}
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
	public List<ThirdCatInfoEntity> getInfo() {
		return info;
	}
	public void setInfo(List<ThirdCatInfoEntity> info) {
		this.info = info;
	}
	
}
