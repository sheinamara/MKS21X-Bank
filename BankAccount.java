public class BankAccount{
//variables
  private double balance;
  private int accountID;
  private String password;

//contstuctors
  public BankAccount (double xbalance, int xaccountID, String xpassword){
    balance = xbalance;
    accountID = xaccountID;
    password = xpassword;
  }

//get method for balance
  public double getBalance(){
    return balance;
  }

//get method for accountID
  public int getAccountID(){
    return accountID;
  }

//get method for password
  public String getPassword(){
    return password;
}
//set method for password
  public void newPassword(String changeToThis){
    password = changeToThis;
  }

//returns tabbed values
  public String toString(double a, double b){
    return "" + a + "\t" + b;
  }

//deposit money
  public boolean deposit(double money){
    if (money >= 0){
      balance = balance + money;
    }
    return money >= 0;
  }

//withdraw money
  public boolean withdraw(double money){
    if (money <= balance){
      balance = balance - money;
    }
    return money <= balance;
  }

}
