package com.test.helloworld;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		
		
		char[] chArr = str.toCharArray(); 
		Arrays.sort(chArr);
		int maxIndex = chArr.length-1;
		char[] temp = new char[maxIndex+1];
		
		for(int i= maxIndex; i>=0; i--){
			temp[maxIndex-i] = chArr[i];
		}
		
		
		
		String result = String.valueOf(temp);
		
	
		return result;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("ZbcdeTfg") );
	}
}
