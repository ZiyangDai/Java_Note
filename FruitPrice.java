//水果单价查询。主要关于loop的运用。

import java.util.Scanner;

public class FruitPrice {

	public static void main(String[] args) {
		boolean isLoop = true;
		Scanner in = new Scanner(System.in);
		
		System.out.println("[1] apple");
		System.out.println("[2] pear");
		System.out.println("[3] orange");
		System.out.println("[4] grape");
		System.out.println("[0] exit");
		
		while(isLoop) {
			int n = in.nextInt();
			switch(n){
			case 0:
				isLoop = false;
				break;
			case 1:
				System.out.println("price is 3.00 yuan/kg");
				break;
			case 2:
				System.out.println("price is 2.50 yuan/kg");
				break;
			case 3:
				System.out.println("price is 4.10 yuan/kg");
				break;
			case 4:
				System.out.println("price is 10.20 yuan/kg");
				break;
			default:
				System.out.println("没有出售此水果");
			}
		}

	}

}
