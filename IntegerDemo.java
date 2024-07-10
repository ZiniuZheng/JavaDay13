package myAPI;
/*
 * 需求：判断一个数是否符合int类型的范围
 * 由于基本数据类型只能做一些简单的操作和运算，所以Java为我们封装了基本数据类型，为每种基本数据类型提供了包装类
 * 包装类就是封装了基本数据类型的类，为我们提供了更多复杂的方法和一些变量
 * 
 * byte Byte
 * short short
 * char Character
 * int Integer
 * long Long
 * float Float
 * double Double
 * boolean Boolean
 * 
 * Integer:
 * 		String --- int
 * 			方式1: int intValue()
 * 			方式2: static int parseInt(String s)
 * 		int --- String
 * 			方式1: + ""
 * 			方式2: String toString()
 * 
 * 构造方法：
 * 		Integer(int value)
 * 		Integer(String s)
 */
public class IntegerDemo {

	public static void main(String[] args) {
		/**
		 * 找int最大值
		 */
		int n = 1;
		for(int i=0;i<31;i++) {
			n *= 2;
		}
		n--; //方法1
		
		int n2 = (int)(Math.pow(2,31)-1); //方法2
		
		int n3 = Integer.MAX_VALUE; //方法3
		
		int n4 = Integer.MIN_VALUE;
		
		System.out.println(n);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		/**
		 * String 转换为 int
		 */
		String n5 = "10";
		
		Integer i = new Integer(n5); //方法1
		System.out.println(i);
		
		Integer a = Integer.parseInt(n5); //方法2
		System.out.println(a);
		int b = a.intValue();
		System.out.println(b);
		
		/**
		 * int 转换为 String
		 */
		String c = 1 + ""; //方法1
		
		String d = a.toString(); //方法2
		System.out.println(d);
		
		String e = Integer.toString(10);
		System.out.println(e);
	}

}
