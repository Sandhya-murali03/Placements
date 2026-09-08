import java.util.*;
class Diamond{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("DIAMOND PATTERN");
		int n=sc.nextInt();
		//pyramid
		for(int i=1;i<n;i++){
			for(int j=1;j<=2*n-1;j++){
				if(j>=n-i+1 && j<=n+i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//inverse pyramid
		for(int i=1;i<=n;i++){
			for(int j=1;j<=2*n-1;j++){
				if(j<=i-1 || j>=2*n-i+1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	}