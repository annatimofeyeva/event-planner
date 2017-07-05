import java.io.Console;

public class App{
  public static void main(String[] args){
    Event myEvent = new Event();
    Console myConsole = System.console();
    System.out.println("Please, enter the number of guests:  ");
    String userInput = myConsole.readLine();
    int userInputGuestsNumber = Integer.parseInt(userInput);
    myEvent.setGuestsNumber(userInputGuestsNumber);
    System.out.println("Please, type your choose for the food menu options: Steak Dinner[StD], Seafood Dinner[SfD], Vegeterian Dinner[VD] or Oriental Food[OF]: ");
    String userInputFoodOption = myConsole.readLine();
    myEvent.setFoodOption(userInputFoodOption);
    System.out.println("Please, make you beverage choise: Red Vine[RW], White Wine[WW], Beer[B], Cocktails[C] or non-alcoholic beverages[NA]");
    String userInputBeverageOption = myConsole.readLine();
    myEvent.setBeveragesOption(userInputBeverageOption);
    System.out.println("Please, make you Entertainment choise: Jazz Band[JB], String Quartet[SQ], Country Music[CM] or Oriental belly dance music[OM]");
    String userInputEntertainmentOption = myConsole.readLine();
    myEvent.setEntertainmentOption(userInputEntertainmentOption);
    System.out.println("Please, enter Coupon code:");
    String userInputCouponCode = myConsole.readLine();
    myEvent.setCouponCode(userInputCouponCode);
    System.out.println("Total cost: " + myEvent.getTotalCost());
  }
}
