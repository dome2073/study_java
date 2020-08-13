
public class Ex1 {
	
	public static double doA(int a, int b) throws Exception {
		
		//1. try-catch -- finally�� return���� ���ϴ�0.
		try {
			System.out.println("try........");
			return a/b;			
			
		}catch(Exception e) {
			System.out.println("something wrong..."); //��ġ
			throw new Exception("Wrong"); //����
		}finally {
			
			System.out.println("finally......");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		//System.out.println(doA(10,2)); //OK
		System.out.println(doA(10,0)); //ERROR 1.try-catch 2.throw exception
		//���ܵ� ��ü
	}
}
