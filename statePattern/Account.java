package statePattern;

public class Account {

    private AccountState accountState;
    private String AccountNumber;
    private Double Balance;

    //default state when the program is started
    public Account (String AccountNumber, Double Balance){
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.accountState = new ActivateState();
    }

    //gets the current state of the account to update the program
    public AccountState getState(){
        return accountState;
    }

    //the updated info of the account is returned to the account watcher (a.k.a AccountState)
    public void setState (AccountState accountState){
        this.accountState = accountState;
    }

    public String getAccountNumber(){
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber){
        this.AccountNumber = AccountNumber;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double Balance){
        this.Balance = Balance;
    }

    public void Activate() {
        accountState.ActivateState(this);
    }

    public void Suspend() {
        accountState.SuspendedState(this);
    }

    public void Close() {
        accountState.ClosedState(this);
    }

    public void Deposit(Double Amount){
        accountState.Deposit(this, Amount);
    }

    public void Withdraw(Double Amount){
        accountState.Withdraw(this, Amount);
    }

  public String toString(){
      System.out.println("Account Number: " + AccountNumber + "\nBalance: " + Balance);
      return null;
//    return "Account Number: " + AccountNumber + "\nBalance: " + Balance;
    }

}
