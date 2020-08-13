package org.zerock.oto;

import java.net.InetAddress;

public class ChatVO {
	private InetAddress ip;
	private int port;
	private String text;
	
	public ChatVO(InetAddress ip, int port, String text) {
		super();
		this.ip = ip;
		this.port = port;
		this.text = text;
	}

	@Override
	public String toString() {
		return "ChatVO [ip=" + ip + ", port=" + port + ", text=" + text + "]";
	}
	


	
	
}
