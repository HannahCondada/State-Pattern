package statePattern;

public interface AccountState {

    public void ActivateState(Account account);
    public void SuspendedState(Account account);
    public void ClosedState(Account account);
    public void Deposit(Account account, Double Amount);
    public void Withdraw(Account account, Double Amount);
    public String toString(Account account);

}
