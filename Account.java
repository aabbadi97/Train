public class Account<T> {
    private String owner;
    private double ammount;
    private T currency;

    public Account(String owner, double ammount, T currency) {
        this.owner=owner;
        this.ammount=ammount;
        this.currency=currency;
    }

        public String getOwner() {
            return owner;
        }
        public double getAmmount() {
            return ammount;
        }
        public T getCurrency() {
            return currency;
        }

        public void setMoney(double ammount) {
            this.ammount+=ammount;
        }

        public void removeMoney(double ammount) {
            this.ammount-=ammount;
        }

        public void showBalance() {
            System.out.println("MR "+ owner +", your balance is " + ammount + " " + currency);
        }
}


