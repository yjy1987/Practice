package com.test.helloworld;

import java.util.ArrayList;
import java.util.List;

public class SumDivisor {
	public int sumDivisor(int num) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=num; i++){
			if(num%i==0){
				list.add(i);
			}
		}
		int answer = 0;
		for(int i : list){
			answer+=i;
		}		
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}
