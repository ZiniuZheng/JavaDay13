package myAPI;

import java.util.ArrayList;
/*
 * JDK1.5特性：自动装箱和拆箱
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		//自动装箱
		//相当于：Integer i = new Integer(10);
		Integer i = 10;
		
		//自动拆箱
		//相当于：int a = i.intValue();
		int a = i;
		
		//自动装箱
		Integer i1 = 10;
		//自动装箱
		Integer i2 = 20;
		//先自动拆箱，再自动装箱
		//相当于：Integer i3 = new Integer(i1.intValue() + i2.intValue());
		Integer i3 = i1 + i2;
		System.out.println(i3);
		
		ArrayList list = new ArrayList();
		list.add(1); //自动装箱，list.add(new Integer(1));
		System.out.println(list);
	}

}
