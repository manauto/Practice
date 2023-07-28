package Interface;

public class TestClass2 {
 
	//cannot instantiate the interface.i.e.object of the interface cannot be created
	//RBIBank RB=new RBIBank();
	//USBank US=new USBank();
	//BrazilBank BB =new BrazilBank();
	
	HSBCBank HB = new HSBCBank();     //Compile time Polymorphism/Early Binding/Static Binding
	
	HB.CreditCard();
	HB.DebitCard();
	HB.TransferMoney();
	HB.MutualFunds();	
	HB.CarLoan();
	HB.BikeLoan();
	HB.PersonalLoan();
	HB.HomeLoan();
	HB.GoldLoan();
	
	System.out.println("HB.Minbalance");
	
	System.out.println();
	
	RBIBank RB = new HSBCBank():
		
}

