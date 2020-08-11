package org.zerock.handler;

public class EchoHandler implements Handler {
	
	//메세지가 들어오면 그대로 반환하는 기능
	@Override
	public String handle(String word) {
		return "ECHO";
	}
	
	
}
