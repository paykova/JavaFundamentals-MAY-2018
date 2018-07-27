package tests;

import ba.BankAccount;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    // Arrange - да подсигурим условието, така че да се случи. Валидна иснтанция на БанкАкаунт
    // Act - да направим депозит
    // Assert - да валидираме дали това, което се е случило е това, което очакваме

    @Test
    public void depositAmount(){
        BankAccount ba = new BankAccount();
        ba.deposit(20);
        Assert.assertTrue(ba.getBalance() == 20);
    }

    @Test
    public void withdrawAmount(){
        BankAccount ba = new BankAccount();
        ba.deposit(20);
        ba.withdraw(10);
        Assert.assertTrue(ba.getBalance() == 10);
    }

    @Test (expected = IllegalArgumentException.class) //Assert
    public void withdrawNegativeAmount() {
        BankAccount ba = new BankAccount(); // Arrange
        ba.deposit(20);
        ba.withdraw(-10); // Act
    }
}
