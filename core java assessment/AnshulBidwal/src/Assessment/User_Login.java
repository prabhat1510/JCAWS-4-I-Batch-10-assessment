package Assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class User_Login {

	public static void main(String[] args) {
	  try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter UserName :- ");
		  String username = sc.nextLine();
		  System.out.println("Enter Password :- ");
		  String password = sc.nextLine();

		  System.out.println("Username : " + username);
		  System.out.println("password : " + password);


			     Connection c = null;
			      try {
			         Class.forName("org.postgresql.Driver");
			         c = DriverManager
								.getConnection("jdbc:postgresql://localhost:5432/user_info",
										"postgres", "Bhayyu28");
			      } catch (Exception e) {
			         e.printStackTrace();
			         System.err.println(e.getClass().getName()+": "+e.getMessage());
						System.exit(0);
					}
					System.out.println("Opened database successfully");
				}
			}
		}

