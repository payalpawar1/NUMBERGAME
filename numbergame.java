import java.util.Scanner; 

public class GuessingGame 
{
     
        public static void main(String[] args) 
       {
        System.out.println("---Secret Cipher!---");   
        System.out.println("Time for a guessing game! I'll secretly pick a number between 1 and 100, and let's see if you can figure it out.");
           Scanner sc1 = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame();  // call subroutine to play one game
              System.out.println("Ready for another round?\nY* for Yes and N for No");
              playAgain = sc1.nextBoolean();  
              } while (playAgain);
          System.out.println("Thanks for playing! :) ");
        }         
        
        static void playGame() 
        {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) 
               {
                  System.out.println("You got it in " + guessCount
                          + " guesses!  My number was " + computersNumber);
                  break;  
               }
               if (guessCount == 6) {
                  System.out.println("You didn't get the number in 6 guesses.");
                  System.out.println("You lose.  My number was " + computersNumber);
                  break;  
               }
               if (usersGuess < computersNumber)
                  System.out.println("That's too low.  Try again:");
               else if (usersGuess > computersNumber)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     } 
