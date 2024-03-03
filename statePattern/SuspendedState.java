package statePattern;

public class SuspendedState implements AccountState{


    @Override
    public void ActivateState(Account account) {
        account.setState(new ActivateState());
        System.out.println("Your account is now Activated!");
    }

    @Override
    public void SuspendedState(Account account) {
        System.out.println("Your Account is Already Suspended");
    }

    @Override
    public void ClosedState(Account account) {
        account.setState(new ClosedState());
        System.out.println("Your Account is now Closed!");
    }

    @Override
    public void Deposit(Account account, Double Amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void Withdraw(Account account, Double Amount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public String toString(Account account) {
        return null;
    }
}
