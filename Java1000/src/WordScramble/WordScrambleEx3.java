package WordScramble;

import java.util.*;

class WordScrambleEx3 {
	
	  static String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
	  static Scanner sc= new Scanner(System.in);
	  
	  public static void main(String[] args) {
   
            init();
                    

      } // main
      
      public static void init() {
    	
    	  while(true) {
          	
          	
          	String answer = getAnswer(strArr);
      		String question = getScrambledWord(answer);
          	
          	System.out.println("Question :" + question);
  			System.out.print("Your answer is :");
          	
          	String userAnswer = sc.nextLine();
          	
          	if (userAnswer.equalsIgnoreCase("q")) {
  				break;
  			}
  			
  			if(answer.equalsIgnoreCase(userAnswer)) {
  				System.out.println("정답입니다.");
  				init();
  			}
  			
  			System.out.println(userAnswer+"은 정답이 아닙니다 다시 시도해주세요");
          	
          }
      }
      
      public static String getAnswer(String[] strArr) {
            int idx = (int)(Math.random()*strArr.length);
            return strArr[idx];
      }
     
      public static String getScrambledWord(String str) {
            char[] chArr = str.toCharArray();

            for(int i=0;i < str.length();i++) {
                  

                  int idx = (int)(Math.random()*str.length());
                 
                  char tmp = chArr[i];
                  chArr[i] = chArr[idx];
                  chArr[idx] = tmp;
            }

            return new String(chArr);
      } // scramble(String str)
}
