package org.zerock.msg;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class MsgVO {
	private int from;
	private int to;
	private String text;
	private boolean status;
	
	public MsgVO(int from, int to, String text) {
		super();
		this.from = from;
		this.to = to;
		this.text = text;
		this.status = false;
	}
	
	
}
