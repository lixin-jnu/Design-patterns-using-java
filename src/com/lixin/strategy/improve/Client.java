package com.lixin.strategy.improve;

import java.util.Arrays;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        System.out.println("------");
        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        System.out.println("------");
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        System.out.println("------");
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.display();
        System.out.println("------");
        Integer nums[] = new Integer[]{4, 5, 1, 2, 8, 0};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Arrays.sort(nums, comparator);
        System.out.println(Arrays.toString(nums));
        Integer nums2[] = new Integer[]{4, 5, 1, 2, 8, 0};
        Arrays.sort(nums2, (var1, var2) -> {
            if (var1 > var2) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(nums2));
    }

}