package Task_27_8_19;

public class BankAccounts {
	private long account_no;
	private String name;
	private long balance;
	private String account_type;
	private static long total_deposit;
	private static long total_withdrawal;
	
	public BankAccounts() {}
	
	public BankAccounts(int account_no,String name,int balance,String account_type) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
		this.account_type = account_type;
	}
	
	public void initialize(int account_no,String name,int balance,String account_type) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
		this.account_type = account_type;
		
	}
	
	public void showDetails() {
		System.out.println("account no. ->" + account_no + ", name-> " + name + ", balance-> " + balance + ", account_type-> " + account_type);
	}
	
	public void withdraw(int amount) {
		if(this.balance>amount) {
			this.balance -= amount;
			total_withdrawal += amount;
		}
		else {
			throw new RuntimeException("not enough balance for account "+this.account_no);
			//System.out.println("NOT ENOUGH BALANCE for account no "+this.account_no);
		}
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public  static void maintainDeposit(BankAccounts...ba) {
		long sum = 0;
		for(BankAccounts ac : ba) {
			sum += ac.balance;
		}
		total_deposit += sum;
	}

	public static void displayDepositAndWithdrawal() {
		
		System.out.println("TOTAL DEPOSIT IN BANK IS " + total_deposit);
		System.out.println("TOTAL WITHDRAWAL IN BANK IS " + total_withdrawal);
		
	}
	
	public static void calculateBalanceAvg(BankAccounts...ba) {
		long sum = 0;
		for(BankAccounts tmp : ba) {
			sum += tmp.balance;
		}
		System.out.println("TOTAL BALANCE "+sum);
		System.out.println("AVERAGE BALANCE IS " + sum/ba.length);
		
	}
	
	public static void main(String args[]) {
		
		BankAccounts ac1 = new BankAccounts();
		BankAccounts ac2 = new BankAccounts();
		BankAccounts ac3 = new BankAccounts(1003,"amrendra",1000,"Saving");
		BankAccounts ac4 = new BankAccounts(1004,"chirag",500,"Overdraft");
		
		ac1.initialize(1001, "raman", 10000, "PPF");
		ac2.initialize(1002, "simran", 10000, "Saving");
		
		ac3.deposit(5000);
		ac4.deposit(8000);
		
		ac2.withdraw(2000);
		ac4.withdraw(500);
		ac3.withdraw(200);
		
		System.out.println("BANK DETAILS OF ACCOUNTS");
		System.out.println("----------------------------------------------------------------");
		ac1.showDetails();
		ac2.showDetails();
		ac3.showDetails();
		ac4.showDetails();
		System.out.println("----------------------------------------------------------------");
		
		maintainDeposit(ac1,ac2,ac3,ac4);
		displayDepositAndWithdrawal();
		System.out.println("----------------------------------------------------------------");
		
		calculateBalanceAvg(ac1,ac2,ac3,ac4);
		System.out.println("----------------------------------------------------------------");
	}
	
	
	
}
