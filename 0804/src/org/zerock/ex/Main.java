package org.zerock.ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{

		// 하나의 타입으로 여러개의 객체를 다룸 --> 부모의 타입으로 === 추상화타입
		// 원래 외부에서 만들어서 주입하는 타입
//		AbstractQuiz[] arr = {
//				new OXQuiz("1번 OX문제","O"),
//				new OXQuiz("2번 OX문제","O"),
//				new MultipleQuiz("3번 OX문제","1","보기3-1","보기3-2","보기3-3","보기3-4"),
//				new MultipleQuiz("4번 OX문제","1","보기4-1","보기4-2","보기4-3","보기4-4"),
//				new EssayQuiz("5번 주관식", "주관식문제", "일","1번","첫번째")
//		};
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		QuizLoader loader = new QuizLoader();
		
		AbstractQuiz[] arr = loader.loadFile("C:\\zzz\\quiz0.txt");
		
		
		for (AbstractQuiz quiz : arr) {
			
			
			System.out.println(quiz.getContent());
			
			String userInput = scanner.nextLine();
			
			boolean check = quiz.checkAnswer(userInput);
			
			if(check == false) {
				System.out.println("아깝지만 다음 기회에 .... ");
				break; //return ;
			}
			
		}//end for
		
		System.out.println("당신은 퀴즈왕!!!!");

	}//end main
	
}
