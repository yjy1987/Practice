package com.test.helloworld;

import java.util.Arrays;

public class TryHelloWorld3
{
    public int getMinSum(int []A, int []B)
    {
    	Arrays.sort(A);
    	Arrays.sort(B);
        
        int size = A.length;
        int answer =0;
        for(int i=0; i<size; i++){
        	answer += A[i]*B[size-i-1];
        }
       
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld3 test = new TryHelloWorld3();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}