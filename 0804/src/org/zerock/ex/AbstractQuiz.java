package org.zerock.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractQuiz {

	private String text;
	private String answer;
	
	//추상클래스
	//--> 각 문제 유형마다 다르기때문에!
	//ox, 보기, 대안
	public abstract String getContent();

	public boolean checkAnswer(String userAnswer) {
		
		//사용자가 입력한 값과 정답이랑 같은경우
		return userAnswer.equals(answer);
	}
}
