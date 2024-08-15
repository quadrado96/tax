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
		if (getEmployeeNumber() > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
}