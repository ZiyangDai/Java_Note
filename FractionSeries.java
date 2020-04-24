//求一分数序列：2/1，3/2，5/3，8/5，13/8，21/13……这个数列的前20项之和。
public class FractionSeries {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		int t;
		
		double sum = 0;
		
		for (int i =1; i<=20; i++) {
			sum = sum + (double)x/y;
			t = y;
			y = x;
			x = y + t;
		}
		
		System.out.println(sum);

	}

}
