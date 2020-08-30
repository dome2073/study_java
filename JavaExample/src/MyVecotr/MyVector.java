package MyVecotr;

import java.util.Arrays;

public class MyVector {

	Object[] objArr; // 1. Object 배열선언
	int size; // 저장된 객체 개수

	// 2. 생성자추가
	MyVector() {
		objArr = new Object[16];
	}

	MyVector(int capacity) {
		objArr = new Object[capacity];
	}

	// 3. size()
	// 객체배열에 저장된 객체의 개수 = size // size 를 반환
	public int size() {

		return size;
	}

	// 3. capacity()
	// 배열 objArr의 길이를 반환
	public int capacity() {
		return objArr.length;

	}

	// 3. isEmpty()
	// 객체배열이 비었는지 확인
	public boolean isEmpty() {
		// 객체배열이 비었을 경우 t / 비어있지 않을경우 f
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 4. add(Object obj)
	// objArr에 객체를 추가하는 메서드
	void add(Object obj) {
		// objArr에 들어온 추가할 데이터 obj

		// 배열의 크기와 저장된 객체의 개수가 같으면
		// 배열의 크기를 늘려야함
		if (size == capacity()) {
			
			setCapacity(capacity() *2);
			
		}
		// 현재 배열에 값을 넣어야함
		objArr[size] = obj;
		size += 1;
	}

	// 5. Object get(index)
	// -> objArr에 저장된 객체를 반환
	public Object get(int index) {
		return objArr[index];
	}

	// 6. objArr에 저장된 모든 객체를 문자열로 이어서 반환 - toString() 오버라이딩
	@Override
	public String toString() {
		return "[objArr=" + Arrays.toString(objArr) + "]";
	}

	// 7. int indexOf(Object obj)
	// - > objArr에서 지정된 객체가 저장되어있는 위치를 반환
	public int indexOf(Object obj) {

		// objArr 배열에서 obj와 같은녀석이 있는지 찾아야함
		// 어떻게 ? 배열을 돌아다니면서
		for (int i = 0; i < size(); i++) {
			if (objArr[i].equals(obj)) {
				System.out.println("i ="+i);
				return i;
			}
		}
		return -1; // 값을 찾지 못한경우

		// 만약 obj에 기본형이면?
	}

	// 8. boolean remove(Object obj)
	// ->objArr에서 지정된 객체를 삭제
	public boolean remove(Object obj) {

		// 삭제하려면 삭제할 객체가 어디에있는지(index)를 찾아야함
		int removeIndex = indexOf(obj);
		// indexOf에서 객체를 못찾을 경우 false를 리턴
		if (removeIndex == -1) {
			return false;
		}
		// 값을 찾은경우 해당하는 인덱스를 null값으로 만들고

		// 9의 자리를 10으로 바꿈
		System.arraycopy(objArr, removeIndex + 1, objArr, removeIndex, size - removeIndex);
		objArr[size] = null;
		size--;

		return true;
	}
	
	//+ void clear()
	//--> 컬렉션의 객체를 모두 제거 (배열 모든 요소를 null)
	public void clear() {
		
		for(int i=0; i < size(); i++) {
			objArr[i] = null;
		}

	}
	
	//+ void setCapacity(int capacity)
	//--> 입력한 크기로 용량 변경 (배열의 크기)
	public void setCapacity(int capacity) {
		Object[] temp = new Object[capacity];
		
		System.arraycopy(objArr, 0, temp, 0, capacity());
		objArr = temp;
		
		// 어떻게?
		// capcity를 2배로 늘려야함
		// 원래 있던 배열을 다른곳에 저장한후
		// objArr -> temp
		// temp -> objArr
		
	}
	
	//+ ensureCapacity(int minCapacity)
	//--> 컬렉션의 용량을 확보
	void ensureCapacity(int minCapacity) {
		objArr = new Object[minCapacity];
	}
	
}
