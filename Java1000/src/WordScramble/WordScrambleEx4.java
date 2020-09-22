package WordScramble;

import java.util.Scanner;

class WordScrambleEx4 {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner s = new Scanner(System.in); // �ѹ� ������ ���� �����ϸ� �ǹǷ� �ݺ��� ������ �̵�

		while (true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			char[] hint = new char[answer.length()];

			// hint�� '_'�� �ʱ�ȭ �Ѵ�. ������ LOVE��� hint�� "____"�� �ȴ�.
			for (int i = 0; i < hint.length; i++) {
				hint[i] = '_';
			}

			while (true) {
				System.out.println("Question :" + question);
				System.out.print("Your answer is :");

				String input = s.nextLine();

				if (input.equalsIgnoreCase("q"))
					System.exit(0);

				if (input.equalsIgnoreCase(answer)) {
					System.out.println("�����Դϴ�.");
					System.out.println();
					break;
				} else {
					System.out.println(input + "��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
					System.out.println("Hint:" + getHint(answer, hint));
				}
			} // while
		} // outer while

	} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int) (Math.random() * strArr.length);
		return strArr[idx];
	}

	// ���� ����� ����� ������쵵 ���� �� ����. �������� �ʰ�... �׳� ������
	public static String getScrambledWord(String str) {
            char[] chArr = str.toCharArray();

            for(int i=0;i<chArr.length;i++) { 

                 int idx = (int)(Math.random()*str.length());
                 
                  char tmp = chArr[i];
                  chArr[i] = chArr[idx];
                  chArr[idx] = tmp;
            }
	

	return new String(chArr);

	} // scramble(String str)

	public static String getHint(String answer, char[] hint) {
           int count = 0; // ��Ʈ�� ���Ե� '_'�� ����
           System.out.println(answer);
           System.out.println(hint);
          
           // 1. �ݺ����� �̿��ؼ� hint�� ���Ե� '_'�� ������ ����.
           for(int i=0; i<hint.length; i++) {
        	   if(hint[i] == '_')
        		   count += 1;
           }
           // 2. count�� ���� 2���� Ŭ ���� ������ �� ���ڸ� hint�� �ִ´�.
           int random = (int)(Math.random() * hint.length); 
           
           if(count >= 2) {

        	   hint[random] = answer.charAt(random);
           }
           //    ������ �� �˷��ִ� ��Ȳ�� ���� �ʰ� �ϱ� ����.

           //    [����] �ݵ�� ���� ��Ʈ ���� �ѱ��ڸ� �� ���������.

           //    ���� ��� ������ "LOVE"�̰� ���� ��Ʈ�� "L___"�̾��ٸ�

           //    �� ���� ��Ʈ�� "L__E"�Ǵ� "L_V_" �� ���� ���̾�� �Ѵ�.

           //    Math.random()�� ����ؼ� ������ �� ���ڸ� ��� ��Ʈ�� ������ �ȴ�.
           return new String(hint);
      } // getHint()
}
