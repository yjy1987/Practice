package com.test.helloworld;

public class WaterMelon {
	public String watermelon(int n){
	StringBuffer sb = new StringBuffer();
    int j = n/2;
    
    int k = n%2;
    
    System.out.println(j);
    
    //Ȧ��
    if(k==0){
      for(int i=1; i<j+1;i++){ 
    	sb.append("����");
      }
      
    }else{
    	for(int i=1; i<j+1; i++){
    		sb.append("����");	
    	}
    	sb.append("��");
    }
    	String result = sb.toString();
		return result;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}
