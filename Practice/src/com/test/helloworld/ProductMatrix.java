package com.test.helloworld;

public class ProductMatrix {
	public int[][] productMatrix(int[][] m1, int[][] m2) {
		  int[][] result = new int[m1.length][m2[0].length];
	        for(int i=0;i<result.length;i++)
	        {
	            for(int j=0;j<result[0].length;j++)
	            {
	                for(int k=0;k<m1[0].length;k++)
	                {
	                    result[i][j]+=m1[i][k]*m2[k][j];
	                }
	            }
	        }
	        return result;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("����� ���� : " + c.productMatrix(a, b));
	}
}
