package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount(){
		super();
	}

	public BusinessAccount(String holder, Integer number, Double balance, Double loanLimit) {
		super(holder, number, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
		
		
	}
}
