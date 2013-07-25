package structural.pattern.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securitycode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBacnk bankWelcome;
	
	public BankAccountFacade(int newAcctNum, int newSecCode)
	{
		accountNumber = newAcctNum;
		securitycode = newSecCode;
		
		bankWelcome = new WelcomeToBacnk();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}

	public int getSecurityCode()
	{
		return securitycode;
	}
	
	public void withdrawCash(double cashToGet)
	{
		if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) && fundChecker.haveEnoughMoeny(cashToGet))
		{
			fundChecker.decreaseCashInAccount(cashToGet);
			System.out.println("Transaction complete");
		}
		else
		{
			System.out.println("Transaction failed");
		}
	}
	
	public void DepositCash(double cashToPost)
	{
		if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()))
		{
			fundChecker.makeDeposit(cashToPost);
			System.out.println("Transaction complete");
		}
		else
		{
			System.out.println("Transaction failed");
		}
	}
}
