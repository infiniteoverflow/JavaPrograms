package com.programs;

import java.util.Scanner;

public class KnapsackA {
    static int n,item[] = new int[10],weight[] = new int[10],profit[] = new int[10],v[][] = new int[10][10],capacity;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Items:");
        n = in.nextInt();
        System.out.println("Enter the capacity of Knapsack:");
        capacity = in.nextInt();
        System.out.println("Enter the weights of each item:");
        for(int i=1;i<=n;i++)
            weight[i] = in.nextInt();
        System.out.println("Enter the profit of each knapsack:");
        for(int i = 1;i<=n;i++)
            profit[i] = in.nextInt();
        int tp = knap(n,capacity);
        System.out.println("Total Profit is:"+tp);
    }

    public static int knap(int i,int j) {
        if(i==0||j==0)
            v[i][j] = 0;
        else if(j<weight[i])
            v[i][j] = knap(i-1,j);
        else
            v[i][j] = max(knap(i-1,j),profit[i]+knap(i-1,j-weight[i]));

        return v[i][j];
    }

    public static int max(int i,int j) {
        return (i>j)?i:j;
    }
}