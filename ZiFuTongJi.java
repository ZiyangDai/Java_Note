//输入一行字符串（以换行符结束），要求分别统计里面英文字符个数和数字的个数，并分别输出。

import java.util.Scanner;

public class ZiFuTongJi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		 char[] arr = in.nextLine().toCharArray();
		 int str = arr.length;
		 int word = 0, num = 0;
		 
		 while (str-->0) {
			 char c = arr[arr.length-str-1];
			 if (c>='a'&c<='z' | c>='A'&c<='Z') {
				 word++;
			 }
			 else if (c>='0'&c<='9') {
				 num++;
			 }
		 }
		 System.out.println("英文字符的个数："+word);
		 System.out.println("数字字符的个数："+num);	 

	}

}
