package YiYuanErCi0225; 

import java.util.Scanner;

public class YiYuanErCi {	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入整数a:");
		int a = in.nextInt();
		
		System.out.println("请输入整数b:");
		int b = in.nextInt();
		
		System.out.println("请输入整数c:");
		int c = in.nextInt();
	
		double m = b*b - 4*a*c;
		if (m>0) {
			System.out.println("有两个解。x1="+(((-b)+(Math.sqrt(m)))/(2*a))+", x2="+(((-b)-(Math.sqrt(m)))/(2*a)));
		}
		else if (m==0) {
			System.out.println("有唯一解。x="+(-b)/(2*a));
		}
		else {
			System.out.println("方程无解。");
		}
		
	}
	
}
