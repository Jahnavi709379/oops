public class BankAccount {
    private String bankName;
    private String bankLocation;
    private double bankBalance;
    private String ifscCode;
    private String accountHoldername;


    public void setBankName(String bankName1){
        bankName = bankName1;
    }
    public String getBankName(){
        return bankName;
    }
    public void setBankLocation(String bankLocation1){
        this.bankLocation=bankLocation1;
        //bankLocation = bankLocation1;
    }
    public String getBankLocation(){
        return bankLocation;
    }
    public void setBankBalance(double bankBalance1){
        bankBalance = bankBalance1;
    }
    public double getBankBalance(){
        return bankBalance;
    }
    public void setIfscCode(String ifscCode1){
        ifscCode = ifscCode1;
    }
    public String getIfscCode(){
        return ifscCode;
    }

    public void credit( double creditedAmount){
        bankBalance=bankBalance+creditedAmount;
    }

    public void debit(double debitedAmount){
        if(bankBalance > debitedAmount){
            System.out.println("deducting "+debitedAmount+" from your Bank Balance "+ bankBalance);
            bankBalance=bankBalance - debitedAmount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
        //}

    }
    public void showBankBalance(){
        System.out.println(accountHoldername + "account balance is: "+ bankBalance);
    }
}
