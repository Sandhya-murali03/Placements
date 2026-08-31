import java.util.*;
class CheckerBoard{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("CHECKER BOARD");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){//base pattern
			for(int j=1;j<=n;j++){//base pattern
				if((i + j) % 2 == 0){
					System.out.print("A ");
				}
				else{
					System.out.print("B ");
				}
			}
			System.out.println();
		}
	}
}