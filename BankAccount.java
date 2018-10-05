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
  public String toString(){
    return "" + accountID + "\t $" + balance;
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

//additional methods
/*This private method will allow internal methods to check the password easily*/
  private boolean authenticate(String given){
    return given.equals(password);
  }

/*Transfer money from this BankAccount to the other*/

 public boolean transferTo(BankAccount other, double amount, String pass){
   return (authenticate(password) && (this.withdraw(amount) && other.deposit(amount)));
 }
}
