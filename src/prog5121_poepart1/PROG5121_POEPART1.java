/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog5121_poepart1;

import java.util.Scanner;


/**
 *
 * @author Maanda Mahuwa
 */
public class PROG5121_POEPART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter your first name: ");
        String first = input.nextLine();

        System.out.print("Enter your last name: ");
        String last = input.nextLine();

        // USERNAME
        String username;
        do {
            System.out.print("Enter username: ");
            username = input.nextLine();
            login.setUsername(username);

            if (login.checkUserName()) {
                System.out.println("Username successfully captured.");
            } else {
                System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            }

        } while (!login.checkUserName());

        // PASSWORD
        String password;
        do {
            System.out.print("Enter password: ");
            password = input.nextLine();
            login.setPassword(password);

            if (login.checkPasswordComplexity()) {
                System.out.println("Password successfully captured.");
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }

        } while (!login.checkPasswordComplexity());

        // CELL PHONE
        String cell;
        do {
            System.out.print("Enter SA cell number (+27): ");
            cell = input.nextLine();
            login.setCellPhone(cell);

            if (login.checkCellPhoneNumber()) {
                System.out.println("Cell phone number successfully added.");
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }

        } while (!login.checkCellPhoneNumber());

        // REGISTER
        System.out.println("\n" + login.registerUser());

        // LOGIN
        System.out.println("\n=== LOGIN ===");

        boolean success = false;

        while (!success) {
            System.out.print("Enter username: ");
            String u = input.nextLine();

            System.out.print("Enter password: ");
            String p = input.nextLine();

            success = login.loginUser(u, p);

            System.out.println(login.returnLoginStatus(first, last, success));
        }
    }
}