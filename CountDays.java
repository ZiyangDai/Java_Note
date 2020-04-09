import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

// 输入某年某月某日，判断这一天是这一年的第几天?
public class CountDays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入年份：");
		int year = in.nextInt();
		
		System.out.println("请输入月份：");
		int month = in.nextInt();
		
		System.out.println("请输入天：");
		int day = in.nextInt();
		

		
		Calendar c = Calendar.getInstance();
		int Total = 0;
		for(int x = 0;x< month;x++) {
		c.set(year, month-1-x, 1);
		//Java里，月是从0-11算的，天又是正常的
		int ThisMonth = c.getActualMaximum(Calendar.DATE);
		Total+= ThisMonth;
		}
		c.set(year, month-1, 1);
		Total-= c.getActualMaximum(Calendar.DATE) - day;
		System.out.println(Total);

	}

}
