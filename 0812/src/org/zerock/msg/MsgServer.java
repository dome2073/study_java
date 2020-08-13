package org.zerock.msg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class MsgServer {
	public static void main(String[] args) throws Exception{
		
		//����
		//�������� ���� ~~~
		ServerSocket ss = new ServerSocket(5555);
		List<MsgVO> Msglist = new ArrayList<>();

		//gson
		Gson gson = new Gson();
		System.out.println("Server Ready.....");
		
		while(true) {
			
			Socket client = ss.accept();
			//�б�
			DataInputStream din = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			//int�� �ѹ� ����
			int oper = din.readInt();
			
			//oper�� ��۾��ҷ����� �� �� ���� 1.���, 2.��ȸ
			System.out.println("oper : "+ oper);
			
			switch (oper) {
			case 1:
				
				String jsonStr = din.readUTF();
				MsgVO vo =gson.fromJson(jsonStr, MsgVO.class);
				
				//�޼��� ��ü�� ���� ArrayList
				Msglist.add(vo);
				System.out.println(Msglist);
				
				break;
				
			case 2:
				int userNum = din.readInt();
				
				System.out.println("userNum: "+ userNum);
				
				//����
				List<MsgVO> myMsgList = Msglist.stream()
						.filter(msg -> msg.getTo() == userNum)
						.filter(msg -> !msg.isStatus())
						.collect(Collectors.toList());

				
				System.out.println(myMsgList);
				
				String str = gson.toJson(myMsgList);
				System.out.println(str);
				dos.writeUTF(str);
				
				for (MsgVO msgVO : myMsgList) {
					msgVO.setStatus(true);
				}
				
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
