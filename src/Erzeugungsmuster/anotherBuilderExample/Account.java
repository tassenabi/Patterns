package Erzeugungsmuster.anotherBuilderExample;

public class Account {

    private int number;
    private int balance;
    private String owner;

    private Account(){}

    public static class Builder{

        private int number;
        private int balance;
        private String owner;

        public Builder withNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder withBalance(int balance) {
            this.balance = balance;
            return this;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Account build(){
            Account account = new Account();
            account.number = this.number;
            account.balance = this.balance;
            account.owner = this.owner;

            return account;
        }
    }

    public static void main(String[] args) {
        Account account = new Account.Builder()
                .withBalance(123)
                .withNumber(321)
                .withOwner("Yjette")
                .build();
    }
}
