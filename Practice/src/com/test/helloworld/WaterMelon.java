package com.test.helloworld;

public class WaterMelon {
	public String watermelon(int n){
	StringBuffer sb = new StringBuffer();
    int j = n/2;
    
    int k = n%2;
    
    System.out.println(j);
    
    //홀수
    if(k==0){
      for(int i=1; i<j+1;i++){ 
    	sb.append("수박");
      }
      
    }else{
    	for(int i=1; i<j+1; i++){
    		sb.append("수박");	
    	}
    	sb.append("수");
    }
    	String result = sb.toString();
		return result;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}
