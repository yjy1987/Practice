package com.test.helloworld;

import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n){

		String str = String.valueOf(n);
		char[] chArr = str.toCharArray(); 
		Arrays.sort(chArr);
		int maxIndex = chArr.length-1;
		char[] temp = new char[maxIndex+1];
		
		for(int i= maxIndex; i>=0; i--){
			temp[maxIndex-i] = chArr[i];
		}
		
		
		
		int result = Integer.parseInt(String.valueOf(temp));
	
	
		return result;
	}
  
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
