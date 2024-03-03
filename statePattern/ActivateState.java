package statePattern;

public class ActivateState implements AccountState {

    @Override
    public void ActivateState(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void SuspendedState(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is now suspended!");
    }

    @Override
    public void ClosedState(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is now closed!");
    }

    @Override
    public void Deposit(Account account, Double Amount) {
        account.setBalance(account.getBalance() + Amount);
        System.out.println("Amount Deposited: " + Amount);
        account.toString();
    }

    @Override
    public void Withdraw(Account account, Double Amount) {
        account.setBalance(account.getBalance() - Amount);
        System.out.println("Amount Withdrawn: " + Amount);
        account.toString();
    }

    @Override
    public String toString(Account account) {
        return "try print";
    }
}
