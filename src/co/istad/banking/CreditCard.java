package co.istad.banking;

import java.time.LocalDate;

public class CreditCard extends Account{
    private Integer pin;
    private Double limitAmount;
    LocalDate thruDate;
    public CreditCard(){

    }
    public CreditCard(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }




    @Override
    protected final void deposit(Double amount) {
        //What day is today?
        if(isExpired(thruDate)){
            System.out.println("Card is Expired...!");
            return;
        }
        super.deposit(amount);
    }

    @Override
    protected final void withdrawal(Double amount) {
        if(amount > limitAmount){
            System.out.println("Over the limit amount.");
            return;
        }
        if (isExpired(thruDate)){
            System.out.println("card is expired...!");
        }
        super.withdrawal(amount);
    }
    @Override
    protected void showBalance() {
        System.out.println("\n--------- CREDIT-CARD INFORMATION ---------");
        System.out.println("Account Number : " + getNumber());
        System.out.println("Account Name : " + getName());
        System.out.println("Balance : $" + getBalance());
        System.out.println("Pin : " +pin);
        System.out.println("Thru Date : " + thruDate);
        System.out.println("Limit Amount : $" + limitAmount);
    }

    private boolean isExpired(LocalDate date){
        //What day is today?
        LocalDate now = LocalDate.now();
        return now.isAfter(date);
    }

    protected void withdrawal(){
        withdrawal(getBalance());
    }
}




















