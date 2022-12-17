 package array;

public class MaxMin2 {

	public static void main(String[] args) {
int[]X= {10,20,10,100,200,500,500,500,20,30,45,70,70,80,80,80};
MaxMin2.fin(X);
	}

	private static void fin(int[] Y) {
for (int i = 0; i < Y.length-1; i++) {
	for (int j = 0; j < Y.length-1; j++) {
		if (Y[j]>Y[j+1]) {
			int temp=Y[j];
			Y[j]=Y[j+1];
			Y[j+1]=temp;
			
		}
	}
}
int k=0;
	for (int i = 0; i < Y.length-1; i++) {
		if (Y[i]!=Y[i+1]) {
			Y[k++]=Y[i];
		}
	}	
	Y[k]=Y[Y.length-1];
	System.out.println("new array:  ");
	for (int i = 0; i>k+1; i++) {
		System.out.println(Y[i]);
		
	}
		
		
	}

}
