package Interface;

public class HSBCBank implements RBIBank,USBank,BrazilBank{

	
	@Override
	public void CreditCard() {
	System.out.println("HSBC bank-CreditCard");
	}
	
	@Override
	public void DebitCard() {
		System.out.println("HSBC Bank-DebitCard");
	}
	
	@Override
	public void TransferMoney() {
		System.out.println("HSBC Bank-TransferMoney");
	}
	
	@Override
	public  void MutualFunds() {
		System.out.println("HSBC Bank-MutualFunds");
	}
	
	@Override
	public void CarLoan() {
		System.out.println("HSBC Bank-CarLoan");
	}
	
	@Override
	public void BikeLoan () {
		System.out.println("HSBC Bank-BikeLoan");
	}
	
	@Override
	public void PersonalLoan() {
		System.out.println("HSBC Bank-PersonalLoan");
		
	}
	
	public void HomeLoan() {
		System.out.println("HSBC Bank-HomeLoan");
	}
	
	public void GoldLoan() {
	System.out.println("HSBC Bank-GoldLoan");
		
	
}
	
}
