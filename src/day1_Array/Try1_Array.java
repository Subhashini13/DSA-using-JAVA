package day1_Array;

public class Try1_Array {
	public static void insert(char[] arr, int pos, char val) {
		for(int i = arr.length - 1 ;i >= pos; i--) {
			arr[i] = arr[i-1];
			
		}
		arr[pos-1] = val;
	}
	public static void delete(char[] arr, int pos) {
		for(int i = pos-1;i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1 ] = '0';
	}

}
