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

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("ZbcdeTfg") );
	}
}
