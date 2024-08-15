package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxPayer = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i / c)?");
			char taxPayerType = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (taxPayerType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				taxPayer.add(new Individual(name, anualIncome, healthExpenditures));

			}

			if (taxPayerType == 'c') {
				System.out.print("Number of employees: ");
				int employeeNumber = sc.nextInt();

				taxPayer.add(new Company(name, anualIncome, employeeNumber));

			}

		}

		System.out.println("\nTAXES PAID: ");
		double taxSum = 0;
		for (TaxPayer payer : taxPayer) {
			System.out.println(payer.getName() + ", $" + payer.tax());
			taxSum += payer.tax();
		}
		System.out.println("\nTOTAL TAXES: $" + taxSum);
		
		sc.close();
	}

}
