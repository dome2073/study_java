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

			// 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
			String userAnswer = sc.nextLine();
		
			if (userAnswer.equalsIgnoreCase("q")) {
				break;
			}
			
			if(answer.equalsIgnoreCase(userAnswer)) {
				System.out.println("�����Դϴ�.");
				break;
			}
			
			System.out.println(userAnswer+"�� ������ �ƴմϴ� �ٽ� �õ����ּ���");
		// 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�

		// ����ڰ� ������ ���߸�, while���� ����������.

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
