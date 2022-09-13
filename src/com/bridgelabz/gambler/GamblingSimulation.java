package com.bridgelabz.gambler;

public class GamblingSimulation {
    static int Daily_Stake = 100;
    static int Bet_Per_Game = 1;
    static int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        resignDayCheck();
    }
    static void winLossCheck(){
        int random = (int) (Math.random() * 10) % 2;
        if (random == win) {
            System.out.println("You Won");
            Daily_Stake++;
        } else {
            System.out.println("You Loss");
            Daily_Stake--;
        }
        System.out.println("Dily Stake " + Daily_Stake);
    }
    static void resignDayCheck(){
        while(Daily_Stake < 150 && Daily_Stake > 50){
            winLossCheck();
        }
        System.out.println("Resign For the Day!!!");
    }
}
