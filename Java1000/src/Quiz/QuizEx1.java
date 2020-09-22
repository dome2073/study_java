package Quiz;

class QuizEx1 {
    public static void main(String[] args) {
          String[] data = {
                "다음 중 키워드가 아닌 것은?`2`final`True`if`public",
                "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^",
                "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false",
          }; 
          String[] question;
          for(int i=0;i<data.length;i++) {

              // 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
        	  question = data[i].split("`", 1);
              // 2. 문제를 출력하세요.

              // 3. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.

              // 4.반복문을 이용해서 선택지를 출력하세요.
        	  System.out.println(question[i]);
       }
       
        
    } // main
}

