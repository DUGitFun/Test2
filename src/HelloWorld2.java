import java.util.Date;
import java.util.*;
import java.text.*;

public class HelloWorld2 {
	
	public static void main(String []args) {
		
		String hello = "hello";
		String world = "WoRlD";
		int one = 2;
		int two = 2;
		int  [] num = {1,2,3,4,5};
		String greet = new String();
		greet = "MEOW";
		
		System.out.println("Hello World");
		System.out.println(hello.toUpperCase() + " " + world.toLowerCase());
		System.out.println(greet);
		System.out.print(greet.length());
		System.out.print(hello.replace('l', 't'));
		
		int add = add(one,two);
		System.out.println(add);
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(date.toString());
		System.out.println(ft.format(date));
		//String testDate = "2018-6-18";
		//Date t = ft.parse(testDate);
		//System.out.println(t);
		
		
		for(int x : num) {
			System.out.println(x);;
		}
		
		if (add == 4 || add == 3) {
			if (add == 3) {
				System.out.print("The number is 3!");
			}
			else {
				System.out.print("Wrong answer");
			}
		}	
		System.out.println("ARRAY");
		array(num);
		
		int age = 5;
		String name = "Benji";
		//Dog(age, name);
		
	}
	
	public static int add (int one, int two) {
		int result = one + two;
		return result;
	}	
	
	public static void array(int[] array) {
		for(int x : array) {
			System.out.print(x);
		}
	}
	
	public class Dog {
		int age;
		String name;
		
		Dog(int age, String name){
			age = age;
			name = name;
		}
	}
}

