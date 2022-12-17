package array;


//max and min salary
public class Practice {
	public static void main(String[] args) {
		int []arr= {10,20,100,10,30,80,90,100,50,0,90,80,0,100,50,40,70,70};
		Practice.sort(arr);
	}

	private static void sort(int[] q) {
		
		for (int i = 0; i < q.length-1; i++) {
			for (int j = 0; j < q.length-1; j++) {
				if (q[j]>q[j+1]) {
					int c=q[j];
					q[j]=q[j+1];
					q[j+1]=c;
				}
			}
		}
		System.out.println("sorted array");
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i]+" ");
			}
		
		
	int	temp[]=new int[q.length];
	int j=0;
		for (int i = 0; i < q.length-1; i++) {
			if (q[i]!=q[i+1]) {
				temp[j]=q[i];
				j++;
				
				}
			}
		temp[j]=q[q.length-1];
		
		System.out.println("\nremoved duplicate elements");
		for (int k = 0; k <=j; k++) {//temporary
			System.out.print(temp[k]+" ");
		}
		System.out.println("\nmax value="+temp[j]);
		System.out.println("second max value="+temp[j-1]);
		System.out.println("min value="+temp[0]);
		System.out.println("second min value="+temp[1]);
		

	}	
		
	}
	
