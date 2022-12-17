package array;

public class FrequencyOfEachElements {

		    public static void main(String[] args) {  
		    	int[]arr= {1,2,3,4,2,3,4,5,6,9,9,9,9,9,9,9};
		    	int []temp= {1,2,3,4,5,6,7,9};
		    	System.out.println("------- |------------------ |");
				System.out.println("number |"+" times repeated    |");
		    	for (int j = 0; j < temp.length; j++) {
		    		int key=temp[j];
		    		int count=0;
				for (int i = 0; i < arr.length; i++) {
					if (key==arr[i]) {
						 count = count+1;
					}
				}
				System.out.println("---------------------------|");
				System.out.println(key+"     |      "+count);
		    		
		    		
		    		
		    		
		    		
		    		
				}
				
			
					
					
				}
		    }
		        	


