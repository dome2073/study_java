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
    	
    	//배열 strArr의 요소중 하나를 임의로 골라서 반환
    	//임의의 수 0~ 배열의 크기 만큼
    	int random = (int) (Math.random() * strArr.length);
    	
    	return strArr[random];
    }
   
    public static String getScrambledWord(String str) { 
    	
    	String newStr = "";

    	int random;
    	
    	//1.주어진 문자열 str의 각 문자의 순서를 섞는다 
    	for(int i=0; i<str.length(); i++) {
    		random = (int) (Math.random() * str.length());
    		newStr += str.charAt(random);
    	}
    	//2.새로운 문자열로 반환한다.
    	
    	
    	return newStr;
    } // scramble(String str)
}
