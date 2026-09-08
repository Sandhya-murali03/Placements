import java.util.*;

class FlyodTriangle {
    public static void main(String[] args) {
		System.out.println("FLYOD TRIANGLE");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++) {
				System.out.print(num+" ");
				num++;
            }
            System.out.println();
        }
    }
}
/*
1) use rught trinagle ->j<=i
2) num=1, -> num++ inside the condition
3) print(num) value -> 1,2,3,4...
*/