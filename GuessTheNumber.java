//Programmer:Jackson Lee
//Program:GuessTheNumber
//Purpose:have the user guess a number between 0 and 100, they have 8 tries
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[]args){
        randomNum();
    }
    public static void randomNum() {
        Random r = new Random();
        
        String guessText = "guess";
        
        int n = r.nextInt(101);
        
        for(int turns = 1; turns < 9; turns++) {
            System.out.print("Guess a number between 0 and 100: ");
            int guess = Keyboard.readInt();
            if(guess == n) {
                if(turns > 1) guessText = "guesses";
                System.out.println("You won in " + turns + " " + guessText);
                System.out.print("Would you like to play again (true/false)? ");
                boolean play = Keyboard.readBoolean();
                if(play) {
                    randomNum();
                } else {
                    break;
                }
            } else if(turns == 8) {
                System.out.println("You lost.");
                break;
                } else if(guess > n) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }
    }
}
