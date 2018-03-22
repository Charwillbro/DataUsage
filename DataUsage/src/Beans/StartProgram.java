package Beans;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String addData = "N";
		String sentValue = "Y";
		int userId;
		double amount;

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CellPhoneUserService cellPhoneUserService = applicationContext.getBean("cellPhoneUserService",
				CellPhoneUserService.class);

		System.out.println("Amount of data in each users Account:");
		System.out.println("-------------------------------------------------------------------------------|");

		// Deduct the data usage
		cellPhoneUserService.userDataUsage(1);
		cellPhoneUserService.userDataUsage(2);

		// Display remaining data
		// user 1
		System.out.println(cellPhoneUserService.getCellPhoneUser(1).getCellUserName() + " Has "
				+ cellPhoneUserService.getCellPhoneUser(1).getData() + " MB of data remaining after using "
				+ cellPhoneUserService.getCellPhoneUser(1).getUsedData() + " MB this billing cycle.\n");
		// user 2
		System.out.println(cellPhoneUserService.getCellPhoneUser(2).getCellUserName() + " Has "
				+ cellPhoneUserService.getCellPhoneUser(2).getData() + " MB of data remaining after using "
				+ cellPhoneUserService.getCellPhoneUser(2).getUsedData() + " MB this billing cycle.\n");

		System.out.println("Would you like to add more data? If yes, type Y. If no, press Enter");
		addData = in.nextLine().toUpperCase();

		if (addData.equals("Y")) {

			while (sentValue.equals("Y")) {

				System.out.println("Which account would you like to add data to?");
				// list users
				System.out.println("**************");
				System.out.println(cellPhoneUserService.getCellPhoneUser(1).getCellUserId() + " : "
						+ cellPhoneUserService.getCellPhoneUser(1).getCellUserName());
				System.out.println(cellPhoneUserService.getCellPhoneUser(2).getCellUserId() + " : "
						+ cellPhoneUserService.getCellPhoneUser(2).getCellUserName());
				System.out.println("**************");
				System.out.println("Please enter only the account ID");
				userId = in.nextInt();
				System.out.println("How many MB of data would you like to add?");
				amount = in.nextDouble();

				// adding the data
				cellPhoneUserService.addData(userId, amount);

				System.out.println(cellPhoneUserService.getCellPhoneUser(userId).getCellUserName() + " now has "
						+ cellPhoneUserService.getCellPhoneUser(userId).getData() + "MB of data.\n");

				System.out.println("Would you like to add more data to another account?");
				System.out.println("If yes, type Y. If no, press Enter");

				in.nextLine();
				sentValue = in.nextLine().toUpperCase();

			}

		} else {
			System.out.println("You chose not to add additional data.\n");
		}
		System.out.println("Thank you for choosing Hot Air as your cell phone carrier.");
		System.out.println("Have a wonderful day!");
		applicationContext.close();
		in.close();
	}

}
