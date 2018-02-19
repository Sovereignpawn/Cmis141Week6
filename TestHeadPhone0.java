public class TestHeadPhone0{
  public static void main (String[] args){
    // construct a default headphone
    HeadPhone headPhoneOne = new HeadPhone();
    // get the values
    System.out.println("The volume of head phone one is: " + headPhoneOne.getVolume());
    System.out.println("It is " + headPhoneOne.getPluggedIn() + " that head phone one is plugged in");
    System.out.println("The manufacturer of head phone one is: " + headPhoneOne.getManufacturer());
    System.out.println("The color of head phone one is: " + headPhoneOne.getColor());
    System.out.println("The model of head phone one is: " + headPhoneOne.getModel());

    HeadPhone headPhoneTwo = new HeadPhone(1,true,"Bose","Black","BH4536");
    // get the values
    System.out.println("The volume of head phone two is: " + headPhoneTwo.getVolume());
    System.out.println("It is " + headPhoneTwo.getPluggedIn() + " that head phone one is plugged in");
    System.out.println("The manufacturer of head phone one is: " + headPhoneTwo.getManufacturer());
    System.out.println("The color of head phone one is: " + headPhoneTwo.getColor());
    System.out.println("The model of head phone one is: " + headPhoneTwo.getModel());

  }// end main
}// end class
