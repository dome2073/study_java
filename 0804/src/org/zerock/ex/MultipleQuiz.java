package org.zerock.ex;

import java.util.Arrays;

import lombok.Data;

//������ ����
@Data
public class MultipleQuiz extends AbstractQuiz {

	//�����Ͱ� �þ�� --> ���Ⱑ �����
	private String[] options;

	//�Է°� 3��
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
