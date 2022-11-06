package com.Student;

import java.util.Scanner;

import com.menu.AllStudentScore;
import com.menu.DisplayById;
import com.menu.FirstMenu;
import com.menu.MainMenu;

public class StudentInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String in = "y";
		while (in.equals("y")) {
			MainMenu mainmenu = new MainMenu();
			int choice = mainmenu.getChoice();
			if (choice == 1) {
				new FirstMenu();// First menu Attend the quiz
				System.out.println(
						"____________________________________________________________________________________________________");

			} else if (choice == 2) {// second menu see all student record
				System.out.println("---------Student Data----------");
				AllStudentScore method = new AllStudentScore();
				method.displayStudentScore();
				System.out.println(
						"____________________________________________________________________________________________________");
			} else if (choice == 3)// Third menu See records by id
			{
				System.out.println();
				System.out.print("Enter the ID: ");
				int input = sc.nextInt();
				new DisplayById(input);
				System.out.println(
						"____________________________________________________________________________________________________");

			} else if (choice == 4) {
				System.out.println("----------Exit Quiz Thank You Visit Again--------");
				System.exit(0);
			} else {
				System.out.println("Wrong Option Selected");
			}
			System.out.println();
			System.out.print("-----------Do you Want to continue Quiz menu type(y/n): ");
			in = sc.next();

		}
		System.out.println("----------Exit Quiz Thanku Visit Again--------");
		sc.close();
	}

}
