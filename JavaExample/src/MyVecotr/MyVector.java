package MyVecotr;

import java.util.Arrays;

public class MyVector {

	Object[] objArr; // 1. Object �迭����
	int size; // ����� ��ü ����

	// 2. �������߰�
	MyVector() {
		objArr = new Object[16];
	}

	MyVector(int capacity) {
		objArr = new Object[capacity];
	}

	// 3. size()
	// ��ü�迭�� ����� ��ü�� ���� = size // size �� ��ȯ
	public int size() {

		return size;
	}

	// 3. capacity()
	// �迭 objArr�� ���̸� ��ȯ
	public int capacity() {
		return objArr.length;

	}

	// 3. isEmpty()
	// ��ü�迭�� ������� Ȯ��
	public boolean isEmpty() {
		// ��ü�迭�� ����� ��� t / ������� ������� f
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 4. add(Object obj)
	// objArr�� ��ü�� �߰��ϴ� �޼���
	void add(Object obj) {
		// objArr�� ���� �߰��� ������ obj

		// �迭�� ũ��� ����� ��ü�� ������ ������
		// �迭�� ũ�⸦ �÷�����
		if (size == capacity()) {
			
			setCapacity(capacity() *2);
			
		}
		// ���� �迭�� ���� �־����
		objArr[size] = obj;
		size += 1;
	}

	// 5. Object get(index)
	// -> objArr�� ����� ��ü�� ��ȯ
	public Object get(int index) {
		return objArr[index];
	}

	// 6. objArr�� ����� ��� ��ü�� ���ڿ��� �̾ ��ȯ - toString() �������̵�
	@Override
	public String toString() {
		return "[objArr=" + Arrays.toString(objArr) + "]";
	}

	// 7. int indexOf(Object obj)
	// - > objArr���� ������ ��ü�� ����Ǿ��ִ� ��ġ�� ��ȯ
	public int indexOf(Object obj) {

		// objArr �迭���� obj�� �����༮�� �ִ��� ã�ƾ���
		// ��� ? �迭�� ���ƴٴϸ鼭
		for (int i = 0; i < size(); i++) {
			if (objArr[i].equals(obj)) {
				System.out.println("i ="+i);
				return i;
			}
		}
		return -1; // ���� ã�� ���Ѱ��

		// ���� obj�� �⺻���̸�?
	}

	// 8. boolean remove(Object obj)
	// ->objArr���� ������ ��ü�� ����
	public boolean remove(Object obj) {

		// �����Ϸ��� ������ ��ü�� ����ִ���(index)�� ã�ƾ���
		int removeIndex = indexOf(obj);
		// indexOf���� ��ü�� ��ã�� ��� false�� ����
		if (removeIndex == -1) {
			return false;
		}
		// ���� ã����� �ش��ϴ� �ε����� null������ �����

		// 9�� �ڸ��� 10���� �ٲ�
		System.arraycopy(objArr, removeIndex + 1, objArr, removeIndex, size - removeIndex);
		objArr[size] = null;
		size--;

		return true;
	}
	
	//+ void clear()
	//--> �÷����� ��ü�� ��� ���� (�迭 ��� ��Ҹ� null)
	public void clear() {
		
		for(int i=0; i < size(); i++) {
			objArr[i] = null;
		}

	}
	
	//+ void setCapacity(int capacity)
	//--> �Է��� ũ��� �뷮 ���� (�迭�� ũ��)
	public void setCapacity(int capacity) {
		Object[] temp = new Object[capacity];
		
		System.arraycopy(objArr, 0, temp, 0, capacity());
		objArr = temp;
		
		// ���?
		// capcity�� 2��� �÷�����
		// ���� �ִ� �迭�� �ٸ����� ��������
		// objArr -> temp
		// temp -> objArr
		
	}
	
	//+ ensureCapacity(int minCapacity)
	//--> �÷����� �뷮�� Ȯ��
	void ensureCapacity(int minCapacity) {
		objArr = new Object[minCapacity];
	}
	
}
