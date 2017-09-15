package com.test.helloworld;

public class TryHelloWorld2 {
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int width  = board[0].length;
        int height = board.length;
        int a = 0;
        int b = 0;
        int cnt = 0;
        
        for(int i=0; i<height; i++){
        	for(int j=0; j<width; j++){
        		if(board[i][j]=='O'){
        			if(board[i][j+1]=='O'){
        				a++;
        			}
        			System.out.print(a);
        			
        		}
        	}
        	System.out.println();
        a = 0;
        }
        
        
        
        
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld2 test = new TryHelloWorld2();
				char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}
