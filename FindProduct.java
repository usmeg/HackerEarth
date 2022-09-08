/*
Problem
You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo .

Input Format:
The first line contains a single integer N denoting the size of the array. The next line contains N space separated integers denoting the elements of the array

Output Format:
Print a single integer denoting the product of all the elements of the array Modulo .

Constraints:


Sample Input
5
1 2 3 4 5
Sample Output
120
Time Limit: 1
Memory Limit: 256
Source Limit:
//passed all testcases 
@meghana.U.S*/
import java.util.*;
class FindProduct{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        ArrayList<Long> a = new ArrayList<>(); long product=1;
        for(int i=0;i<N;i++){
            a.add(i,sc.nextLong());
            product *= a.get(i);
        }
        product = product %1000000007;
        System.out.println((product));
        sc.close();
    }
}