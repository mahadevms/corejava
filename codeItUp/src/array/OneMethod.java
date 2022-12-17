package array;

public class OneMethod {

	public static void main(String[] args) {
		 int[]arr= {7,4,1,5,2,8,5,1,6};
 int[] z=OneMethod.sortAndRemove(arr);
 int[] q=OneMethod.sortAndRemove(z);

 System.out.println();
 OneMethod.sum(q);
 

}
	
	 
	 private static void sum(int[] q) {
		 int sum=0;
	for (int i = 0; i < q.length; i++) {
		sum=sum+q[i];
		
	}
	System.out.println(sum);
		
	}


	private static int[] sortAndRemove(int[]sort) {
		 for(int i = 0; i < sort.length-1; i++) {
				for (int j = 0; j < sort.length-1; j++) {
					if (sort[j]>sort[j+1]) {
						int temp=sort[j];
						sort[j]=sort[j+1];
						sort[j+1]=temp;
					}
				}
				
			}
		 System.out.println();
		 for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i]+" ");
			
		}
		 System.out.println();
		 int j=0;
			int[]temp=new int[sort.length];
			for (int i = 0; i < sort.length-1; i++) {
				if (sort[i]!=sort[i+1]) {
					temp[j]=sort[i];
					j++;
				}
			}
			temp[j]=sort[sort.length-1];
		for (int i = 0; i < j+1; i++) {
			System.out.print(temp[i]+" ");
			
		}
		return temp;
	
		}

		 
		 
		 
	}

	

