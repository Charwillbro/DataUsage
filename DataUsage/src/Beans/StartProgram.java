package Beans;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.CellPhoneUser;

public class StartProgram {
	static CellPhoneUserHelper cuh = new CellPhoneUserHelper();
	static Scanner in = new Scanner(System.in);
	static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			BeanConfiguration.class);
	static CellPhoneUserService cellPhoneUserService = applicationContext.getBean("cellPhoneUserService",
			CellPhoneUserService.class);

	public static void main(String[] args) {
		runMenu();
		System.out.println("Thank you for choosing Hot Air as your cell phone carrier.");
		System.out.println(" ");
		System.out.println("Have a wonderful day!");
		System.out.println(" ");
		applicationContext.close();
		in.close();
	}

	private static void addAUser() {

		System.out.print("Enter the User Name ");
		String cellUserName = in.nextLine();
		System.out.print("Enter the amount of data available to the account in MB ");
		double data = in.nextDouble();

		CellPhoneUser toAdd = new CellPhoneUser(data, cellUserName);
		cuh.insertItem(toAdd);

	}

	private static void updateData() {
		int userId;
		double amount;

		System.out.println("Which account would you like to add data to?");
		System.out.println("--------------------------------------------");
		cuh.getList();
		System.out.println("Please enter only the account ID");
		userId = in.nextInt();
		System.out.println("How many MB of data would you like to add?");
		amount = in.nextDouble();
		cuh.update(userId, amount);
	}

	private static void updateDataUsage() {
		int userId;
		double amount;

		System.out.println("Which account would you like to report data Usage on?");
		System.out.println("-----------------------------------------------------");
		cuh.getList();
		System.out.println("Please enter only the account ID");
		userId = in.nextInt();
		System.out.println("How many MB of data would you like to report?");
		amount = in.nextDouble();
		// to get the inverse of the number entered
		double negAmount = amount - amount - amount;
		cuh.update(userId, negAmount);
	}

	private static void deleteUser() {
		int userId;
		System.out.println("Which account would you like to delete?");
		System.out.println("---------------------------------------");
		cuh.getList();
		System.out.println("Please enter only the account ID");
		userId = in.nextInt();
		cuh.remove(userId);
	}

	public static void viewTheList() {
		cuh.getList();
	}

	public static void runMenu() {

		boolean goAgain = true;
		System.out.println("--- User Account Maintenance Menu ---");
		while (goAgain) {
			System.out.println("*  Select an option below");
			System.out.println("*************************");
			System.out.println("*  1 -- Add a new User");
			System.out.println("*  2 -- Add Data to an Account");
			System.out.println("*  3 -- Record data Usage");
			System.out.println("*  4 -- Delete an User");
			System.out.println("*  5 -- View the list");
			System.out.println("*  6 -- Exit the maintenance Program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addAUser();
			} else if (selection == 2) {
				updateData();
			} else if (selection == 4) {
				deleteUser();
			} else if (selection == 5) {
				viewTheList();
			} else if (selection == 3) {
				updateDataUsage();
			} else {

				System.out.println("   Goodbye!   ");
				goAgain = false;
			}

		}

	}

}
