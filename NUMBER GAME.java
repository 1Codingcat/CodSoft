                                                            //NUMBER GAME
import java.util.*;
public class forpractice {
    public static void main(String[] args) {
        int randomnumber = (int) (Math.random() * 100) + 1;
        Scanner java=new Scanner(System.in);
        int number=0,k=0;
        System.out.println ("Start Guessing");
      while(randomnumber!=number) {

           number = java.nextInt ();
           if (number > randomnumber) {
               System.out.println ( "Your Guess number is too High" );
               k++;
           } else if (number < randomnumber) {
               System.out.println ( "Your Guess number is too low" );
               k++;

           }
           System.out.println ("You have Another Chance"+"\n"+"Take your chance");
       }
                System.out.println ("Hurray!"+ "You Guessed Correct Answer ");
        System.out.println ("The computer Gussed the number: "+randomnumber);

        }
    }
