package com.test.helloworld;

import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
    	String [] strArray = str.split(" ");
    	int[] array = Arrays.asList(strArray).stream().mapToInt(Integer::parseInt).sorted().toArray();
    	String result = (String.valueOf(array[0])).concat(" ").concat(String.valueOf(array[array.length-1]));
     	
    	return result;
    }

    public static void main(String[] args) {
        String str = "150 10 1 40 2 3 4 6";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
