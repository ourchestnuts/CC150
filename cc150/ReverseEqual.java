package com.src.cc150;
/**
 * 检查一个单词是否为其他字符串的子串。
给定两个字符串s1和s2，请编写代码返回bool值检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。
字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000。

思路：S2是由s1旋转而成  则s2一定是 s1+s1的字串
 */
public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
    	if(s1==null){
    		return false;
    	}
    	if(s2==null){
    		return true;
    	}
    	String se=s1+s1;
    	
		return se.contains(s2);
    }
    public static void main(String[] args) {
		String s1=null;
		String s2=null;
		System.out.println(new ReverseEqual().checkReverseEqual(s1, s2));
	}
}
