package structural.pattern.facade;

public class SecurityCodeCheck {

private int securityCode = 1234;
	
	
	public SecurityCodeCheck() {
		
	}
	
	public boolean accountActive(int securityCode)
	{
		if(securityCode == this.getSecurityCode())
		{
			return true;
		}
		
		return false;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public boolean isCodeCorrect(int securityCode2) {
		return true;
	}

}
