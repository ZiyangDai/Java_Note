import java.util.Arrays;
import java.util.Scanner;

//输入三个整数x,y,z, 然后由小到大输出。Arrays.sort(数组）的用法。
public class ArraysSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入x: ");
		int x = in.nextInt();
		
		System.out.println("请输入y: ");
		int y = in.nextInt();	
		
		System.out.println("请输入z: ");
		int z = in.nextInt();
		
		int[] a = {x,y,z};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
