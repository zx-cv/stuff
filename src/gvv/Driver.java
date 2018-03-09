package gvv;


public class Driver{



	public static void main(String[] args) {
		int[] list = {1,4,6,2,8,9,19,6,12,7,13};
		int indexfront = 0;
		int pivot = list[list.length/2];
		int indexend = list.length-1;
		int front = list[indexfront];
		int end = list[indexend];
		while(front!=end){
			if(list[indexfront]>pivot){
			int temp = end;
			end = front;
			front = temp;
			System.out.print(list[indexfront] + ", ");
			indexend--;
			indexfront++;
			}
		}
	}		
}			
	




