package net.yasite.entity;

import java.io.Serializable;
import java.util.List;

public class SecondCatEntity implements Serializable{
	private String state;
	private String message;
	private List<SecondCatInfoEntity> info;
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
	public List<SecondCatInfoEntity> getInfo() {
		return info;
	}
	public void setInfo(List<SecondCatInfoEntity> info) {
		this.info = info;
	}
	public SecondCatEntity() {
		super();
	}

}
