package com.bridgelabz.gambler;

public class GamblingSimulation {
    static int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        resignDayCheck();
    }

    static int winLossCheck() {
        int random = (int) (Math.random() * 10) % 2;
        if (random == win) {
            return 1;
        } else {
            return -1;
        }
    }

    static void resignDayCheck() {
        int totalWinnigAmount = 0;
        for (int day = 1; day <= 20; day++) {
            int Daily_Stake = 100;
            int winningAmount = 0;
            System.out.println("Day " + day);
            while (Daily_Stake < 150 && Daily_Stake > 50) {
                Daily_Stake += winLossCheck();
            }
            winningAmount += (Daily_Stake - 100);
            totalWinnigAmount += winningAmount;
            System.out.println("Winning Amt " + winningAmount);
            totalWinnigAmount += Daily_Stake;
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Money After 20 Days are: " + totalWinnigAmount);
    }
}
