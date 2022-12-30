import java.util.*;

class FinanceCalculator{
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Investment Amount");
		double InvestementAmount = sc.nextDouble();
		System.out.println("Enter Interest Rate");
		int rate = sc.nextInt();
		System.out.println("Enter No. Of Months to Invest");
		int period = sc.nextInt();
		System.out.println("Enter Total Monthly Expense");
		double expense = sc.nextDouble();
		System.out.println();
		AnnualGrossIncomeCalculator( InvestementAmount, period, expense, rate);
		System.out.println();

		
	}
	
	private static void AnnualGrossIncomeCalculator(double investment,int period, double expense, int InterestRate)
	{
		
		int Initialperiod = 1;

		 while(Initialperiod <= period){
		 
		 
		double calculateMonthlyInterestValue = ( investment * InterestRate ) / 100;
		double calculateMonthlyGrossIncome = calculateMonthlyInterestValue  + investment;
		double calculateMonthlyNetIncome = calculateMonthlyGrossIncome  - expense;


		System.out.println();
		System.out.println("Principal: "+Math.round(investment) + " *** " + " Interest: "+Math.round(calculateMonthlyInterestValue) + " *** "+ "Exepenses: "+expense + " *** "  + "Gross Income: "+ Math.round(calculateMonthlyGrossIncome) + " *** "+ " Net Income: "+ Math.round(calculateMonthlyNetIncome));
		System.out.println();

		 investment  = calculateMonthlyNetIncome; 

		 Initialperiod ++;

			 
		}
	}

}