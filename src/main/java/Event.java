public class Event{
  private int mGuestsNumber;
  private String mFoodOption;
  private String mBeveragesOption;
  private String mEntertainmentOption;

public Event(int gnumber, String food, String beverages, String entertainment){
  mGuestsNumber = gnumber;
  mFoodOption = food;
  mBeveragesOption = beverages;
  mEntertainmentOption = entertainment;
  }
public String retutnEventCost(){

}

public int getCuestNumber(){
  return mGuestsNumber;
}
public String getFoodOption(){
  return mFoodOption;
}
public String getBeverageOption(){
  return mBeveragesOption;
}
public String getEntertainmentOption(){
  return mEntertainmentOption;
  }
}
