import java.util.*;
class HollowDiamond{
	public static void main(String[]args){
		System.out.println("HOLLOW DIAMOND PATTERN");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//pyramid
		for(int i=1;i<=n;i++){
			for(int j=1;j<=2*n-1;j++){ //Base Pattern
				if(j>=n-i+1 && j<=n+i-1){
					if(i==1 || j==n-i+1 || j==n+i-1) // Hollow pyramid
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//INVERTED PYRAMID
		for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= 2*n-1; j++) {

                if(j >= i && j <= 2*n-i) {

                    if(i == n || j == i || j == 2*n-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
}


