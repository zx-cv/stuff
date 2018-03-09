package gvv.copy.copy;



public class Driver{



	public static void main(String[] args) {
		
	int[] list = new int[5];
		for(int b=0;b<=4;b++){
		double a = 20*Math.random()+1;
		int ab = (int)(a);
		list[b] = ab;
		}
		int large = list[0];
		for(int c=0;c<=4;c++){
			if(large<list[c+1]){
				large = list[c+1];
			}
			else{
				c++;
			}
		}
		System.out.println(large);
	}		
}		
	




