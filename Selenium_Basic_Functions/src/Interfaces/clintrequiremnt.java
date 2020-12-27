package Interfaces;

public class clintrequiremnt implements BankingFunction {

	public static void main(String[] args) 
	{
		clintrequiremnt cl= new clintrequiremnt();
		cl.widrawalmoney();// cl object can access its own method and implement class methods
		
		BankingFunction bk= new clintrequiremnt();
		bk.addmonytoaccount();
		bk.transfermoney();
		bk.cgeckbalance();
		//bk.widrawalmoney(); it will not allowed access own methods of clintrequiremnt class
		
		
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("transfer money sucessfully");
	}

	@Override
	public void addmonytoaccount() {
		// TODO Auto-generated method stub
		System.out.println(" add money sucessfully");
	}

	@Override
	public void cgeckbalance() {
		// TODO Auto-generated method stub
		System.out.println("check money sucessfully");
	}

	public void widrawalmoney()
	{
		System.out.println("widrwal money sucessfully");
	}
}
