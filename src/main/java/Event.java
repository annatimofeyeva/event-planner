import java.util.Map;
import java.util.HashMap;

public class Event{
  private int guestsNumber;
  private String foodOption;
  private String beveragesOption;
  private String entertainmentOption;
  private Map<String, Double> food2price= new HashMap<String, Double>();
  private Map<String, Double> beverage2price= new HashMap<String, Double>();
  private Map<String, Double> ent2price= new HashMap<String, Double>();

public Event(int guestsNumber, String foodOption, String beveragesOption, String entertainmentOption){
  this.guestsNumber = guestsNumber;
  this.foodOption = foodOption;
  this.beveragesOption = beveragesOption;
  this.entertainmentOption = entertainmentOption;
  food2price.put("StD", 10.0);
  food2price.put("SfD", 15.0);
  food2price.put("VD", 20.0);
  food2price.put("OD", 25.0);
  beverage2price.put("RW", 10.0);
  beverage2price.put("WW", 10.0);
  beverage2price.put("B", 5.0);
  beverage2price.put("C", 5.0);
  beverage2price.put("NA", 5.0);
  ent2price.put("JB", 100.0);
  ent2price.put("SQ", 150.0);
  ent2price.put("CM", 200.0);
  ent2price.put("OM", 250.0);
  }
  public double getTotalCost() {
    double foodPrice = 0.0;
    double beveragePrice = 0.0;
    double entertainmentPrice = 0.0;
    boolean badValues = false;
    if (food2price.containsKey(foodOption)) {
      foodPrice = food2price.get(foodOption);
    } else {
      System.out.println("Unknown food option " + foodOption);
      badValues = true;
    }
    if (beverage2price.containsKey(beveragesOption)) {
      beveragePrice = beverage2price.get(beveragesOption);
    } else {
      System.out.println("Unknown beverage option " + beveragesOption);
      badValues = true;
    }
    if (ent2price.containsKey(entertainmentOption)) {
      entertainmentPrice = ent2price.get(entertainmentOption);
    } else {
      System.out.println("Unknown entertainment option " + entertainmentOption);
      badValues = true;
    }
    if (badValues) {
      System.out.println("Please try again with correct values");
      System.exit(0);
    }
    return (foodPrice + beveragePrice) * guestsNumber + entertainmentPrice;
  }
}
