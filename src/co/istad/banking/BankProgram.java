package co.istad.banking;

import co.istad.banking.database.Database;

public class BankProgram {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber((1234));
        creditCard.setPin(2004);

        if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
            creditCard = Database.creditCard();
        }else{
            System.out.println("Invalid Card...!");
            return;
        }
        creditCard.deposit(500.0);
        creditCard.withdrawal(1000.0);
        creditCard.showBalance();

        SavingAccount mySaving = Database.saving();
        mySaving.setInterestI(new DollarRate());
        mySaving.calculateInterest();
        mySaving.showBalance();

    }
}
