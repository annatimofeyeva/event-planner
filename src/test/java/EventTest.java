@Test
 public void isLeapYear_forMultiplesOfFourHundred_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2000));
 }
