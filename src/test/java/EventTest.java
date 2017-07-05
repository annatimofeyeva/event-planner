import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
    public void setFoodOption_isAbleToSetFoodOption_StD() {
      Event testEvent = new Event();
      testEvent.setFoodOption("StD");
      assertEquals("StD", testEvent.getFoodOption());
    }

  @Test
    public void setBeveragesOption_isAbleToSetBeveragesOption_RW() {
      Event testEvent = new Event();
      testEvent.setBeveragesOption("RW");
      assertEquals("RW", testEvent.getBeveragesOption());
    }

  @Test
    public void setEntertainmentOption_isAbleToSetEntertainmentOption_CM() {
      Event testEvent = new Event();
      testEvent.setEntertainmentOption("CM");
      assertEquals("CM", testEvent.getEntertainmentOption());
    }

  @Test
    public void getGuestsNumber_isAbleToGetGuestsNumber_100() {
      Event testEvent = new Event();
      testEvent.setGuestsNumber(100);
      assertEquals(100, testEvent.getGuestsNumber());
    }
    
  @Test
    public void getTotalCost_forGivenData() {
      Event testEvent = new Event();
      testEvent.setGuestsNumber(100);
      testEvent.setFoodOption("OF");
      testEvent.setBeveragesOption("RW");
      testEvent.setEntertainmentOption("JB");
      assertEquals(3600.0, testEvent.getTotalCost(), 0.1);
    }

  @Test
    public void getTotalCost_forGivenDataWithFreejbCoupon() {
      Event testEvent = new Event();
      testEvent.setGuestsNumber(151);
      testEvent.setFoodOption("OF");
      testEvent.setBeveragesOption("RW");
      testEvent.setEntertainmentOption("JB");
      testEvent.setCouponCode("freejb");
      assertEquals(5285.0, testEvent.getTotalCost(), 0.1);
    }

  @Test
    public void getTotalCost_forGivenDataWith10discountCoupon() {
      Event testEvent = new Event();
      testEvent.setGuestsNumber(100);
      testEvent.setFoodOption("OF");
      testEvent.setBeveragesOption("RW");
      testEvent.setEntertainmentOption("JB");
      testEvent.setCouponCode("10discount");
      assertEquals(3240.0, testEvent.getTotalCost(), 0.1);
  }
}
