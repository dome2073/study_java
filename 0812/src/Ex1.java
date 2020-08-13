
public class Ex1 {
	
	public static double doA(int a, int b) throws Exception {
		
		//1. try-catch -- finally는 return보다 강하다0.
		try {
			System.out.println("try........");
			return a/b;			
			
		}catch(Exception e) {
			System.out.println("something wrong..."); //조치
			throw new Exception("Wrong"); //보고
		}finally {
			
			System.out.println("finally......");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		//System.out.println(doA(10,2)); //OK
		System.out.println(doA(10,0)); //ERROR 1.try-catch 2.throw exception
		//예외도 객체
	}
}
