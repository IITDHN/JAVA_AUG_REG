//1. inheritance gives the feature of reusability
//2. polymorphism is implemented
//3. inheritance gives concept of relationship
// 4. Is-a relationship
// 5. has-a relationship
// 6. always keep in mind the inheritance tree
//7.upcasting and downcasting 

//8. when ever we don't do downcasting then commonality things are invoked
//9. when downcasting is done then that own class  features are invoked.
// 10.@override is called as annotation
class Account
{
     String name;
     int accountNumber;
     
     public void withdraw()// outdated ,overidden function
     {
    	 System.out.println(" WITHDRAW OF ACCOUNT ");
    }
  public void deposit()
{
	System.out.println(" deposit of ACCOUNT ");
}

  /*public void roi()
  {
	  
	  System.out.println(" this is roi of ACCOUNT class ");
  }*/
}

class SavingAccount extends Account
{  @Override
  public void withdraw()// updated also called as overriding function
  {
	  System.out.println(" withdraw with limitation in saving account pre day max (10000) ");
}
  
public void roi()
{
	System.out.println(" roi of saving account ");
	
}
@Override
  public void deposit()
  {
  	System.out.println(" deposit of SAVING ACCOUNT ");
  }
}

class CurrentAccount extends Account
{
public void odLimit()// new feature
{
	System.out.println("Current account with over draft limit ");
	}
	
}


class Caller 
{
	public void callMe(Account account){
	account.withdraw();
	account.deposit();
	if(account instanceof SavingAccount)
	{
		 //long l=19;
		 //int a=(int)l;// downcasting
	 SavingAccount savingacccount=(SavingAccount)account;// downcasting	
	// savingacccount.withdraw();	
	 savingacccount.roi();
	}
	else
		if(account instanceof CurrentAccount){
			//CurrentAccount currentacccount= (CurrentAccount)account;// downcasting
            //currentacccount.odLimit();
	}

	}}
class FixedDepositAccount extends Account
{
public void lockingPeriod()
{
	System.out.println("locking period of fixed deposit account ");
}
	
}


public class InheritanceDemo1 {
       public static void main(String args[]){
	
	//SavingAccount savingaccount=new SavingAccount();
	//savingaccount.withdraw();
	//savingaccount.deposit();
  //  Account account=new Account();
   
    //Account account=new SavingAccount();// upcasting 
    // two things r happening here
    //account is called as polymorphic object
    // compile-time and run time 
    //account.withdraw();
    //account.withdraw();
    //account.deposit();
    //account.roi();
   /* CurrentAccount currentaccount  =new CurrentAccount();
    ca.deposit();
    ca.withdraw();
    ca.odLimit();
    FixedDepositAccount fixeddeposit=new FixedDepositAccount();
    fa.deposit();
    fa.withdraw();
    fa.lockingPeriod();*/
   
    	   Caller caller=new Caller();
    caller.callMe((new SavingAccount()));
	//caller.callMe((new CurrentAccount()));	
}
}
