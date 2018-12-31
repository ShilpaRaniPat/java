import java.util.Scanner;


public class ex9 {

        public static void main(String[] args) {
            String text = "";
            String reverse = "";
            Scanner s= new Scanner(System.in);
            System.out.println("Enter a string:");
            text =s.nextLine();

            for (int i=text.length()-1; i>=0; i--) {
                reverse += text.charAt(i);
            }

            System.out.println(reverse);

        }
}

