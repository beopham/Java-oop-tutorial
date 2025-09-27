package Chapter1_Exercises_on_Classes;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account()
    {

    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    // cộng tiền vào tk
    public int credit (int amount)
    {
        balance=balance+amount;
        return balance;
    }
    // trừ tiền vào tài khoản
    public int debit(int amount)
    {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch.");
        }
        return balance;
    }
    // trừ tiền người A và cộng vào người B
    public int tranfer(Account taikhoankhac, int amount)
    {
         if(amount<=balance)
         {
             balance=balance-amount;
             taikhoankhac.balance+=amount;
         }
         else
         {
             System.out.println("Không đủ tiền để chuyển khoản.");
         }
        return this.balance;
    }




    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

