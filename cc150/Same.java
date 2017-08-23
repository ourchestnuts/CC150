package com.src.cc150;

import java.util.Arrays;

/**
 *给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *这里规定大小写为不同字符，且考虑字符串重点空格。
	给定一个string stringA和一个string stringB，
	请返回一个bool，代表两串是否重新排列后可相同。
  	保证两串的长度都小于等于5000。 
  	
  	思路1：//先判断大小是否相同。不同则直接返回false
//相同，则使用两个大小为256的散列表，通过一次遍历找到每一个字符出现的次数
//再遍历hashTable来判断每一个字符出现的次数是否相同。一旦某个字符出现不同次数
//直接返回false  全部相同返回true
 * 
 * 思路2；先转成字符数组
 * 对字符数组进行排序
 * 排序后的结果相同 则说明相同
 */
public class Same {
	public boolean checkSam(String stringA, String stringB) {
		if(stringA.length()!=stringB.length())
			return false;
		else{
			char[] a=stringA.toCharArray();
			char[] b=stringB.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a, b);
					
		}
    }
	public static void main(String[] args) {
		String s="This is nowcoder";
		String q="is This nowcoder";
		
		System.out.println(new Same().checkSam(s, q));
	}
}
