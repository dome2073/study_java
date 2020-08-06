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
		
		//사용자가 입력한 값과 정답이 일치한지 확인하고
		//배열안에 일치하는 코드가 있는지 찾음
		//OR 는 한쪽이 참이면 뒤에는 실행안함
		return super.checkAnswer(userAnswer) || Arrays.stream(words).anyMatch(w -> w.equals(userAnswer));
	}
	

	
}
