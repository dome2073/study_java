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
