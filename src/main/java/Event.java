import java.util.Map;
import java.util.HashMap;

public class Event{
  private int guestsNumber;
  private String foodOption;
  private String beveragesOption;
  private String entertainmentOption;
  private String couponCode;
  private Map<String, Double> food2price= new HashMap<String, Double>();
  private Map<String, Double> beverage2price= new HashMap<String, Double>();
  private Map<String, Double> ent2price= new HashMap<String, Double>();

public Event(){
  food2price.put("StD", 10.0);
  food2price.put("SfD", 15.0);
  food2price.put("VD", 20.0);
  food2price.put("OF", 25.0);
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
  public int getGuestsNumber(){
    return guestsNumber;
  }
  public void setGuestsNumber(int guestsNumber){
    this.guestsNumber = guestsNumber;
  }
  public String getFoodOption(){
    return foodOption;
  }
  public void setFoodOption(String foodOption){
    this.foodOption = foodOption;
  }
  public String getBeveragesOption(){
    return beveragesOption;
  }
  public void setBeveragesOption(String beveragesOption){
    this.beveragesOption = beveragesOption;
  }
  public String getEntertainmentOption(){
    return entertainmentOption;
  }
  public void setEntertainmentOption(String entertainmentOption){
    this.entertainmentOption = entertainmentOption;
  }
  public String getCouponCode(){
    return couponCode;
  }
  public void setCouponCode(String couponCode){
    this.couponCode = couponCode;
  }

  public double getTotalCost() {
    double foodPrice = 0.0;
    double beveragePrice = 0.0;
    double entertainmentPrice = 0.0;
    boolean badValues = false;
    double totalCost = 0.0;
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
    if ("freejb".equals(couponCode)){
      if (entertainmentOption.equals("JB") && guestsNumber > 150) {
        entertainmentPrice = 0.0;
      } else {
        System.out.println("Sorry, this coupon code is inapplicable.");
      }
    }
    totalCost = (foodPrice + beveragePrice) * guestsNumber + entertainmentPrice;
    if ("10discount".equals(couponCode)){
      if(totalCost > 2000.0) {
        totalCost = totalCost * 0.9;
      }
    }
    return totalCost;
  }
}
