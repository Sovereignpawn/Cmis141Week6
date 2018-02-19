/*  File:     HeadPhone.java
 *  Author:   Matthew Dwyer
 *  Date:     15 Feb 2018
 *  Purpose:  complete objectives in homework 3
 */

/** The following Class will build a set of headphones and create a string that IDs the
 *  characteristics of the headphones. This class contains Three constants named LOW,
 *  MEDIUM and HIGH with values of 1, 2 and 3 to denote the headphone volume.
 *  A private int data field named volume that specifies the volume of the headphone.
 *  The default volume is MEDIUM. A private boolean data field named pluggedIn that
 *  specifies if the headphone is plugged in. The default value is false. A private
 *  String data field named manufacturer that specifies the name of the manufacturer of
 *  the headphones. A private Color data field named headPhoneColor that specifies the
 *  color of the headphones. A private String data field named headPhoneModel that
 *  specifies the Model of the headphones. Getter and setter methods for all data fields.
 *  A no argument constructor that creates a default headphone. A method named toString()
 *  that returns a string describing the current field values of the headphones. A method
 *  named changeVolume(value) that changes the volume of the headphone to the value
 *  passed into the method
 */
public class HeadPhone{
  /* variable declaration */
  final private int LOW =1;
  final private int MEDIUM =2;
  final private int HIGH =3;
  private int volume;
  private boolean pluggedIn =false;
  private String manufacturer;
  private String color;
  private String model;
  private static int numHeadPhone = 0;
  /* default Constructor */
  public HeadPhone () {
    volume =2;
    pluggedIn =false;
    manufacturer ="Null";
    color ="Null";
    model ="Null";
    numHeadPhone++;
  }// end default constructor
  /* constructor with arguments */
  public HeadPhone(int v, boolean p, String m, String c, String mo){
    volume =v;
    pluggedIn =p;
    manufacturer =m;
    color =c;
    model =mo;
    numHeadPhone++;
  }// end constructor with arguments
  public void changeVolume(int newValue){// method with argument to change volume
  volume = newValue;
  }
  /* getters&setters for volume, manufacture, color, model, numHeadPhone and plugged in state*/
  public void setVolume(int volume){
    this.volume = volume;
  }
  public int getVolume(){
    return volume;
  }
  public void setPluggedIn(boolean pluggedIn){
    this.pluggedIn = pluggedIn;
  }
  public boolean getPluggedIn(){
    return pluggedIn;
  }
  public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
  }
  public String getManufacturer(){
    return manufacturer;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return color;
  }
  public void setModel(String model){
    this.model = model;
  }
  public String getModel(){
    return model;
  }
  public static int getNumHeadPhone(){
    return numHeadPhone;
  }
  /* method to create a string that wen called will display all the characteristics of the
   * headphone that was created */
  public String toString(){
    String output;
    output = String.format("\nThe volume of headphone %d is %d\nIt is %b that headphone %d is plugged in\nThe manufacturer of headphone %d is %s\nThe color of headphone %d is %s\nThe model of headphone %d is %s", numHeadPhone,volume,pluggedIn,numHeadPhone,numHeadPhone,manufacturer,numHeadPhone,color,numHeadPhone,model);
   return output;
  }// end toString method
}//end class


