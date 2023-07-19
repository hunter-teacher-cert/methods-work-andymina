/**
  Name:
  Date:

  Allows the user to play a game of Nim against the
  computer. There are 12 stones in a bag and each
  player can remove 1-3 stones. The player who
  removes the last stone wins.
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // driver code with the number of stones
    playNim(12);
  }

  /**
    Runs a game of Nim between a human player and 
    the CPU and prints who won at the end.

    @param stones - the number of stones to start the
    game with
  */
  public static void playNim(int stones) {
    int totalStones = stones;
    String winner = "CPU";

    // print how many stones are left
    System.out.println(totalStones + " stones remain.");

    do {
      // get the players move and adjust the number of stones
      int playerMove = getPlayerMove(totalStones);
      totalStones = totalStones - playerMove;

      // print how many stones remain
      System.out.println(totalStones + " stones remain.");

      // if the player didn't win
      if (totalStones != 0) {
        // get the CPUs move and adjust the number of stones
        int cpuMove = getCPUMove(totalStones);
        totalStones = totalStones - cpuMove;

        // print how many stones cpu remove
        System.out.println("CPU removed " + cpuMove + " stones.");
      } else {
        winner = "Player";
      }
    } while (totalStones != 0);

    // print who won the game
    System.out.println("🎉 " + winner + " removed the last stone! 🎉");
  }

  /**
    Process a player's turn. Prompts the player for the number of
    stones they wish to remove and makes sure it's a valid move.

    @param remainingStones - the number of stones remaining in the game
    
    @returns the number of stones the player removes
  */
  public static int getPlayerMove(int remainingStones) {
    int playerMove;
    boolean validMove = false;

    do {
      // prompt player for the number of stones to remove
      playerMove = prompt("Enter # of stones to remove (1-3): ");

      // determine if the player removed between 1 and 3 stones
      boolean inValidRange = playerMove >= 1 && playerMove <= 3;

      // determine if that number of stones can actually be removed
      boolean canBeRemoved = remainingStones - playerMove >= 0;

      // update validMove based on the previous two conditions
      validMove = inValidRange && canBeRemoved;
    } while (!validMove);

    // return the players move
    return playerMove;
  }

  /**
    Process the CPU's turn. If  the CPU can make the winning move,
    it does. Otherwise, it chooses a random number of stones
    to remove.

    @param remainingStones - the number of stones remaining in the game

    @return the number of stones the CPU removes
  */
  public static int getCPUMove(int remainingStones) {
    int cpuMove;
    // if the cpu can make the winning move, it does
    if (remainingStones <= 3) {
      cpuMove = remainingStones;
    } else { // otherwise it picks a random number of stones
      cpuMove = getRandomNumber(1, 3);
    }

    // return the cpus move
    return cpuMove;
  }

  // ============= DON'T MODIFY ANYTHING BELOW THIS LINE ================== //

  /**
    Wrapper function to prompt the user for integer input with a message.

    @param message - the message to be displayed before accepting input

    @returns the integer entered by the user
  */
  public static int prompt(String message) {
    Scanner sc = new Scanner(System.in);
    System.out.print(message);
    return sc.nextInt();
  }

  /**
    Helper function to get a random number between [lower, upper);

    @param lower - the inclusive lower bound to generate random numbers from
    @param upper - the exclusive upper bound to generate random numbers from

    @returns the random number generated
  */
  public static int getRandomNumber(int lower, int upper) {
    return (int) Math.floor(lower + (upper - lower) * Math.random());
  }
}
