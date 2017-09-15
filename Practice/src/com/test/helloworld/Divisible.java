package com.test.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<array.length; i++){
			if(array[i]%divisor==0){
				list.add(array[i]);
			}
		}
		int listSize = list.size();
		int[] ret = new int[listSize];
		
		for(int i=0; i<listSize; i++){
			ret[i] = list.get(i);
		}
		
		
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}