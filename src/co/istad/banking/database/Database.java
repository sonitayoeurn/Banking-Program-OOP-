package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard (){
        CreditCard creditCard = new CreditCard(1234, "Yoeurn Sonita", 1000.0 );
//        creditCard = new CreditCard();
//        creditCard.setName("Yoeurn Sonita");
//        creditCard.setNumber(00412345);
        creditCard.setPin(2004);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));

        return creditCard;
    }
    public static SavingAccount saving(){
        SavingAccount saving = new SavingAccount(6789, "Kim Jennie", 2000.0);
        return saving;
    }


}
