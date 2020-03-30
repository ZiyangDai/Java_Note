//求s=a+aa+aaa+aaaa... 的值，其中a是一个数字。如2+22+222+2222+22222（此时项数为5），项数由输入者控制。
import java.util.Scanner;

public class LeiJia {

	public static void main(String[] args) {
		int a, b = 0, i = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入整数值：");
		a = in.nextInt();
		System.out.println("请输入项数：");
		int n = in.nextInt();
		
		while(i<n) {
			b = b + a;
			sum = sum + b;
			a = a*10;
			i++;
		}
		
		System.out.println(sum);

	}

}
