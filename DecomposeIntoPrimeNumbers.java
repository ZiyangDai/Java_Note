//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

import java.util.Scanner;

public class DecomposeIntoPrimeNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		
		int n = in.nextInt();
		int k = 2;
		System.out.print(n+"=");
		
		while(k<=n) {
			if (k==n) {
				System.out.print(n);
				break;
			}
			else if (n % k == 0){
				System.out.print(k+"*");
				n = n/k;
			}
			else {
				k++;
			}
		}

	}

}
