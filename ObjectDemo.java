package myAPI;
/*
 * String toString():返回该对象的字符串表示
 * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 		getClass():返回一个字节码对象
 * 		Integer.toHexString():返回指定参数的十六进制字符串形式
 * 		hashCode():返回该对象的哈希码值（内部地址）
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.age = 18;
		System.out.println(s.toString()); //myAPI.Student@49e4cb85
		System.out.println(s); //说明我们输出一个对象就是默认输出这个对象的toString()方法
	}
}

class Student{
	String name;
	int age;
	//我们可以用source -> Generate toString()... 重写toString()方法
	@Override
	public String toString() {
		return "Student [name = " + name + ", age = " + age + "]";
	}
}
