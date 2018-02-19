public class TestHeadPhone{
  public static void main (String[] args){
    // construct a default headphone
    HeadPhone headPhoneOne = new HeadPhone();
    System.out.println(headPhoneOne.toString());// call toString method, display characteristics
    // construct a headphone with arguments
    HeadPhone headPhoneTwo = new HeadPhone(1,true,"Bose","Black","BH4536");
    System.out.println(headPhoneTwo.toString());// call toString method, display characteristics
    // construct a second headphone with arguments and change the volume
    HeadPhone headPhoneThree = new HeadPhone(1,true, "Phonics", "Blue","P-X780");
    System.out.println(headPhoneThree.toString());// call toString method, display characteristics
    headPhoneThree.changeVolume(3);// call changeVolume method to adjust volume
    System.out.println(headPhoneThree.toString());// call toString method, display characteristics
  }// end main
}// end class
