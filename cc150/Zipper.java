package com.src.cc150;
/**
 * 利用字符重复出现的次数，
 * 编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串。
 * 
 * 思路：定义两个指针遍历字符串，找寻相同字符之间的间隔 加在stringbuffer上
 */
public class Zipper {
	 public String zipString(String iniString) {
	        // write code here
	StringBuffer str=new StringBuffer();
		int low=0;
		int high=0;	
		char c=' ';
		int count=0;
		int len=iniString.length();
		while(low<len){
			high=low;
		 c=iniString.charAt(low);
			while((high<len)&&(iniString.charAt(high)==c)){//若字符相等 则加加
				high++;
			}
			count=high-low;
			str.append(c).append(count);
			low=high;
		}
		 
		return (str.toString().length() < len)?str.toString():iniString;
		 
		 
		/*	 int low = 0 , high = 0 ;
         
	        int len = iniString.length();
	         
	        StringBuilder sb = new StringBuilder();
	          
	        char c = ' ';
	          
	        int count = 0;
	         
	        while(low < len){
	            high = low;
	            c = iniString.charAt(low);
	            while((high < len)&&(iniString.charAt(high) == c)){
	                high ++;
	            }
	            count = high - low ;
	            sb.append(c);
	            sb.append(count);
	            low = high;
	        }
	         
	 
	         
	        return (sb.toString().length() < len)?sb.toString():iniString;*/
		 
	    }
	 public static void main(String[] args) {
		String str="aabcccccaaa";
		System.out.println(new Zipper().zipString(str));
	}
}
