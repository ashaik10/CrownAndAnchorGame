
 
private static boolean checkNoSpinThrow(List<DiceValue> cdv) {
 	    boolean success = false;
 	    for (int i = 0; i <cdv.size(); i++){
 	        if(cdv.get(i).toString().equals("Anchor") ||
                     cdv.get(i).toString().equals("Crown") ||
                     cdv.get(i).toString().equals("Heart") ||
                     cdv.get(i).toString().equals("Diamond") ||
                    cdv.get(i).toString().equals("Club") ||
                     cdv.get(i).toString().equals("Spade")){
 	            success = true;
             }
            else success = true;
             if(!success) {
                return false;
            }
        }
 	    return true;
  }import java.util.List;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
	   BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        Player player = new Player("Fred", 100);
        Game game = new Game(d1, d2, d3);
        List<DiceValue> cdv = game.getDiceValues();

        int totalWins = 0;
        int totalLosses = 0;


        System.out.println("To play the game user age must be 18+");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age;
        age = 19;
        if(age < 18){

// bug 02 fixation 
		// asking user age is less than 18 you are not allowed 

            System.out.println("Your age is less then 18 you are not allowed to play the game ");
            System.exit(0);
        }
        System.out.println("Your age is 18+ you can play the game");
        while (true)
        {
            int winCount = 0;
            int loseCount = 0;



