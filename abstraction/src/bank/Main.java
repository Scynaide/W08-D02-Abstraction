package bank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Account newAccount = new Account(1000,"Aron");

        ArrayList<String> myArrayList = new ArrayList<>();

        LinkedList<String> myLinkedList = new LinkedList<>();

        List<String> myNewArrayList = new ArrayList<>();

        var mArrList = new ArrayList<String>();

        System.out.println(mArrList.getClass());




        System.out.println(myLinkedList.size());

        System.out.println(myArrayList.size());

        Account newAccount = new CheckingAccount(10000,"Paul",100076892);

        SavingsAccount savingsAccount = new SavingsAccount(10,"John",7);


        savingsAccount.withdraw(20);

        System.out.println(savingsAccount.getBalance());

        Object name = "Hasan";

        System.out.println(name);





    }




}
