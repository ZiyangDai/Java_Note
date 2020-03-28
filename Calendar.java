package Calendar;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入年份：");
		int year = in.nextInt();
		
		System.out.println("请输入月份：");
		int month = in.nextInt();
		
		
	        Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		//Java里，月是从0-11算的，天又是正常的……
		int TotalDay = c.getActualMaximum(Calendar.DATE);
		//获取这个月日期的最大值.
		System.out.println("周日放前面的日历用get，代表周日是第"+ c.get(Calendar.DAY_OF_WEEK)+"天");
		System.out.println("周一放前面的日历不用get，代表周日是第" + Calendar.DAY_OF_WEEK +"天");
		
		System.out.println("-----------------------------");
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < Calendar.DAY_OF_WEEK; i++)
		System.out.print("    ");
		for (int i = 1; i <= TotalDay; i++) {
			c.set(year, month-1, i);
			System.out.printf("%4d", i);
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                System.out.println("");
			//遇到周日换行。
		} 
	}
