import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTeste {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        Double amount = 200.0;
        Double expectedValue = 196.0;
        Account account = new Account(1L, 0.0);
        account.deposit(amount);
        assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){
        Double amount = -200.0;
        Double expectedValue = 100.0;
        Account account = new Account(2L, expectedValue);
        account.deposit(amount);
        assertEquals(expectedValue, account.getBalance());
    }
}
