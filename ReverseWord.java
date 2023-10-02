/* Reverse each word in a given string.
  Examples: 
Input : Hello World
Output : olleH dlroW

Time complexity : O(n) 
Auxiliary Space: O(n)

*/
import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String arr[] = st.split(" ");
        for(int i=0; i<arr.length; i++){
            String temp = arr[i];
            for(int j = temp.length() - 1; j>=0; j--){
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
