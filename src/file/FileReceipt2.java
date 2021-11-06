package file;

import models.Receipt;
import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReceipt2 {
    public static void fireWrite2(String patch, List<Receipt> roomList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(patch);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(roomList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Receipt> readData2(String patch) {
        List<Receipt> receiptList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(patch);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            receiptList = (List<Receipt>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Receipt receipt : receiptList) {
            System.out.println(receipt);
        }
        return null;
    }
}
