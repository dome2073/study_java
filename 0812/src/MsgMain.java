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
		
		//변환
		Gson gson = new Gson();
		
		//list -> json으로 변경
		String str = gson.toJson(list);
		
		System.out.println(str);
		
		//ArrayList를 받을땐 배열로 받으면 사용 가능
		MsgVO[] msgList = gson.fromJson(str, MsgVO[].class);
		
		System.out.println("-------------------------");
		for (int i = 0; i < msgList.length; i++) {
			System.out.println(msgList[i]);
		}
		
		
		
//		MsgVO vo = new MsgVO(1,2,"밥먹었어?");
//		
//		//gson 라이브러리
//		Gson gson = new Gson();
//		
//		//객체 -> json으로 변경!
//		String str = gson.toJson(vo);
//		
//		System.out.println(str);
//		
//		//문자열 -> json 변경!
//		MsgVO result =gson.fromJson(str, MsgVO.class);
//		
//		System.out.println(result);
	}
}
