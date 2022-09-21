/*You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by .

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer  denoting the size of array 
Second line:  space-separated integers.
Output format

If the number is divisible by , then print . Otherwise, print .

Constraints

Sample Input
5
85 25 65 21 84
Sample Output
No
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
Last digit of 85 is 5.
Last digit of 25 is 5.
Last digit of 65 is 5.
Last digit of 21 is 1.
Last digit of 84 is 4.
Therefore the number formed is 55514  which is not divisible by 10

My logic- The divisibility rule for 10 is the last digit must be 0 or the number must be even and divisible by 5
Taking just the last input's last digit and checking divisibility rule
//Passed all the test cases 
//@Author - Meghana U S
*/
import java.util.*;
class Divisibility{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s="";
        int num;
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            int r = arr[i] % 10;
            s=s+r;
        }
        num = Integer.valueOf(s.charAt(s.length()-1));
        if(num==0) System.out.println("Yes");
        else{
            System.out.println("No");
        }
        sc.close();    
    }
}
