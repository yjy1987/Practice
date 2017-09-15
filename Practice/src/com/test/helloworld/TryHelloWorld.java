package com.test.helloworld;

import java.util.Arrays;

class TryHelloWorld {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		
		int r=1, tmp1=a, tmp2=b, lcm;
		if(a<b){
			tmp2=a;
			tmp1=b;
		}
		
		while(r>0){
			r = tmp1%tmp2;
			tmp1=tmp2;
			tmp2=r;
		}
		lcm = a*b/tmp1;
		
		answer[0]=tmp1;
		answer[1]=lcm;
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(30, 45)));
	}
}
