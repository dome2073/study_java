package MyVecotr;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyVectorTest {
	
	//������
	MyVector v = new MyVector();
	MyVector v2 = new MyVector(15);
	ArrayList list = new ArrayList<>();
	
	
	
	
	@Test
	void init() {
		//��ü�迭�� ����

		System.out.println(v);
		System.out.println(v2);
		
		
		//����� ��ü�� ����
		
		System.out.println("size = " + v.size());
		System.out.println("size = " + v.capacity());
		System.out.println("isEmpty = " + v.isEmpty());
		System.out.println("------------------ó���ʱ�ȭ--------------");
		
		for(int i=0; i< v.capacity(); i++) {
			v.objArr[i] = ""+i;
			//add�Ҷ����� size +=1
		}
		//���� �迭�� ũ�⺸�� Ŭ ��쿡�� �迭�� ũ�⸦ �÷����� 
		//�迭�� ũ�� = capacity = 16
		
		System.out.println("------------------add��--------------");
		System.out.println(v);
		System.out.println("size = " + v.size());
		System.out.println("capcity = " + v.capacity());
		System.out.println("isEmpty = " + v.isEmpty());

	}
	
	@Test
	void InstanceTest(MyVector v,int obj_length) {
		//�׽�Ʈ�� add
		for(int i=0; i<obj_length; i++) {
			v.add(""+i);
		}
		System.out.println("�׽�Ʈ�� �� ���� :" + v);
	}
	
	@Test
	void sizeTest() {
		InstanceTest(v, 11);
		InstanceTest(v2, 9);
		
		System.out.println(v.size());
		System.out.println(v2.size());
		
		assertTrue(v.size() ==11);
		assertTrue(v.size() ==9);
	}
	
	
	@Test
	void addTest() {
		
		System.out.println("------------------add()�׽�Ʈ--------------");
		System.out.println(v2);
		
		for(int i=0; i<31; i++) {
			v2.add(""+i);
		}
		
		System.out.println("size = " + v2.size());
		System.out.println("capacity = " + v2.capacity());
		System.out.println("isEmpty = " + v2.isEmpty());
		System.out.println(v2);
		
		assertTrue(v2.capacity() > v2.size()); //capacity�� size���� ���� �� ����.
		assertTrue(v2.isEmpty() == false && v2.size() > 0);
		
		//v2.size =0;
		//assertTrue(v2.isEmpty() == true && v2.size() == 0);
	
		
	}
	
	@Test
	void getTest() {
		
		
		String testValue = "1";
		
		//v2.get(0)
		v2.add(testValue); 
		
		assertTrue(v2.get(0).equals(testValue));
		
		MyVector testValue2 = new MyVector();
		InstanceTest(testValue2, 10);
		//v2.get(1)
		v2.add(testValue2); //��ü�� �־�� 
		
		assertTrue(v2.get(1).equals(testValue2));
		
		System.out.println(v2.get(0));
		System.out.println(v2.get(1));
		System.out.println(v2.get(2));
	}
	
	@Test
	void toStringTest() {
		
		InstanceTest(v2,14);
		System.out.println(v2.toString());
	}
	
	@Test
	void indexOfTe0st() {
		InstanceTest(v2,14);
		InstanceTest(v, 14);
		
		
		v2.add(v); //�׽�Ʈ�� add
		
		System.out.println(v2); 
		
		
		//capacity 14�� v2.add�����Ƿ� 14�� ���ٸ� true
		assertTrue(v2.indexOf(v) == 14);
		//i=0 ~ 14���� �־����� ���ڿ� 12�� ã���� �ε����� 12�� true
		assertTrue(v2.indexOf("12") == 12);
		
		MyVector v3 = new MyVector(); //�׽�Ʈ��
		
		//���� ��ü�� ã�´ٸ� -1�� ���;���
		assertTrue(v2.indexOf(v3) == -1);
		
	}
	
	@Test
	void removeTest() {
		InstanceTest(v2, 14);
		
		v2.remove("13");
		
		System.out.println(v2);
		//���������Ƿ� size�� �پ������
		assertTrue(v2.size == 13);
		//���� ã���� ���� ���
		assertTrue(v2.remove("17") == false);
		
	}
	
	@Test
	void clearTest() {
		InstanceTest(v2, 15);
		v2.clear();
		System.out.println(v2);
	}
	
	@Test
	void setCapacity() {
		InstanceTest(v2, 15);
		
		v2.setCapacity(50);
		
		System.out.println(v2.capacity());
		
	}
	
	@Test
	void ensureCapacity() {
		System.out.println(v);
		
		v.ensureCapacity(20);
		System.out.println(v);
	}
	
}
