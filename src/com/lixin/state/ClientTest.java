package com.lixin.state;

public class ClientTest {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("--------��" + (i + 1) + "�γ齱--------");
            activity.deductMoney();
            activity.raffle();
        }
    }

}