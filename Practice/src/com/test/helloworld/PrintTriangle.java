package com.test.helloworld;

public class PrintTriangle {
	public String printTriangle(int num){
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0; i<num; i++){
			for(int j=0; j<i+1; j++){
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		return sb.toString();		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}
