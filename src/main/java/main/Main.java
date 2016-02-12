package main;

import java.text.SimpleDateFormat;

import entities.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\main\\resources\\applicationContext.xml");

		Product p1 = (Product) context.getBean("product1");
		System.out.println("Id : " + p1.getId());
		System.out.println("Name : " + p1.getName());
		System.out.println("Price : " + p1.getPrice());
		System.out.println("Category : " + p1.getCategory().getName());
		System.out.println("Colors :");
		for (String c : p1.getColors()) {
			System.out.print(c + ",");

		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Creation date : "
				+ sdf.format(p1.getCreationDate()));
		System.out.println("\n ################################");

		Product p2 = (Product) context.getBean("product2");
		System.out.println("Id : " + p2.getId());
		System.out.println("Name : " + p2.getName());
		System.out.println("Price : " + p2.getPrice());

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Creation date : "
				+ sdf2.format(p2.getCreationDate()));

		System.out.println("################################");
		Employee e1 = (Employee) context.getBean("employee1");
		System.out.println("Id : " + e1.getId());
		System.out.println("Name : " + e1.getName());
		System.out.println("Gender : " + e1.getGender());
		System.out.println("Salary : " + e1.getSalary());
	}
}
