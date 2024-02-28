package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//      items.add("Apple");

        printDoubled(items);

        System.out.println("------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer  ronaldo = new SoccerPlayer("Ronaldo");


        Team<FootballPlayer> blackEagles = new Team<>("Black Eagles");
        Team<BaseballPlayer> sox = new Team<>("Sox");
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");

        blackEagles.addPlayer(joe);
        sox.addPlayer(pat);
        realMadrid.addPlayer(ronaldo);


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer each : items){
            System.out.println(each * 2);
        }
    }
}
