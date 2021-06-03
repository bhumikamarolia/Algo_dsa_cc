package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Bufreader {
	
	public static void main(String args[]) throws IOException
	{
		//buffered input stream
	/*InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	String name=br.readLine();
	System.out.print(name);*/
	
		//scanner class
	Scanner s=new Scanner(System.in);
	String n=s.next();
	System.out.print(n);
	s.close();
	
	}

}
