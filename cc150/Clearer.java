package com.src.cc150;
/**
 *请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。 
 *遍历整个数组  一旦元素等于零 就通过清零函数 将该元素所在行和列都清零  这种想法是错误的，因为这样使没有遍历的元素也变成零；会将整个数组都变成零
 *
 *正确思路 确定元素为零后 记住这个元素的行和咧，遍历完成后 一起清零
 */
public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
    	if(mat==null)
    		return mat;
    	boolean[] row=new boolean[n];
    	boolean[] column=new boolean[n];
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(mat[i][j]==0){
    				row[i]=true;
    				column[j]=true;
    			}
    		}
    		System.out.println();
    	}
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(row[i]||column[j]){
    				mat[i][j]=0;
    			}
    		}
    	}
		return mat;
    }

	public static void main(String[] args) {
		int[][] mat={{1,0,3},{4,5,0},{7,8,9}};
		mat=new Clearer().clearZero(mat, 3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
