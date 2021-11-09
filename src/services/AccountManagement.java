package services;

import models.Account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountManagement implements Management<Account>, Serializable {
    private List<Account> accountList = new ArrayList<>();

    public AccountManagement(List<Account> accountList) {
        this.accountList = accountList;
    }

    public AccountManagement() {
        accountList = new ArrayList<>();
    }

    public List<Account> getAdminList() {
        return accountList;
    }

    public void setAdminList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void add(Account account) {
        accountList.add(account);

    }

    @Override
    public void edit(int id, Account account) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    public int findUserAndPass2(String user, String pass) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user) && accountList.get(i).getPassWord().equals(pass)) {

                return i;
            }
        }
        return -1;
    }

    public String findPass(String pass) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getPassWord().equals(pass)) {
                return accountList.get(i).getPassWord();
            }
        }
        return null;
    }

    public String findUser(String user) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user)) {
                return accountList.get(i).getUseName();
            }
        }
        return null;
    }

    public boolean findUserAndPass(String user, String pass) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user) && accountList.get(i).getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        Notifications.titleAdminFormat();
        for (Account account : accountList) {
            System.out.println(account);

        }
    }
}