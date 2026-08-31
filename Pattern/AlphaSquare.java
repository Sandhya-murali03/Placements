import java.util.*;
class AlphaSquare{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Alpha Square");
		int n=sc.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){//base pattern
				System.out.print((char)('A'+temp));//prints the A-Z.
				temp++; //incremnts the A,B,C,D....
			}
			System.out.println();
		}
	}
}