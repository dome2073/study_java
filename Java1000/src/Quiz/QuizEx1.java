package Quiz;

class QuizEx1 {
    public static void main(String[] args) {
          String[] data = {
                "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public",
                "���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^",
                "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false",
          }; 
          String[] question;
          for(int i=0;i<data.length;i++) {

              // 1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������ �������� ��������.
        	  question = data[i].split("`", 1);
              // 2. ������ ����ϼ���.

              // 3. �������� ������ ���� String[] split(String regex)�� ����ϼ���.

              // 4.�ݺ����� �̿��ؼ� �������� ����ϼ���.
        	  System.out.println(question[i]);
       }
       
        
    } // main
}

