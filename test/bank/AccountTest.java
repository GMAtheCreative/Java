package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;
    @BeforeEach
    void setUp() {
        account = new Account(1000, "1234");
    }
    @Test
    public void newAccount_balanceTest(){
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void newAccount_depositOfPositiveWasMade(){
        account.deposit(1000.0, "1234");
        assertEquals(2000.0, account.getBalance());
    }
    @Test
    public void newAccount_withdrawalOfPositiveWasMade(){
        account.withdraw(100.0, "1234");
        assertEquals(900.0, account.getBalance());
    }
    @Test
    public void newAccount_depositOfNegativeWasMade(){
        account.deposit(-1000.0, "1234");
        assertEquals(1000.0, account.getBalance());
    }
    @Test
    public void newAccount_withdrawalOfNegativeWasMade(){
        account.withdraw(-100.0, "123");
        assertEquals(1000.0, account.getBalance());
    }

}
