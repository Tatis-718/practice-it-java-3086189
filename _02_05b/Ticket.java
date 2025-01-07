package _02_05b;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three public methods to set the value of each field, called
  // setDestination, setPrice and setIsReturn.
  public void setDestination(String dest) {
    this.destination = dest;
  };
  public void setPrice(double cost){
    this.price = cost;
  };
  public void setIsReturn(boolean bool){
    this.isReturn = bool;
  };

  // Add three public methods to get the value of each field, called
  // getDestination, getPrice and getIsReturn.
  public String getDestination(){
    return destination;
  };
  public double getPrice(){
    return price;
  };
  public boolean getIsReturn(){
    return isReturn;
  };
}
