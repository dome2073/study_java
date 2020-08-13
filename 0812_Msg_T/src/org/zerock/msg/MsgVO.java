package org.zerock.msg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class MsgVO {
	
	private int from;
	private int to;
	private String text;
	private boolean state;

	public MsgVO(int from, int to, String text) {

		this.from = from;
		this.to = to;
		this.text = text;
		this.state = false;
	}
	
	

}
