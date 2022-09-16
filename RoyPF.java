/*
Problem
Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
Minimum dimension of the picture can be L x L, where L is the length of the side of square.

Now Roy has N photos of various dimensions.
Dimension of a photo is denoted as W x H
where W - width of the photo and H - Height of the photo

When any photo is uploaded following events may occur:

[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.

(quotes are only for clarification)

Given L, N, W and H as input, print appropriate text as output.

Input:
First line contains L.
Second line contains N, number of photos.
Following N lines each contains two space separated integers W and H.

Output:
Print appropriate text for each photo in a new line.

Constraints:
1 <= L,W,H <= 10000
1 <= N <= 1000

Sample Input
180
3
640 480
120 300
180 180
Sample Output
CROP IT
UPLOAD ANOTHER
ACCEPTED
Time Limit: 1
Memory Limit: 256
Source Limit:
//All test cases passed 
@Author-Meghana.U.S
*/import java.util.*;
class RoyPF{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        int i=0; 
        ArrayList<String> arr = new ArrayList<>();
        while(i<N){
            int W = sc.nextInt();
            int H = sc.nextInt();
            if(W<L || H<L) arr.add("UPLOAD ANOTHER");
            else{
                if(W>=L && W==H) arr.add("ACCEPTED");
                else{
                    arr.add("CROP IT");
                }
            } i++;
        }
       for(int j=0;j<arr.size();j++) System.out.println(arr.get(j));
        sc.close();
    }
}