import models.Receipt;
import files.FileReceipt;
import services.Intros;
import services.ReceiptManagement;
import services.Notifications;

import java.util.Scanner;

public class MainReceipt {
    public static void mainReceipt() {
        ReceiptManagement receiptManagement = new ReceiptManagement();
        receiptManagement.add(new Receipt(1, "Phạm Văn Lâm", "Nguyễn Quốc Khánh", "1/11", "2/11", 100));
        receiptManagement.add(new Receipt(2, "Lê Văn Luyện", "Nguyễn Quốc Khánh", "5/11", "6/11", 100));
        receiptManagement.add(new Receipt(3, "Trần Thị Kim Cương", "Nguyễn Quốc Khánh", "5/11", "6/11", 100));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Notifications.titleReceipt();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
            switch (choice) {
                case 1:
                    receiptManagement.printList();
                    break;
                case 2:
                    receiptManagement.add(receiptManagement.create());
                    try {
                        FileReceipt.write2Receipt("fileReceipt.csv", receiptManagement.getReceiptList());
                        Notifications.alertSuccess();
                        Notifications.alertSaved();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    Notifications.alertFindId();
                    int id = scanner.nextInt();
                    Notifications.titleReceiptFormat();
                    receiptManagement.findIndexById2(id);
                    break;
                case 4:
                    Notifications.alertEditId();
                    int editInForById = scanner.nextInt();
                    boolean check = receiptManagement.booleanCheckReceiptById(editInForById);
                    if (check) {
                        receiptManagement.edit(editInForById, receiptManagement.create());
                        try {
                            FileReceipt.write2Receipt("fileReceipt.csv", receiptManagement.getReceiptList());
                            Notifications.alertSuccess();
                            Notifications.alertSaved();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("This receipt id does not exist. ");
                    }
                    break;
                case 5:
                    try {
                        FileReceipt.write2Receipt("fileReceipt.csv", receiptManagement.getReceiptList());
                        Notifications.alertSuccess();
                        Notifications.alertSaved();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        FileReceipt.read2Receipt("fileReceipt.csv");
                        Notifications.alertSuccess();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    Notifications.titleUnderLine();
                    receiptManagement.getTotalMoney();
                    break;
                case 8:
                    Notifications.alertDeleteId();
                    int deleteById = scanner.nextInt();
                    receiptManagement.delete2(deleteById);
                    try {
                        FileReceipt.write2Receipt("fileReceipt.csv", receiptManagement.getReceiptList());
                        Notifications.alertSaved();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    MainMenu.showMenu();
                    break;
                case 0:
                    Notifications.alertEnding();
                    Intros.intro3();
                    System.exit(0);
                    break;
                default:
                    Notifications.alertDefaultSwitchCase();
                    break;
            }
        }
    }
}
