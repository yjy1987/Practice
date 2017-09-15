package com.test.helloworld;

public class Collatz {
	public int collatz(int num) {
		
		int cnt =0;
		int answer = function(num,cnt);

		return answer;
	}

	public int function(int num,int cnt) {

		do {
			if (num % 2 == 0) {
				num = num / 2;
				cnt++;
			} else {
				num = num * 3 + 1;
				cnt++;
			}
		}
		while(num==0);
		
		return cnt;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
