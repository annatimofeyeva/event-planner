import java.io.Console;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Please, enter the number of guest (from 1 - 100):  ");
    String userInput = myConsole.readLine();
    int userInputGuestsNumber = Integer.parseInt(userInput);
    //System.out.println(userInputGuestsNumber);
    System.out.println("Please, type your choose for the food menu options: Steak Dinner, Seafood Dinner, Vegeterian Dinner or Oriental Food: ");
    String userInputFoodOption = myConsole.readLine();
    //System.out.println(userInputFoodOption);
    System.out.println("Please, make you beverage choise: Red Vine, White Wine, Beer, Cocktails or non-alcoholic beverages");
    String userInputBeverageOption = myConsole.readLine();
    //System.out.println(userInputBeverageOption);
    System.out.println("Please, make you Entertainment choise: Jazz band, String quartet, Country music or Oriental belly dance music");
    String userInputEntertainmentOption = myConsole.readLine();
    //System.out.println(userInputEntertainmentOption);




//printing final cost of event
//System.out.println("Yours event cost is " + returnEventCost());
  }
}
