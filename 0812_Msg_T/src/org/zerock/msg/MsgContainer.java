package org.zerock.msg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MsgContainer {

	private List<MsgVO> msgList;
	
	public MsgContainer() {
		this.msgList = new ArrayList<>();
	}
	
	public void addMsgVO(MsgVO vo) {
		this.msgList.add(vo);
	}
	
	public List<MsgVO> getUserMsgVO(int userNum){
		
		
		List<MsgVO> result = msgList.stream().filter(vo -> {
			if(vo.getTo() == userNum) {
				vo.setState(true);
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		return result;
		
	}
}
















