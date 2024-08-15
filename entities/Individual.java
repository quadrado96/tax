package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double tax() {
		double taxPercentage = 0;
		if (getAnualIncome() < 20000) {
			taxPercentage = 0.15;
		}
		if (getAnualIncome() >= 20000) {
			taxPercentage = 0.25;
		}
		if (getHealthExpenditures() > 0) {
			healthExpenditures = healthExpenditures / 2;
		}
		return (getAnualIncome() * taxPercentage) - healthExpenditures;
	}
	
	

}
