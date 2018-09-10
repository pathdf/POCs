package com.pankaj.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern3 {
	
	public static void main(String[] args) throws  IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int t=1;t<=testCase;t++)
		{
		    String[] arguments = br.readLine().split(" ");
		    int n1 = Integer.parseInt(arguments[0]);
		    int n2 = Integer.parseInt(arguments[1]);
		    
		    for(int i=0;i<n1*3+1;i++)
		    {
		    	for(int j=0;j<n2*3+1;j++)
		    	{
		    		if(i%3==0 || j%3==0)
		    		System.out.print("*");
		    		else
		    			System.out.print(".");
		    	}
		    	System.out.println();
		    }
			
		}
	}

}
