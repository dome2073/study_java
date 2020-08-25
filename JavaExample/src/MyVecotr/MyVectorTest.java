package MyVecotr;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyVectorTest {
	
	//생성자
	MyVector v = new MyVector();
	MyVector v2 = new MyVector(15);
	ArrayList list = new ArrayList<>();
	
	
	
	
	@Test
	void init() {
		//객체배열에 저장

		System.out.println(v);
		System.out.println(v2);
		
		
		//저장된 객체의 개수
		
		System.out.println("size = " + v.size());
		System.out.println("size = " + v.capacity());
		System.out.println("isEmpty = " + v.isEmpty());
		System.out.println("------------------처음초기화--------------");
		
		for(int i=0; i< v.capacity(); i++) {
			v.objArr[i] = ""+i;
			//add할때마다 size +=1
		}
		//만약 배열의 크기보다 클 경우에는 배열의 크기를 늘려야함 
		//배열의 크기 = capacity = 16
		
		System.out.println("------------------add후--------------");
		System.out.println(v);
		System.out.println("size = " + v.size());
		System.out.println("capcity = " + v.capacity());
		System.out.println("isEmpty = " + v.isEmpty());

	}
	
	@Test
	void InstanceTest(MyVector v,int obj_length) {
		//테스트용 add
		for(int i=0; i<obj_length; i++) {
			v.add(""+i);
		}
		System.out.println("테스트용 값 생성 :" + v);
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
		
		System.out.println("------------------add()테스트--------------");
		System.out.println(v2);
		
		for(int i=0; i<31; i++) {
			v2.add(""+i);
		}
		
		System.out.println("size = " + v2.size());
		System.out.println("capacity = " + v2.capacity());
		System.out.println("isEmpty = " + v2.isEmpty());
		System.out.println(v2);
		
		assertTrue(v2.capacity() > v2.size()); //capacity가 size보다 작을 수 없다.
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
		v2.add(testValue2); //객체로 넣어보기 
		
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
		
		
		v2.add(v); //테스트용 add
		
		System.out.println(v2); 
		
		
		//capacity 14에 v2.add했으므로 14와 같다면 true
		assertTrue(v2.indexOf(v) == 14);
		//i=0 ~ 14까지 넣었으로 문자열 12를 찾을때 인덱스가 12면 true
		assertTrue(v2.indexOf("12") == 12);
		
		MyVector v3 = new MyVector(); //테스트용
		
		//없는 객체를 찾는다면 -1이 나와야함
		assertTrue(v2.indexOf(v3) == -1);
		
	}
	
	@Test
	void removeTest() {
		InstanceTest(v2, 14);
		
		v2.remove("13");
		
		System.out.println(v2);
		//삭제했으므로 size가 줄어들어야함
		assertTrue(v2.size == 13);
		//값을 찾을수 없는 경우
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
