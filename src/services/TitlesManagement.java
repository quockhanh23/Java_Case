package services;

public class TitlesManagement {
    public static void titleLogin() {
        System.out.println("___________________________________");
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("Select number 1, if your already have an account: ");
        System.out.println("Select number 2, if your don't have account: ");
        System.out.println("1. Login --> (khanh - 123). ");
        System.out.println("2. Register. ");
        System.out.println("0. End program. ");
    }

    public static void titleSelectManagement() {
        System.out.println("___________________________________");
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("My name is John Khánh Wick. Please follow me!. ");
        System.out.println("Select number: ");
        System.out.println("1. Admin manager. ");
        System.out.println("2. Room manager. ");
        System.out.println("3. Receipt manager. ");
        System.out.println("4. Back to login. ");
        System.out.println("0. End program. ");
    }

    public static void titleRoom() {
        System.out.println("___________________________________");
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("My name is John Khánh Wick. Please follow me!. ");
        System.out.println("Select number: ");
        System.out.println("1. Print list rooms. ");
        System.out.println("2. Add room. ");
        System.out.println("3. Edit info room. ");
        System.out.println("4. Check room. ");
        System.out.println("5. Find the room by id. ");
        System.out.println("6. Find the room by price. ");
        System.out.println("7. write file. ");
        System.out.println("8. Print file. ");
        System.out.println("9. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void titleReceipt() {
        System.out.println("___________________________________");
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("My name is John Khánh Wick. Please follow me!. ");
        System.out.println("Select numbers: ");
        System.out.println("1. Print the list receipt. ");
        System.out.println("2. Add receipt. ");
        System.out.println("3. Edit receipt. ");
        System.out.println("4. Write file. ");
        System.out.println("5. Read file. ");
        System.out.println("6. Total money. ");
        System.out.println("7. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void titleAdmin() {
        System.out.println("___________________________________");
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("My name is John Khánh Wick. Please follow me!. ");
        System.out.println("Select number: ");
        System.out.println("1. Print the list admin. ");
        System.out.println("2. Add admin. ");
        System.out.println("3. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void titleTryCatch() {
        System.err.println("Wrong input!. ");
        System.out.println("___________________________________");
    }

    public static void titleDefault() {
        System.out.println("This option is not available. ");
        System.out.println("___________________________________");
    }

    public static void wellCome() {
        System.out.println("Wellcome to The Continental hotel!. ");
    }
}