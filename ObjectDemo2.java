package myAPI;

import java.util.ArrayList;
import java.util.Objects;
/*
 * boolean equals(Object obj)
 * 		使用==来比较两个对象是否相等，比较地址值是否相等
 * 		
 * 		如果需要比较两个对象的值是否相等，则需要重写
 * 
 * 		String类的equals比较的是两个字符串序列是否相等，是因为String重写了equals方法
 */
public class ObjectDemo2 {

	public static void main(String[] args) {
		Person p = new Person("张三",18);
		Person p2 = new Person("张三",18);
		
		boolean flag = p.equals(p2);
		boolean flag2 = p.equals(new ArrayList());
		
		System.out.println(flag);
		System.out.println(flag2);
		
		System.out.println(p);
		System.out.println(p2);
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
