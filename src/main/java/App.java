import java.io.Console;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Please, enter the number of guest (from 1 - 100):  ");
    String userInput = myConsole.readLine();
    int userInputGuestsNumber = Integer.parseInt(userInput);
    System.out.println("Please, type your choose for the food menu options: Steak Dinner[StD], Seafood Dinner[SfD], Vegeterian Dinner[VD] or Oriental Food[OF]: ");
    String userInputFoodOption = myConsole.readLine();
    System.out.println("Please, make you beverage choise: Red Vine[RW], White Wine[WW], Beer[B], Cocktails[C] or non-alcoholic beverages[NA]");
    String userInputBeverageOption = myConsole.readLine();
    System.out.println("Please, make you Entertainment choise: Jazz Band[JB], String Quartet[SQ], Country Music[CM] or Oriental belly dance music[OM]");
    String userInputEntertainmentOption = myConsole.readLine();
    Event myEvent = new Event(userInputGuestsNumber, userInputFoodOption, userInputBeverageOption, userInputEntertainmentOption);
    System.out.println("Total cost: " + myEvent.getTotalCost());
  }
}
