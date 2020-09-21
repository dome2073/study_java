package WordScramble;

class WordScrambleEx1 {
    public static void main(String[] args) {
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

          String answer = getAnswer(strArr);
          String question = getScrambledWord(answer);

          System.out.println("Question:"+question);
          System.out.println("Answer:"+answer);
    } // main

    public static String getAnswer(String[] strArr) { 
    	
    	//�迭 strArr�� ����� �ϳ��� ���Ƿ� ��� ��ȯ
    	//������ �� 0~ �迭�� ũ�� ��ŭ
    	int random = (int) (Math.random() * strArr.length);
    	
    	return strArr[random];
    }
   
    public static String getScrambledWord(String str) { 
    	
    	String newStr = "";

    	int random;
    	
    	//1.�־��� ���ڿ� str�� �� ������ ������ ���´� 
    	for(int i=0; i<str.length(); i++) {
    		random = (int) (Math.random() * str.length());
    		newStr += str.charAt(random);
    	}
    	//2.���ο� ���ڿ��� ��ȯ�Ѵ�.
    	
    	
    	return newStr;
    } // scramble(String str)
}
