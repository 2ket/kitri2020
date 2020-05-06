package ch05.object.test;

import java.util.Scanner;

class Employee{
	String name;
	public void input() {
		System.out.print("이름:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
	}
	public void output() {
		System.out.println(name);
	}
}
public class Quiz11 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}

}
