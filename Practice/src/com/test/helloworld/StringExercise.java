package com.test.helloworld;

public class StringExercise{
    String getMiddle(String word){
    	
    	int index = word.length();
    	char char1 = 0;
    	char char2 = 0;
    	String result = null;
    	if(index%2==0){
    		char1 = word.charAt(index/2-1);
    		char2 = word.charAt(index/2);
    		result = String.valueOf(char1).concat(String.valueOf(char2));
    	}else{
    		char1 = word.charAt(index/2);
    		result = String.valueOf(char1);
    	}
    	System.out.println(result);
    	return "";    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}