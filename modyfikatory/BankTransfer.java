package pl.samouczekprogramisty.modyfikatory;

public interface BankTransfer {
    void transfer(BankAccount from, BankAccount to, int amount);
}
