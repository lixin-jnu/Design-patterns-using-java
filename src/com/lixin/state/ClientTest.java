package com.lixin.state;

public class ClientTest {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("--------µÚ" + (i + 1) + "´Î³é½±--------");
            activity.deductMoney();
            activity.raffle();
        }
    }

}