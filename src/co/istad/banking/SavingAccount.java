package co.istad.banking;

public class SavingAccount extends Account{
    private Double interest;

    private Interest interestI;

    public SavingAccount(){
        setInterestI(new Interest() {
            @Override
            public Double calculate(Double amount) {
                return amount * 0.01;
            }
        });
    }

    public SavingAccount(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void calculateInterest(){
        interest = interestI.calculate(getBalance());
    }
    @Override
    protected void showBalance() {
        System.out.println("\n--------- SAVING ACCOUNT INFORMATION ---------");
        System.out.println("Saving Account Number : " + getNumber());
        System.out.println("Saving Accout Name : " + getName());
        System.out.println("Balance  : $" + getBalance());
        System.out.println("Interest : $" + interest );

    }


}















