package org.zerock.ex;

import lombok.Data;


//ox ����
@Data
public class OXQuiz extends AbstractQuiz{
	
	//�θ� �����ڰ� �ֱ⶧����
	public OXQuiz(String text, String answer) {
		//�θ��� ������ȣ��
		super(text, answer);
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.getText() +"\n �´� O Ʋ���� X";
	}
	
}
