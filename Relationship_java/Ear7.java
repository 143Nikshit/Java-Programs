class Account {
    private int accNo;

    Account(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }
}

class Bank {
    private String bankName;
    private Account account;

    Bank(String bankName) {
        this.bankName = bankName;
        this.account = new Account(101); // Early Instantiation
    }

    public String getBankName() {
        return bankName;
    }

    public Account getAccount() {
        return account;
    }
}

class Ear7 {
    public static void main(String[] args) {
        Bank b = new Bank("HDFC");
        System.out.println(b.getBankName());
        System.out.println(b.getAccount().getAccNo());
    }
}
