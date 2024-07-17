package day1_Array;

public class ArrayDeleteDemo {
	public static void deleteData(int[]a,int position) {
        System.out.println("The deleted element is:"+a[position]);
        
        for(int i=position;i<a.length-1;i++) { // i=1 1<9 i=2 2<9 ......i=8 8<9 i=9 9<9
            a[i]=a[i+1];                        //a[1]=a[2];
                                                //a[2]=a[3]
                                                //a[8]=a[9]
            
        }
        
    }
     public static void display(int [] a) {
         for(int i=0;i<a.length;i++) {
             System.out.print(a[i] + " ");
         }
         System.out.println("\n");
     }
public static int search (int []a,int SearchKey) { //45
         
         for(int i=0; i<a.length;i++) {      //0<10 1<10 2<10 3<10
             if(a[i]==SearchKey) { //50==45 ,80==45, 35==45 45==45
                 return i; 
             }
         }
         
         return -1;
     }

     
     public static void main(String[] args) {
    	   int[] mark= new int[10];
           mark[0]=50;
           mark[1]=80;
           mark[2]=35;
           mark[3]=45;
      	 System.out.println("Displaying array before deletion");
         ArrayDeleteDemo.display(mark);

           ArrayDeleteDemo.deleteData(mark, 1);
      	 System.out.println("Displaying array after deletion");

           ArrayDeleteDemo.display(mark);
           System.out.println("The element is present at :"+  ArrayDeleteDemo.search(mark, 50));

     }


}
