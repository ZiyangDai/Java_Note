//一个数恰好等于其因子之和，则称为完数。如6=1+2+3。
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("1000以内的完数有：");
		for (int i=1; i<=1000;i++) {
			int t = 0;
			for(int j=1;j<i;j++) {
				if(i%j == 0) {
					t = t + j;
				}
			}
			if(t==i) {
				System.out.println(i+ " ");
			}
		}

	}

}
