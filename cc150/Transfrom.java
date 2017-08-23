package com.src.cc150;
/**
 * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，
 * 请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
 */
public class Transfrom {
    public int[][] transformImage(int[][] mat, int n) {
		//先上下翻转
    	for(int i=0,j=n-1;i<j;i++,j--){//行
    		for(int m=0;m<n;m++){
    			int temp=mat[i][m];
    			mat[i][m]=mat[j][m];
    			mat[j][m]=temp;
    		}
    	}
    	//沿主对角线翻转
    	for(int i=0;i<n;i++){//行
    		for(int m=0;m<n;m++){
    			if(m<i){
    			int temp=mat[i][m];
    			mat[i][m]=mat[m][i];
    			mat[m][i]=temp;
    			}
    		}
    	}
    	
    	
    	return mat;
    }
    public static void main(String[] args) {
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		mat=new Transfrom().transformImage(mat, 3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}