package com.test.helloworld;

public class NumOfPrime {
	int numberOfPrime(int n) {
		int cnt1 = 0;
		for (int i = 1; i <= n; i++) {
			int temp = 0;
			int cnt2 = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt2++;
				}
			}
			temp = cnt2;
			if (temp == 2) {
				cnt1++;
			}
		}
		int result = cnt1;
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}