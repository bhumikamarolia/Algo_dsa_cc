package demo;

import java.util.HashMap;

public class InterleavingStrings {
	public static void main(String args[])
	{
		String s1="aabcc";
		String s2="dbbca";
		String s3="aadbbcbcac";
		
		HashMap<String,Boolean> h=new HashMap<>();
		boolean flag=isInterleaving(s1,s2,s3,h);
		System.out.print(flag);
	}
	 public static boolean isInterleaving(String s1, String s2, String s3, HashMap<String, Boolean> h) {	
         //base condition
		if((s1.length()+s2.length())!=s3.length())   
		return false;
		if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty())
		 return true;
		
		
		boolean first=false,second=false;
		String key=s1+"->"+s2+"->"+s3;  //for taking unique key multiplying it with a constant *
		if(!h.containsKey(key))
		{
		 if(!s1.isEmpty() && s1.charAt(0)==s3.charAt(0))
		     first=isInterleaving(s1.substring(1),s2,s3.substring(1),h); //if s1 char mathces with s3 then moving in s1
		 
		  if(!s2.isEmpty() && s2.charAt(0)==s3.charAt(0))
		     second=isInterleaving(s1,s2.substring(1),s3.substring(1),h); //if s1 char mathces with s3 then moving in s1
		
		 h.put(key,first || second);
		}
		 
			return h.get(key);
		}
}
