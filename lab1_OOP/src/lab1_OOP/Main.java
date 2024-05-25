package lab1_OOP;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int a = 10;
		int n = in.nextShort();
		int i = 1;
		while (i <= n) {
			sum += a;
			a += 3;
			i++;
		}
		System.out.println(sum);
		
		int i1 = 1;
		int sum1 = 0;
		int a1 = 10;
		do {
			sum1+=a1;
			a1+=3;
			i1++;
		}while(i1<=n);
		System.out.print(sum1);
		
		in.close();
	}

}
