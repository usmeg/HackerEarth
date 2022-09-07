/*
 * Problem
Alice has the following two types of taxis:

Online taxi: It can be booked by using an online application from phones 
Classic taxi: It can be booked anywhere on the road
The online taxis cost Oc for the first Of km and Od for every km afterward. 
The classic taxis travel at a speed of Cs km per minute. The cost of classic taxis are Cb,Cm , and Cd that
represents the base fare, cost for every minute that is spent in the taxi, and cost for each kilometer that you ride.

You are going to the office from your home. Your task is to minimize the cost that you are required to pay. The distance from your home to the office is D. You are required to select whether you want to use online or classic taxis to go to your office. If both the taxis cost the same, then you must use an online taxi.

Input format

First line: Single integer D that denotes the distance from your house to the office
Next line: Three integers Oc , Of , and Od  
Next line: Four integers  Cs, Cb ,Cm  , and Cd
Output format

If you select an online taxi to travel, then print a string 'Online Taxi'. Otherwise, select 'Classic Taxi'. You can print this string in a new, single line.

Constraints

1    109

Sample Input
13
6 7 4
4 2 1 2
Sample Output
Online Taxi
Time Limit: 1
Memory Limit: 64
Source Limit:
Explanation
If Felix choose to use Online Taxi, it will cost Felix a total of 
6 + (13-7) * 4 = 30

While the classic taxi will cost Felix a total of 
2+ [13/4] * 1+ 13 * 2=31

Therefore Felix will choose Online Taxi over Classic Taxi
 */


import java.util.*;
class GoingToOffice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long D = sc.nextLong();
        long Oc = sc.nextLong();
        long Of = sc.nextLong();
        long Od = sc.nextLong();
        long Cs = sc.nextLong();
        long Cb = sc.nextLong();
        long Cm = sc.nextLong();
        long Cd = sc.nextLong();
        double online = 0; double classic=0;
        online = Oc+(D-Of) * Od;
        classic = Cb + ((Math.floor(D/Cs))* Cm) + (D * Cd) ;
        if(online <= classic) System.out.println("Online Taxi");
        else{
            System.out.println("Classic Taxi");
        }
        sc.close();
    }
}