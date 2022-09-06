/*Problem:
Arpasland has surrounded by attackers. A truck enters the city. 
The driver claims the load is food and medicine from Iranians.
Ali is one of the soldiers in Arpasland. He doubts about the truck,
maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits 
of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", 
where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

Sample Input
12X345-67
Sample Output
invalid
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
The tag is invalid because the sum of first and second digit of it is odd 
(also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).
//Passed all the test cases
@Author-Meghana.U.S
*/
import java.util.*;
import java.util.regex.*;
class Ali{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String reg = "\\d\\d[A-Z]\\d\\d\\d(-)\\d\\d";
        String cond = "A|E|I|O|U|Y";
        Pattern r = Pattern.compile(reg);
        Matcher m = r.matcher(s);
        Pattern r2 = Pattern.compile(cond);
        Matcher m2 = r2.matcher(s);
        sc.close();
        if(m.find()){
           int first = Integer.valueOf(s.charAt(0));
           int second = Integer.valueOf(s.charAt(1));
           int third = Integer.valueOf(s.charAt(3));
           int fourth = Integer.valueOf(s.charAt(4));
           int fifth = Integer.valueOf(s.charAt(5));
           int sixth = Integer.valueOf(s.charAt(7));
           int seventh = Integer.valueOf(s.charAt(8));
           int sum1 = first +second;
           int sum2 = third+fourth;
           int sum3= fourth+fifth;
           int sum4= sixth+seventh;
           if((sum1%2==0) && (sum2%2==0) && (sum3%2==0) && (sum4%2==0) && (!m2.find()))
           System.out.println("valid");
           else{
            System.out.println("invalid");
           }

        }
        
    }
}