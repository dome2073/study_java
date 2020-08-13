package org.zerock.oos;

import java.io.Serializable;

public class MsgVO implements Serializable{
	
	public MsgVO(String from, String text) {
		super();
		this.from = from;
		this.text = text;
	}
	private String from;
	private String text;
	
	@Override
	public String toString() {
		return "MsgVO [from=" + from + ", text=" + text + "]";
	}
}
