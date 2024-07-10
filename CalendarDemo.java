package myAPI;

import java.util.Calendar;
/*
 * Calendar:日历，提供了一些操作年月日时的方法
 * 
 * 获取
 * 修改
 * 增减
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		//修改
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 11);
		
		//增减
		c.add(Calendar.HOUR_OF_DAY, 3);
		
		//获取
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(year+"年"+month+"月"+day+"日"+hour+"点");
	}

}
