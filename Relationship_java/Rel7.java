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
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}

class Rel7 {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Account a = new Account(12345);
        b.setAccount(a);

        System.out.println(b.getBankName());
        System.out.println(b.getAccount().getAccNo());
    }
}
