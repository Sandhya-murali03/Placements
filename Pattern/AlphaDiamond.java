import java.util.*;
class AlphaDiamond{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("DIAMOND ALPHABETS");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			int temp=0; //starts from 'A' each and evrry row 
			for(int j=1;j<=2*n-1;j++){// base pattern
				if(j>=n-i+1 && j<=n+i-1){//Pyramid condition
				System.out.print((char)+('A'+temp)); //primts the chracter 'A'
				temp++;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			int temp=0;
			for(int j=1;j<=2*n-1;j++){//Base pattern
				if(j<=i-1 || j>=2*n-i+1)// mixing of the right & left angle triangle
					System.out.print(" ");
				else{
					System.out.print((char)('A'+temp));//prints the alphabet from A-Z
					temp++;
				}
			}
			System.out.println();
		}
	}
}