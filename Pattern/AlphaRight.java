import java.util.*;
class AlphaRight{
	public static void main(String[]args){
		System.out.println("ALPHABET RIGHT TRIANGLE");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)+('A'+temp));
				temp++;
			}
			temp=0;
			System.out.println();
		}
	}
}