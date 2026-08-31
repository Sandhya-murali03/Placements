import java.util.*;
class CenteredPyramid{
	public static void main(String[]args){
		System.out.println("Centred pyramid");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int num	=1;
			for(int j=1;j<=2*n-1;j++){
				if(j>=n-i+1 && j<=n+i-1){
					System.out.print(num); 
					num++;// prints the number -> 1,2,3,4...
				}
				else
					System.out.print(" ");
			}
			System.out.println();//next line
		}
	}
}