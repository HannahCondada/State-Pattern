package statePattern;

public class ClosedState implements AccountState{

    @Override
    public void ActivateState(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void SuspendedState(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void ClosedState(Account account) {
        System.out.println("Account is Already Closed!");
    }

    @Override
    public void Deposit(Account account, Double Amount) {
        System.out.println("You cannot deposit on a closed account");
        account.toString();
    }

    @Override
    public void Withdraw(Account account, Double Amount) {
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

    @Override
    public String toString(Account account) {
        return null;
    }
}
