import java.util.ArrayList;
import java.util.List;

//List ����
public class ListEx {
	public static void main(String[] args) {
		// <>�� ���׸�
		//�ڷᱸ�� �ȿ� � Ÿ���� ���� �� �ִ���
		List<String> list = new ArrayList<String>(); //�迭�� �ٸ��� ũ�⸦ �������� �ʾƵ���
		
		list.add("word");
		list.add("apple");
		list.add("samsong");
		list.add("ibm");
		
		//tosting�� �������̵� �Ǿ�����
		//�ε��� �ȱ��ص��� --> �� ��
		
		System.out.println(list);
		
		//������� �߰��� ���� �߰��ϰ� ���� ���
		list.add(2,"ZZZ");
		
		//�߰���
		
		//��ȸ
		//�Ķ���Ͱ� int == �ε����� --> ���°���� �����Ŵ�
		System.out.println(list.get(3));
		System.out.println(list);
		
		//����
		//�ε����� ���� or object�� �־ ����
		//EX) ibm
		//����Ʈ �ȿ� ibm�� ������
		list.remove("ibm");
		//��� 
		System.out.println(list);
		
		//����Ʈ�ȿ� ��ü�� �־�� , ������ 
	}
}
