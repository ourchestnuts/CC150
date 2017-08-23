package com.src.cc150;
/**
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。
 * 假定该字符串有足够的空间存放新增的字符，
 * 并且知道字符串的真实长度(小于等于1000)，
 * 同时保证字符串由大小写的英文字母组成。
 */
public class Replacement {
	public String replaceSpace(String iniString, int length) {
		// write code here
		if(iniString==null)
			return null;
		StringBuffer str=new StringBuffer();
		for(int i=0;i<length;i++){
			char c=iniString.charAt(i);
			if(c==' '){
				str.append("%20");
			}else{
				str.append(c);
			}		
		}
		
		return str.toString();
	}
	public static void main(String[] args) {
		String str="Mr John Smith ";
				//返回："Mr%20John%20Smith"
		String str2="Hello  World";
		System.out.println(new Replacement().replaceSpace(str, str.length()));
		System.out.println(new Replacement().replaceSpace(str2, str2.length()));
		
	}
}
