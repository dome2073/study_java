package org.zerock.ex;

import java.util.Arrays;

import lombok.Data;

//객관식 문제
@Data
public class MultipleQuiz extends AbstractQuiz {

	//데이터가 늘어났음 --> 보기가 어려개
	private String[] options;

	//입력값 3개
	public MultipleQuiz(String text, String answer, String ...options) {
		super(text, answer);
		this.options = options;
	}
	
	
	//abstract
	@Override
	public String getContent() {
		
		String str = this.getText() +"\n" + Arrays.toString(options);
		
		return str;
	}

}
