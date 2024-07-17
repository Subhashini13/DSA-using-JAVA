package day1_Array;

public class ArrayInsertDemo {
	
	public static void insert( int[]a, int newdata, int position) {
		for(int i=a.length-1;i>position;i--) { 
			a[i]=a[i-1]; 
		}
		a[position]=newdata;
	}
	 public static void main(String[] args) {
	        
	        int[] mark= new int[8];
	        mark[0]=50;
	        mark[1]=80;
	        mark[2]=35;
	        mark[3]=45;
	        
	        ArrayInsertDemo.insert(mark, 100, 1);
       	 System.out.println("Printing the array:");

	         for(int i=0;i<mark.length;i++) {
	             System.out.print(mark[i]+" ");
	         }
	        
	    }
}
