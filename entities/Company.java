package entities;

public class Company extends TaxPayer {

	private Integer employeeNumber;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	
	@Override
	public double tax() {
		double taxPercentage;
		if (getEmployeeNumber() > 10) {
			taxPercentage = 0.14;
		} else {
			taxPercentage = 0.16;
		}
		return getAnualIncome() * taxPercentage;
	}
	
	

}
