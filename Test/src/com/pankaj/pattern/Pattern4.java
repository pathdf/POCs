package com.pankaj.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int t=1;t<=testCase;t++)
		{
		    String[] arguments = br.readLine().split(" ");
		    int l = Integer.parseInt(arguments[0]);
		    int c = Integer.parseInt(arguments[1]);
		    int h = Integer.parseInt(arguments[2]);
		    int w = Integer.parseInt(arguments[3]);
		    
		    
		    for(int i=0;i<((l*h)+(l+1));i++)
		    {
		    	for(int j=0;j<((c*w)+(c+1));j++)
		    	{
		    		if(i%(h+1)==0 || j%(w+1)==0)
		    		System.out.print("*");
		    		else
		    			System.out.print(".");
		    	}
		    	System.out.println();
		    }
			
		}
	

	}

}
