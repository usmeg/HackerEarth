/*
 * Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
 where S denotes the length of string S.

Sample Input
abcdE
Sample Output
ABCDe
Time Limit: 5
Memory Limit: 256
Source Limit:
//Passed all test cases 
@Author- Meghana.U.S
 */
import java.util.*;
class ToggleString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); StringBuffer sb = new StringBuffer(); 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') sb.append(Character.toLowerCase(s.charAt(i)));
            else{
                if(s.charAt(i)>='a' && s.charAt(i)<='z') sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}