public class Bank {
    private String name;

    public Bank(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public <T, S> S transfer(Account<T> sourceAccount, Account<S> targetAccount, double amount) {
        if (sourceAccount.getAmmount()>=amount){
            sourceAccount.removeMoney(amount);
            targetAccount.setMoney(amount);
            System.out.println(sourceAccount.getOwner() + " a effectué un versement de " + amount + " " + sourceAccount.getCurrency() + " vers le compte de " + targetAccount.getOwner());
        }
        else {
            System.err.println("TRANSACTION IMPOSSIBLE ! " + sourceAccount.getOwner() + " ne poss�de pas ce montant dans son compte.");
        }

        return targetAccount.getCurrency();
    }
}
