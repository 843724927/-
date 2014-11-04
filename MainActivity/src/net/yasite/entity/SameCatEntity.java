package net.yasite.entity;

import java.io.Serializable;
import java.util.List;

public class SameCatEntity implements Serializable{
	private String state;
	private String message;
	private List<SameCatInfoEntity> info;
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
	public List<SameCatInfoEntity> getInfo() {
		return info;
	}
	public void setInfo(List<SameCatInfoEntity> info) {
		this.info = info;
	}
	public SameCatEntity() {
		super();
	}
	
}
