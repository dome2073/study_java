import java.util.ArrayList;
import java.util.List;

import org.zerock.msg.MsgVO;

import com.google.gson.Gson;

public class MsgMain {
	public static void main(String[] args) {
		
		List<MsgVO> list = new ArrayList<>();
		list.add(new MsgVO(1,10,"AAA"));
		list.add(new MsgVO(2,10,"BBB"));
		list.add(new MsgVO(3,10,"CCC"));
		
		//��ȯ
		Gson gson = new Gson();
		
		//list -> json���� ����
		String str = gson.toJson(list);
		
		System.out.println(str);
		
		//ArrayList�� ������ �迭�� ������ ��� ����
		MsgVO[] msgList = gson.fromJson(str, MsgVO[].class);
		
		System.out.println("-------------------------");
		for (int i = 0; i < msgList.length; i++) {
			System.out.println(msgList[i]);
		}
		
		
		
//		MsgVO vo = new MsgVO(1,2,"��Ծ���?");
//		
//		//gson ���̺귯��
//		Gson gson = new Gson();
//		
//		//��ü -> json���� ����!
//		String str = gson.toJson(vo);
//		
//		System.out.println(str);
//		
//		//���ڿ� -> json ����!
//		MsgVO result =gson.fromJson(str, MsgVO.class);
//		
//		System.out.println(result);
	}
}
