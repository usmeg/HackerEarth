/*Problem
A group of students wants to visit a tour in some city . In total, the group has  boys and  girls. To do this, they need to stay in a hotel.

Calculate the number of rooms you need to book in the hotel, if each hotel room has  seats, provided that the boys can not live with the girls in the same room.

Input format

The first line specifies a number  denoting the number of test cases.
In each line of the test case, there are three numbers, .
Output format

For each test case, print one number denoting the number of rooms to be booked at the hotel.

Sample Input
4
13 7 2
5 5 3
2 2 2
5 4 5
Sample Output
11
4
2
2
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
For test 13 7 2 answer is 11, because need for boys 7 rooms and for girls need 4 rooms.

For test 5 5 3 answer is 4, because need for boys 2 rooms and for girls need 2 rooms.
Passed all test cases
@Author - Meghana U S*/

import java.util.*;
class Excursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            double N = sc.nextDouble(); //boys 
            int M = sc.nextInt(); //girls
            double K = sc.nextDouble();
            double r = N/K; double r2=M/K;
            int boys =(int)Math.ceil(r);
            int girls =(int)Math.ceil(r2);
            int total = boys+girls;
            System.out.println(total);
            T--;
        }
        sc.close();
    }
}
