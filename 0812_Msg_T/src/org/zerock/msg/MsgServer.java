package org.zerock.msg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class MsgServer {

	//bad code
	public static void main(String[] args) throws Exception{
		Gson gson = new Gson();
		ServerSocket ss = 
				new ServerSocket(5555);
		System.out.println("Server Ready");
		
		MsgContainer container = new MsgContainer();
		
		while(true) {
			
			Socket client = ss.accept();
			DataInputStream din =
				new DataInputStream(
						client.getInputStream());
			
			DataOutputStream dos =
					new DataOutputStream(
							client.getOutputStream());
				
			
			int oper = din.readInt();
		
			System.out.println("oper: 1");
			
			switch (oper) {
			case 1:
				String jsonStr = din.readUTF();
				
				MsgVO vo = gson.fromJson(jsonStr,MsgVO.class);
				
				container.addMsgVO(vo);
				
				break;
			case 2:
				
				int userNum = din.readInt();
				
				System.out.println("userNum: "+ userNum);
				
				List<MsgVO> list = container.getUserMsgVO(userNum);
						
				String str = gson.toJson(list);
				
				dos.writeUTF(str);
				
				break;

			default:
				break;
			}
			
			dos.close();
			din.close();
			client.close();
			
		}//end while
		
		
	}
}
