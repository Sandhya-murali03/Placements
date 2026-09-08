import java.util.*;
class HollowAlpha{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("HOLLOW ALPHABET");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int temp=0; //starts from 'A' each and evrry row 
			for(int j=1;j<=2*n-1;j++){// base pattern
				if(j>=n-i+1 && j<=n+i-1){
					if(j==n-i+1 || i==1 ||j==n+i-1 || i==n){//Pyramid condition
						System.out.print((char)+('A'+temp)); //primts the chracter 'A'
						temp++;
					}
					else{
						System.out.print(" ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}