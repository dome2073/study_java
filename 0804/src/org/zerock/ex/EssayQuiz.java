package org.zerock.ex;

import java.util.Arrays;

import lombok.Data;


@Data
public class EssayQuiz extends AbstractQuiz{

	private String[] words;

	
	public EssayQuiz(String text, String answer, String ...words) {
		super(text, answer);
		this.words = words;
	}


	@Override
	public String getContent() {
		
		return this.getText();
	}


	@Override
	public boolean checkAnswer(String userAnswer) {
		
		//����ڰ� �Է��� ���� ������ ��ġ���� Ȯ���ϰ�
		//�迭�ȿ� ��ġ�ϴ� �ڵ尡 �ִ��� ã��
		//OR �� ������ ���̸� �ڿ��� �������
		return super.checkAnswer(userAnswer) || Arrays.stream(words).anyMatch(w -> w.equals(userAnswer));
	}
	

	
}
