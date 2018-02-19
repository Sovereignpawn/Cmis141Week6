public class EmployeePay{
  private double payRate=0.0;
  private double hoursWorked = 0.0;

  public EmployeePay(){
    payRate =20.54;
    hoursWorked=40.0;
  }//end constructor

  public void setPayRate(double rate){
    payRate =rate;
  }//end method

  public double getPayRate(){
    return payRate;
  }//end method

  public void setHoursWorked(double hours){
    hoursWorked =hours;
  }//end method

  public double getHoursWorked(){
    return hoursWorked;
  }//end method

  public double calculatePay(){
    double pay =payRate *hoursWorked;
    return pay;
  }//end method

  public static void main (String[] args){
    EmployeePay employee1 =new EmployeePay();
    EmployeePay employee2 =new EmployeePay();
    double pay =0.0;

    employee1.setPayRate(19.95);
    employee1.setHoursWorked(38.0);
    System.out.println("employee 1 is owed "+employee1.calculatePay());//output

    employee2.setPayRate(20.54);
    employee2.setHoursWorked(42.0);
    System.out.println("employee 2 is owed "+employee2.calculatePay());//output
  }//end main method
}//end class
