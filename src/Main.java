import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner buffer
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        x = sc.nextInt();
        System.out.println("Please enter in a word: ");
        sc.nextLine();
        String word = sc.nextLine();

        //Reading an empty line
        String answer = "y";
        while (answer.equalsIgnoreCase("y")){
            System.out.println("Please enter something: ");
            String something = sc.nextLine();
            if (something.equals("")){
                break;
            }
            System.out.println(something);
        }

        //Random
        Random rand = new Random();
        int y = 1 + rand.nextInt(6);
        System.out.println(y);

        //String methods
        //substring,length,charat
        String word2  = "Professor";
        System.out.println(word2.substring(6,9));
        System.out.println(word2.length());
        System.out.println(word2.charAt(3));
    }
}
