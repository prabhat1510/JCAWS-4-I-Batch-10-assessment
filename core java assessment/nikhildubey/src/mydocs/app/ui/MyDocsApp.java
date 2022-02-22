package mydocs.app.ui;

import java.util.Scanner;

import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.exceptions.UserNotAdminException;
import mydocs.app.exceptions.UserNotFoundException;
//import mydocs.app.services.UserServices;
import mydocs.app.services.UserServicesImpl;

public class MyDocsApp {

	public static void main(String[] args) {

		boolean login;
		Integer resp = 1;

		Scanner sc = new Scanner(System.in);

		MyDocsOps ops = new MyDocsOpsImpl();

		login = ops.login();

		while (resp != 0) {

			System.out.println("Press 1 to GetAll User 0 to exit.");
			resp = sc.nextInt();

			if (login) {
				switch (resp) {
				case 1:
					ops.getAllUser();
					break;
				}
				
				
			}
		}

	}

}
