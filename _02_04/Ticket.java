package _02_04;

public class Ticket {

  public Ticket() {}

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  public String setDestination(String dest) {
    return destination = dest;
  };

  // setPrice and setIsReturn.
  public double setPrice(double cost){
    return price = cost;
  };
  public boolean setIsReturn(boolean bool){
    return isReturn = bool;
  };

  // Add a separate method to get the value of each field, called getDestination,
  public String getDestination(){
    return destination;
  };

  // getPrice and getIsReturn.
  public double getPrice(){
    return price;
  };
  public boolean getIsReturn(){
    return isReturn;
  };

}
