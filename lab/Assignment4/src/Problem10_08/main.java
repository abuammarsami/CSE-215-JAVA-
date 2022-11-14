/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem10_08;

/**
 *
 * @author Acer
 */
public class main {
    public static void main(String[] args) {
		// Create two tax objects
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax(); // Current Year

		// Tax rates for 2001
		double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
		tax2001.setRates(rates2001);

		// The 2001 brackets for each rate for all the filing statuses
		int[][] brackets2001 = {
			{27050, 65550, 136750, 297350},  // Single filer
			{45200, 109250, 166500, 297350}, // Married jointly
														// -or qualifying widow(er)
			{22600, 54625, 83250, 148675},  	// Married separately
			{36250, 93650, 151650, 297350} 	// Head of household
		};
		tax2001.setBrackets(brackets2001);

		// Print tax tables for 2001 and 2009
		final double FROM = 50000;		// Start table taxable income range at $50,000
		final double TO = 60000;		// End table taxable income range at $60,000
		final double INTERVAL = 1000;	// Increase each row by $1000

		System.out.println(
			"\n2001 tax tables for taxable income from $50,000 to $60,000");
		print(tax2001, FROM, TO, INTERVAL);

		System.out.println(
			"\n2009 tax tables for taxable income from $50,000 to $60,000");
		print(tax2009, FROM, TO, INTERVAL);
		
	}

	/** Display taxable for  taxable income with specified range and interval */
	public static void print(Tax tax, double from, double to, double interval) {
		// Print header
		System.out.println(
			"---------------------------------------------------------------------\n" +
			"Taxable       Single      Married Joint       Married        Head of\n" +
			"Income                    or Qualifying       Separate       a House\n" +
			"                          Widow(er)\n" +
			"---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = from; 
			  taxableIncome <= to; taxableIncome += interval) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-13.0f", taxableIncome);
			tax.setFilingStatus(tax.SINGLE_FILER);
			System.out.printf("%8.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%15.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_SEPARATELY);
			System.out.printf("%18.2f", tax.getTax());
			tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%15.2f\n", tax.getTax());
		}
	}
}

