/*Problem
The Monk wants to teach all its disciples a lesson about patience, since they are always in a hurry to do something crazy. To teach them this, he gives them a list of N numbers, which may or may not be distinct. The students are supposed to solve a simple Mathematical equation based on the array of these N numbers.

g(x) - GCD (a[ 0 ], a[ 1 ], a[ 2 ]... a[n-1] )
f(x) - (a[ 0 ] * a[ 1 ] * a[ 2 ]... * a[n-1] )
The value of the MonkQuotient is: 109 + 7.

The equation to be solved is: ( f(x)g(x) ) % MonkQuotient

Input constraints:
The first line of input will contain an integer — N. The next line will contain N integers denoting the elements of the list.

Output constraints:
Print the required answer of the equation.

Constraints:
1 ≤ N ≤ 50
1 ≤ Ai ≤ 103

Sample Input
2
2 6
Sample Output
144
Time Limit: 2
Memory Limit: 256
Source Limit:
Explanation
Here we can see that the product of the elements of array is 12 and the GCD of the array comes out to be 2 . Thus the answer would be 12^2 which is 144.*/
//passed all test cases 
//@Author - Meghana U S
import java.util.*;
class MonkQuotient{
    public static void main(String args[]){
        int N; double gcd=1d; double m=1d;
        long monk = 1000000007;
        Scanner sc = new Scanner(System.in);
        MonkQuotient obj = new MonkQuotient();
        N=sc.nextInt();
        double arr[]=new double[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextDouble();
            m=(m*arr[i]) % monk;
        }
        sc.close();

        gcd=arr[0];
		for(int i=1;i<N;i++)
		{
			gcd=obj.GCD(gcd,arr[i]);
			if(gcd==1)
				break;
		}

		double a=0;
		if(gcd>1)
		{
		    a=m;
			for(int i=1;i<gcd;i++)
			{
				m=(m*a)%monk;
			}
		}
		System.out.println((int)m);
		
		
	}
	double GCD(double a, double b) {
		if(b==0)
			return a;
		return GCD(b,a%b);
	}

}
