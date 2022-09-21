/*Problem
Professor Amit Gupta has given you a mathematical programming assignment. It goes as follows:
 = sum of numbers that divide both x and y, i.e., sum of the common divisors of x and y.
Given the value of N, you are required to calculate the value of S.

  .

As the value of S can be large, find it modulo .

Input
Input contains only one number N.

Output
Output contains only one number, the value of S modulo .

Constraints

Sample Input
5
Sample Output
33
Time Limit: 4
Memory Limit: 256
Source Limit:*/
//Time limit exceeded 
//@Author - Meghana 
import java.util.*;
class Summation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count=0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i%j == 0) count= (count+i)%1000000007;
            }
        }
        System.out.println(count);
        sc.close();
    }
}