
    /*
 * Problem
Alice loves candies, so she went into a candy shop. Now the shopkeeper sells candies in packets and all packets contain an odd number of candies (1, 3, 5, 7.....). Alice wants exactly  candies but she also loves patterns so she decided to buy candies only if the number of candies in the packets is consecutive and distinct (means she cannot buy the same candy packet more than once) and the sum of all the candies in those packets is exactly .

Alice has an infinite amount of money and the shopkeeper also has infinite amount candy packets, so Alice wonders how many different sets of candy packets she can buy.

Find the number of different sets of candy packets that Alice can buy.

Input format:

The first and the only line contains a single integer .

Output format:

Print a single integer denoting the number of different sets of candy packets Alice can buy.

Sample Input
45
Sample Output
3
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
Exaplanation: Lola can buy 3 set of candy packets.

1. {5,7,9,11,13}

2.{13,15,17}

3.{45}
 */
//passed 17 out of 30 test cases
import java.util.*;
class Alice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i=1; int count=0;
        if(N%2!=0) count++;
        while(i<N){
            int j=i;
            int sum=0;
            while(j<N && sum<N && j%2!=0)
            {
                sum+=j; j=j+2;
            }
            if(sum==N) count++;
            i=i+2;
        }
        System.out.println(count);
        sc.close();
    }
}
    
