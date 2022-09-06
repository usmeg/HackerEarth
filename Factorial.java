/*
 * Problem:
You are given a number N. How many zeroes does N! end on?
Input-
The first line contains one integer T - number of test cases. The following T lines contain one integer each - N.

Output-
For each test case output one integer per line - the answer for this question.

Constraints:

T <= 1000
0 <= N <= 1011
Sample Input
3
9
11
20
Sample Output
1
2
4
Time Limit: 1
Memory Limit: 256
Source Limit:
MyLogic - To find the number of trailing zeros of a number's factorial,
divide the number recursively by 5 until the quotient is less than 5 and sum up the quotients
we can either divide the number by 5 or multiples of 5.
@Author-Meghana.U.S
 */
//Passed all test cases
import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        Long a[]=new Long[N];
        for(int i=0;i<N;i++) {
        a[i]=sc.nextLong();
        }
        for(int i=0;i<N;i++){
        long q=a[i]; long sum=0;
        while(q>=5){
            q=q/5; sum=sum+q;
        }
        System.out.println(sum);
    }       
        sc.close();
    }
} 
