package org.zerock.handler;

public interface Handler {

	//메세지가 들어오면 그대로 반환하는 기능
	String handle(String word);

}