import java.util.Scanner;

public class DrawRhombus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入半径: ");
		int size = in.nextInt();
		
		//上半菱形：
		for (int i=1; i <= size; i++) {
			//每行的空格数=半径-行。
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			
			//*的个数与行的关系
			for (int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//下半菱形：
		for (int i = 1; i <= size-1; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(" ");
			}
			
			for (int k = 2*size-3; k >= 2 * i - 1; k--){
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
