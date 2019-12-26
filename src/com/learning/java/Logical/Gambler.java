package com.learning.java.Logical;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
Keeps track of the number of times he/she wins and the number of bets he/she makes.
Run the experiment N times, averages the results, and prints them out.
        b. I/P -> $Stake, $Goal and Number of times
        c. Logic -> Play till the gambler is broke or has won
        d. O/P -> Print Number of Wins and Percentage of Win and Loss.
*/
public class Gambler {

    public static class Total {
        int wins;
        int losses;
    }

    public static void main(String[] args)
    {
        List <Total> totalList = new ArrayList<>();
        double totalWins=0;
        double totalLosses=0;
        double totalSum=0;
        Scanner inputValues = new Scanner(System.in);
        System.out.print("Enter the Stake in $: ");
        int stake = inputValues.nextInt();
        System.out.print("Enter the Goal in $: ");
        int goal = inputValues.nextInt();
        System.out.print("Enter the number of times to Iterate the Experiment: ");
        int totalTimes = inputValues.nextInt();
        for (int i=1;i<=totalTimes;i++)
        {
            totalList.add(playfunc(stake, goal));
            System.out.println(totalList.get(i-1).wins+"\t"+totalList.get(i-1).losses);
        }
        for (int i=0;i<totalTimes;i++)
        {
            totalWins = totalWins + totalList.get(i).wins;
            totalLosses = totalLosses + totalList.get(i).losses;
            totalSum = totalWins + totalLosses;
        }
        System.out.println("Number of wins = "+totalWins);
        System.out.println("Number of losses = "+totalLosses);
        double percentageWin = (totalWins/totalSum)*100;
        double percentageLoss = (totalLosses/totalSum)*100;
        double averageLoss = totalLosses/totalTimes;
        double averageWin = totalWins/totalTimes;
        System.out.println("Percentage of wins ="+ percentageWin);
        System.out.println("Percentage of losses ="+ percentageLoss);
        System.out.println("Average of wins ="+ averageWin);
        System.out.println("Average of Losses ="+ averageLoss);
    }

    private static Total playfunc(int tStake, int tGoal) {
        Total totalObj = new Total();
        while (tStake > 0 && tStake != tGoal)
        {
            boolean result = generateNumber(tStake);
            if (result == true) {
                tStake = tStake + 1;
                totalObj.wins++;
            }
            else {
                tStake = tStake - 1;
                totalObj.losses++;
            }
        }
        return totalObj;
    }

    private static boolean generateNumber(int tStake) {
        boolean wonTheBet;
        double numberGenerated = Math.random();
        if (numberGenerated > 0.49)
        {
            wonTheBet = true;
        }
        else
        {
            wonTheBet = false;
        }
        return wonTheBet;

    }
}
