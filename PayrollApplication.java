import java.util.*;
public class PayrollApplication 
{
	String name;
	int hours;
	float payRate;
	float federalTax;
	float stateTax;
	float preTaxPay;
	float calcStateTax;
	float calcFedTax;
	float netPay;
	Scanner input = new Scanner(System.in);
	
	public PayrollApplication() 
	{
	System.out.println("Please enter a name: ");
	this.name = input.nextLine();

	System.out.println("Please enter hours worked in a week: ");
	this.hours = input.nextInt();
	
	System.out.println("Please enter pay rate: ");
	this.payRate = input.nextFloat();
	
	System.out.println("Please enter Federal Tax withholding rate as a decimal(ex: .12 = 12%): ");
	this.federalTax = input.nextFloat();
	
	System.out.println("Please enter State Tax withholding rate as a decimal(ex: .07 = 7%): ");
	this.stateTax = input.nextFloat();
	
	input.close();
	
	this.preTaxPay = hours * payRate;
	this.calcStateTax = stateTax * preTaxPay;
	this.calcFedTax = federalTax * preTaxPay;
	this.netPay = preTaxPay - calcStateTax - calcFedTax;
	}
	
	public static void main(String[] args) 
	{
		PayrollApplication showInfo = new PayrollApplication();
		System.out.println("Employee name: " + showInfo.name);
		System.out.println("Hours worked: " + showInfo.hours);
		System.out.println("Pay rate: $" + showInfo.payRate);
		System.out.println("Gross pay: $" + showInfo.preTaxPay);
		System.out.println("Deductions:");
		System.out.println("Federal withholding (" + showInfo.federalTax + "%): $" + showInfo.calcFedTax);
		System.out.println("State withholding (" + showInfo.stateTax + "%): $" + showInfo.calcStateTax);
		System.out.println("Net pay: $" + showInfo.netPay);
	}	
}
