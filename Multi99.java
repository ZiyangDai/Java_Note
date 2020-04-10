//输出9*9乘法表
public class Multi99 {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + " ");
				//调整格式以保持对齐，当结果为个位数则再多打一个空格。
				if (j*i<10) {
					System.out.print(" ");
				}
			}
			//随i的变化换行。
			System.out.println();
		}
	}

}
