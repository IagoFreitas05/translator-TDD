import Account.Account;
import org.junit.Test;
import test.factory.AccountFactory;

import static org.junit.Assert.assertEquals;

public class AccountTeste {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        Double amount = 200.0;
        Double expectedValue = 196.0;
        Account account = AccountFactory.createEmptyAccount();
        account.deposit(amount);
        assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){
        Double amount = -200.0;
        Double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        account.deposit(amount);
        assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void fullWithdrawShouldSetToZero(){
        Double expectedValue = 0.0;
        Account account = AccountFactory.createAccount(200);
        account.fullWithdraw();
        assertEquals(expectedValue, account.getBalance());
    }
}
