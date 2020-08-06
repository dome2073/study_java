package org.zerock.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractQuiz {

	private String text;
	private String answer;
	
	//�߻�Ŭ����
	//--> �� ���� �������� �ٸ��⶧����!
	//ox, ����, ���
	public abstract String getContent();

	public boolean checkAnswer(String userAnswer) {
		
		//����ڰ� �Է��� ���� �����̶� �������
		return userAnswer.equals(answer);
	}
}
