package com.cms;

import java.sql.SQLException;
import java.util.Scanner;

import com.loader.New_Addmission;
import com.loader.Show;



public class College_ManagementSystem {
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args) throws SQLException {
		int variable;
		do {
			System.out.println("""
					->||  XYZ college  ||<-
					Education and Trust
					press 1 to create new student id:~
					press 2 to  Show any student information:~
					press 3 to exit:~
					""");
			variable=sc.nextInt();
			System.out.println("-----------------------");
			switch(variable) {
			case 1:
				New_Addmission a=new New_Addmission();
				a.newaddmission();
				System.err.println("---NEW Student ID CREATED-----");
				break;
			case 2:
				System.out.println("Enter your student ID:");
				int p=sc.nextInt();
				Show d=new Show();
				d.showdetails(p);
				break;
			
			case 3:
				System.out.println("You have successfully logged out");
				System.out.println("THANK YOU");
				System.out.println();
				System.exit(0);
				break;
			}}
		while(variable>0 && variable <4);
	 }}			