package org.zerock.inhert2;

/*
�߻�Ŭ���� ARaman
ARaman�� superŬ����
������ ���(�޼���)���� �����ϰ�
�ݵ�� �ٲ㼭 ����ϴ� cook()�� /��鸶�� ���̴� ����� �ٸ��� ����/
�����ξ��� abstract�� ����ϴ� �޼���� ������ش�.
==> �ٸ� �ڼ�Ŭ���������� cook()�޼��带 �������̵��ϵ��� �����ϰԵȴ�.!
*/
public abstract class ARaman {

	public void step1() {
		System.out.println("���� ���δ�");
	}

	public abstract void cook();

	public void step3() {
		System.out.println("�׸��� ���ڰ� ����ּ���");
	}

}