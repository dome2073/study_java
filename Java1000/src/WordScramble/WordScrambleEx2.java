package WordScramble;

import java.util.*;

class WordScrambleEx2 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Question :" + question);
			System.out.print("Your answer is :");

			// 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
			String userAnswer = sc.nextLine();
		
			if (userAnswer.equalsIgnoreCase("q")) {
				break;
			}
			
			if(answer.equalsIgnoreCase(userAnswer)) {
				System.out.println("정답입니다.");
				break;
			}
			
			System.out.println(userAnswer+"은 정답이 아닙니다 다시 시도해주세요");
		// 3. 사용자가 정답을 맞출때까지 반복하다가

		// 사용자가 정답을 맞추면, while문을 빠져나간다.

	} // while

} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int) (Math.random() * strArr.length);
		return strArr[idx];
	}

	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int idx = (int) (Math.random() * str.length());

			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}

		return new String(chArr);
	} // scramble(String str)
}
