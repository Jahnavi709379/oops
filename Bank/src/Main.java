//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount jahnaviAccount=new BankAccount();
        BankAccount lathaAccount=new BankAccount();
        lathaAccount.setBankBalance(7000);
        jahnaviAccount.setBankBalance(1000);
        jahnaviAccount.setBankName("Apgvb");
        jahnaviAccount.setIfscCode("ctg6iij");
        jahnaviAccount.setBankLocation("wgl");

        jahnaviAccount.showBankBalance();
        jahnaviAccount.credit(200);
        jahnaviAccount.showBankBalance();
        jahnaviAccount.debit(300);
        jahnaviAccount.showBankBalance();

        lathaAccount.showBankBalance();










    }
}