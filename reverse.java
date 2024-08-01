// Reverse a String (using StringBuilder class)

import java.util.Scanner;

/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter your word: "); String n = ob.nextLine();

        StringBuilder sc = new StringBuilder(n);

        
        for (int i=0; i<sc.length()/2; i++){

            int front = i;
            int back = (sc.length()-1)-i;
       
            char frontchar = sc.charAt(front);
            char backchar = sc.charAt(back);

            sc.setCharAt(front, backchar);
            sc.setCharAt(back, frontchar);

        }

        System.out.println("Reverse your word: "+sc);
    }
}