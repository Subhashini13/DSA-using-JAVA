package day1_Array;

public class Try1_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[5];
		
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';

		Try1_Array.insert(arr, 3, 'J');

		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		Try1_Array.delete(arr, 3);
		System.out.println("After deletion operation ");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
