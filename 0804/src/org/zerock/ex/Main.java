package org.zerock.ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{

		// �ϳ��� Ÿ������ �������� ��ü�� �ٷ� --> �θ��� Ÿ������ === �߻�ȭŸ��
		// ���� �ܺο��� ���� �����ϴ� Ÿ��
//		AbstractQuiz[] arr = {
//				new OXQuiz("1�� OX����","O"),
//				new OXQuiz("2�� OX����","O"),
//				new MultipleQuiz("3�� OX����","1","����3-1","����3-2","����3-3","����3-4"),
//				new MultipleQuiz("4�� OX����","1","����4-1","����4-2","����4-3","����4-4"),
//				new EssayQuiz("5�� �ְ���", "�ְ��Ĺ���", "��","1��","ù��°")
//		};
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		QuizLoader loader = new QuizLoader();
		
		AbstractQuiz[] arr = loader.loadFile("C:\\zzz\\quiz0.txt");
		
		
		for (AbstractQuiz quiz : arr) {
			
			
			System.out.println(quiz.getContent());
			
			String userInput = scanner.nextLine();
			
			boolean check = quiz.checkAnswer(userInput);
			
			if(check == false) {
				System.out.println("�Ʊ����� ���� ��ȸ�� .... ");
				break; //return ;
			}
			
		}//end for
		
		System.out.println("����� �����!!!!");

	}//end main
	
}
