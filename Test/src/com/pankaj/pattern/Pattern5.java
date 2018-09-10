package com.pankaj.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern5 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int t=1;t<=testCase;t++)
		{
		    String[] arguments = br.readLine().split(" ");
		    int n1 = Integer.parseInt(arguments[0]);
		    int n2 = Integer.parseInt(arguments[1]);
		    int s = Integer.parseInt(arguments[2]);
		    
		    for(int i=0;i < ((n1*s)+(n1+1)) ;i++)
		    {
		    	for(int j=0;j < ((n2*s)+(n2+1)) ;j++)
		    	{
		    		if(i%(s+1)==0 || j%(s+1)==0)
		    		System.out.print("*");
		    		else if((i+j)%((s+1)*2)==0)
		    			System.out.print("/");
		    		else if((i+j)%2!=0)
		    			System.out.print(".");
		    		else if((i+j)%((s+1)*2)!=0)
		    			System.out.print("\\");
		    	
		    		
		    			
		    	}
		    	System.out.println();
		    }
			
		}
	

	}

}
