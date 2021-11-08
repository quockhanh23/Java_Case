import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MenuLogIn {
    public static void logIn() {
        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Intros.intro1();
                Intros.intro2();
                Notifications.titleLogin();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAccount.account();
                    case 2 -> {
                        MainAccount.creat();
                        Notifications.alertSuccess();
                        MenuMain.showMenu();
                    }
                    case 0 -> {
                        Notifications.alertEnding();
                        Intros.intro3();
                        System.exit(0);
                    }
                    default -> Notifications.alertDefaultSwitchCase();
                }
            } catch (Exception e) {
                System.err.println("Please choice 1 or 2. ");
                Notifications.alertTryCatch();
            }
        }
    }
}
