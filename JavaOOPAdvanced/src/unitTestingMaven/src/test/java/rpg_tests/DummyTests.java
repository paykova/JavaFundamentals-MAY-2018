package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.BankAccount;
import rpg_lab.Dummy;

public class DummyTests {
    private static final int ATTACK = 10;
    private static final int DURABILITY = 10;
    private static final int TEN = 10;

    private Axe axe;

    @Before
    public void initializeAxe() {
        this.axe = new Axe(ATTACK, DURABILITY);
    }

    @Test
    public void dummyLosesHealthAfterAttack() {
        Dummy dummy = new Dummy(15, TEN);

        axe.attack(dummy);

        // Assert.assertTrue(dummy.getHealth() == 10);
        Assert.assertEquals("Wrong dummy health", 5, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionAttacked() {
        ;
        Dummy dummy = new Dummy(TEN, TEN);

        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCanNotGiveXP() {
        // Axe axe = new Axe(5, 10);
        // Dummy dummy = new Dummy(10, 10);

        Dummy dummy = new Dummy(15, TEN);

        axe.attack(dummy);
        dummy.giveExperience();
    }

    @Test
    public void testBankAccount() {
        BankAccount ba = new BankAccount();
        ba.setBalance(20.52);
        Assert.assertEquals(20.52, ba.getBalance(), 0.001);
    }
}
