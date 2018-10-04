public class Driver{
  public static void main(String [] args){
    // THE BASICS TO MAKE SURE EVERYTHING WORKS
    BankAccount amara = new BankAccount(10001.99, 00100, "passwordssuck");
    System.out.println(amara);
    System.out.println("Her balance is " + amara.getBalance() + ".");
    System.out.println("Her accountID is " + amara.getAccountID() + ".");
    System.out.println("Her password is " + amara.getPassword() + ".");

    // CHANGE PASSWORD
    amara.newPassword("passwordsaregood");
    System.out.println("Her new password is " + amara.getPassword() + ".");

    // DEPOSIT
    amara.deposit(100);
    System.out.println("Her new balance is " + amara.getBalance() + ".");
    amara.deposit(-0.5); // FALSE
    System.out.println("Her new balance is " + amara.getBalance() + "."); // should stay the same

    // WITHDRAW
    amara.withdraw(200);
    System.out.println("Her new balance is " + amara.getBalance() + ".");
    amara.withdraw(20000.01); // FALSE
    System.out.println("Her new balance is " + amara.getBalance() + "."); // should stay the same

    // TO STRING
    System.out.println(amara.toString((amara.getBalance()), (amara.getAccountID()))); // not sure how this should work
  }
}
