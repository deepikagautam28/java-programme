package myaccount;

public class Accountcreation {
	private String number=null;
	private String accountType=null;
	private double balance=0;
	
	public void setnumber(String number) {
		this.number=number;
	}
	public String getnumber() {
		return number;
	}
	public void setaccountType(String accountType) {
		this.accountType=accountType;
	}
	public String getaccountType() {
			return accountType;
		}
	public void deposit(double balance) {
		this.balance+=balance;
	}
	public double getbalance() {
		return balance;
	}
	public void withdrawal(double balance) {
		if (balance>=this.balance) {
			System.out.println("insufficient account balance");
		}
		else {
			System.out.println("transaction succesfully");
		}
			
		this.balance-=balance;
		
	}
	public void fundTransfer (double balance,Accountcreation ac1) {
		this.balance=balance;
	}

	public static void main(String[] args) {
		Accountcreation ac1=new Accountcreation();
		ac1.setnumber("SBI1234");
		ac1.setaccountType("Saving accont");
		ac1.deposit(15450.34);
		ac1.deposit(15450.34);
		ac1.deposit(15450.34);
		ac1.deposit(15450.34);
		
		System.out.println("current balance"+" "+ac1.getbalance());
		
		ac1.withdrawal(2000.67);
		
		
		System.out.println(ac1.getnumber()+" "+ac1.getaccountType()+" "+ac1.getbalance());
		
		Accountcreation ac2=new Accountcreation();
		ac2.setnumber("BOI1234");
		ac2.setaccountType("current account");
		ac2.deposit(30800.23);
		
		System.out.println("current balance"+" "+ac2.getbalance());
		
		ac2.withdrawal(4500.67);
		System.out.println(ac2.getnumber()+" "+ac2.getaccountType()+" "+ac2.getbalance());
		ac2.fundTransfer(3000, ac1);
		System.out.println(ac2.getbalance());
		
 
		
	}
	
	

}
