
public class A {
public static void main(String[] args) {
	int[][]x=new int[3][4];
	System.out.println(x[2].length);//length of column
	x[0][0]=10;
	x[0][1]=20;
	x[0][2]=30;
	x[0][3]=40;
	x[1][0]=50;
	x[1][1]=60;
	x[1][2]=70;
	x[1][3]=80;
	x[2][0]=90;
	x[2][1]=100;
	x[2][2]=110;
	x[2][3]=120;
	
	for (int i = 0; i < x.length; i++) {
		for (int j = 0; j < x[0].length; j++) {
			System.out.println(x[i][j]);
		}
	}
}
}
