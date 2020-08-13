package org.zerkck.web;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MyWebRequest {
	
	private String line;
	private String[] arr;
	private String core;
	private String ext;
	public MyWebRequest(String line) {
		super();
		this.line = line;
		
		arr = line.split(" ");
		
		//core = 사용자 요청값전체 request
		core = arr[1];
		
		ext = core.substring(core.lastIndexOf(".")+1);
	}
	
	
}
