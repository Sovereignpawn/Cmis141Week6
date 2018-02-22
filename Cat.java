public class Cat{
  private static int numCats =0;
  private boolean angry;
  //constructors
  public Cat(){
    this.angry = true;
    numCats++;
  }
  public Cat(boolean d){
    angry = d;
    numCats++;
  }
  public boolean getAngry(){
    return angry;
  }
  public static int getNumCats(){
    return numCats;
  }
}
