
/*abstractMonk and Rotation
Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School, he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N and an integer K , where she needs to rotate the array in the right direction by K steps and then print the resultant array. As she is new to the school, please help her to complete the task.

Video approach to solve this question: here

Input:
The first line will consists of one integer T denoting the number of test cases.
For each test case:
1) The first line consists of two integers N and K, N being the number of elements in the array and K denotes the number of steps of rotation.
2) The next line consists of N space separated integers , denoting the elements of the array A.

Output:
Print the required array.


Sample Input
1
5 2
1 2 3 4 5
Sample Output
4 5 1 2 3
Explanation
Here T is 1, which means one test case.
denoting the number of elements in the array and , denoting the number of steps of rotations.
The initial array is: 
In first rotation, 5 will come in the first position and all other elements will move to one position
ahead from their current position. Now, the resultant array will be 
In second rotation, 4 will come in the first position and all other elements will 
move to one position ahead from their current position. Now, the resultant array will be 

Time Limit: 1.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB */
import java.util.*;
class Rotation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int N = sc.nextInt();
        long r=sc.nextLong();
        long a[] = new long[N];
        for(int i=0;i<testCase;i++){
            for(int j=0;j<N;j++){
                a[j]=sc.nextInt();
            }
            while(r>0){
                for(int m=0;m<a.length;m++){
                    int j=a.length-1;
                    long temp = a[j];
                    a[j]=a[m];
                    a[m]=temp;}
                 r--;
        }
        for(int k=0;k<N;k++)
            System.out.print(a[k]);
        sc.close();
    }
}
}