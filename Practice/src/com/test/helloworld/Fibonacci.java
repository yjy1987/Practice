package com.test.helloworld;

public class Fibonacci {
	public static long fibonacci(int num) {
		long answer=function(num);
		return answer;
	}
	
	public static long function(int a){
		if(a==0){
			return 0;
		}else if(a==1||a==2){
			return 1;
		}else
			return function(a-1)+function(a-2);
	}
	
	
  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 8;
		System.out.println(c.fibonacci(testCase));
	}
}
