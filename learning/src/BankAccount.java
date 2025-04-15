public class BankAccount{
    private String accountName;
    private String ifscCode;
    private String branchName;
    private double bankBalance;

    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName1){
         accountName = accountName1;
    }
    public String getIfscCode(){
        return ifscCode;
    }
    public void setIfscCode(String ifscCode1){
        ifscCode=ifscCode1;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getBankBalance(){
        return bankBalance;
    }
    public void setBankBalance(double bankBalance1){
        bankBalance=bankBalance1;
    }
    public void credit(double creditMoney){
        bankBalance = bankBalance+creditMoney;
    }
    public void debit(double debitMoney){
        if (debitMoney>bankBalance){
            System.out.println("Insufficient Balance");
        }
        else {
            bankBalance = bankBalance - debitMoney;
        }

    }
    public void showBankBalance(){
        System.out.println("The total balance is :" + bankBalance);
    }
}













/*
BankAccount jahnaviAccount = new BankAccount();
        jahnaviAccount.setBankBalance(500);
        jahnaviAccount.setAccountName("bob");
        jahnaviAccount.setBranchName("Warangal");
        jahnaviAccount.setIfscCode("ctdb21324");
        jahnaviAccount.credit(100000);
        jahnaviAccount.showBankBalance();
        jahnaviAccount.debit(1500);
        jahnaviAccount.showBankBalance();

BankAccount sreevaniAccount = new BankAccount();
        sreevaniAccount.setBankBalance(20000);
        sreevaniAccount.credit(100);
        sreevaniAccount.debit(1000);
        sreevaniAccount.showBankBalance();
*/
