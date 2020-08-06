package org.zerock.ex;

import lombok.Data;


//ox 퀴즈
@Data
public class OXQuiz extends AbstractQuiz{
	
	//부모에 생성자가 있기때문에
	public OXQuiz(String text, String answer) {
		//부모의 생성자호출
		super(text, answer);
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.getText() +"\n 맞다 O 틀리다 X";
	}
	
}
