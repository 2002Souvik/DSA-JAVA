public class AccessModifires {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        myAccount.username = "souvik2002";
        // myAccount.password = "souvik@2402"; // still private
        myAccount.setPassword("Souvik@2402");
    }
}

class BankAccount {
    public String username;
    private String password; 
    public void setPassword(String pwd) {
        password = pwd;
    }
}
