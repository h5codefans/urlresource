package cn.bjsxt.array2;

/**
 * 打印指定矩阵
 * @author Administrator
 *
 */
public class Matrix {
	
	public static void print(int[][] c){
	   	 //打印矩阵
	   	 for(int i=0;i<c.length;i++){
	   		 for(int j=0;j<c.length;j++){
	   			 System.out.print(c[i][j]+"\t");
	   		 }
	   		 System.out.println();
	   	 }
	}
	/**
	 * 矩阵加法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][] a,int[][] b){
	   	 int[][] c=new int[a.length][a[0].length];
	   	 for(int i=0;i<c.length;i++){
	   		 for(int j=0;j<c.length;j++){
	   			 c[i][j]=a[i][j]+b[i][j];
	   		 }
	   	 }
	   	 return c;
	}
     public static void main(String[] args){
    	 int[][] a={
    			  {1,3,3},
    			  {2,4,3},
    			  {3,5,3}
    	         };
    	 int[][] b={
    			   {3,4,3},
    			   {5,6,6},
    			   {4,6,7}
    	          };
         int[][] c=add(a,b);
         print(c);
    	 
     }
   
}
