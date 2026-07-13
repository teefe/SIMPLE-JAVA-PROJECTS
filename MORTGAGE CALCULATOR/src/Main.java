import java.sql.SQLOutput;

void main(String[] args) {
    final byte numberOfMonthPerYear =12;
    final byte percentage = 100;
    int principal = 0;
    double annualInterestRate = 0.0;
    int period = 0;

    principal = clientInputPrincipal();
    annualInterestRate = clientInputAnnualInterestRate();
    period = clientInputPeriod();

    int numberOfPayments = numberOfMonthPerYear*period;
    double monthlyInterestRate =  annualInterestRate/ percentage /numberOfMonthPerYear;
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageCalculator(principal,monthlyInterestRate,numberOfPayments));
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("-----------------");
    paymentSchedule(monthlyInterestRate,numberOfPayments,principal);

}
public void paymentSchedule(double monthlyInterestRate, int numberOfPayments, int principal) {
    int numberOfPaymentsMade = 1;
    double numerator = (principal * (Math.pow(1+monthlyInterestRate,numberOfPayments) - Math.pow(1+monthlyInterestRate,numberOfPaymentsMade)));
    double denominator = (Math.pow(1+monthlyInterestRate,numberOfPayments)-1);

    double balance =  numerator/ denominator;
    System.out.println("BALANCE: " + balance);
}

public String mortgageCalculator(int principal,double monthlyInterestRate,int numberOfPayments){
    double numerator = monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments);
    double denominator = Math.pow(1+monthlyInterestRate,numberOfPayments) - 1;
    NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
    return mortgageFormat.format(principal * (numerator/denominator));
}

public int clientInputPeriod(){
    while (true) {
        System.out.print("Period (Years):");
        Scanner scanner = new Scanner(System.in);
        int inputPeriod = scanner.nextInt();
        if (inputPeriod >= 1 && inputPeriod <= 30){
            System.out.println("So period is :" + inputPeriod);
            return inputPeriod;
        }else
            System.out.println("Enter value 1 or 30");
    }
}
public int clientInputPrincipal(){
    while (true) {
        System.out.print("Principal (UGX1K - UGX1M):");
        Scanner scanner = new Scanner(System.in);
        int inputPrincipal = scanner.nextInt();
        if  (inputPrincipal >= 1000 && inputPrincipal <= 1000000) {
            System.out.println("So principal is :" + inputPrincipal);
            return inputPrincipal;
        }else
            System.out.println("Enter value 1K and 1M");
    }
}
public double clientInputAnnualInterestRate(){
    while (true) {
        System.out.print("Annual Interest Rate:");
        Scanner scanner = new Scanner(System.in);
        double inputAnnualInterestRate =  scanner.nextDouble();
        if (inputAnnualInterestRate >= 0 && inputAnnualInterestRate <= 30){
            System.out.println("So annual Interest Rate is :" + inputAnnualInterestRate);
            return inputAnnualInterestRate;
        }else
            System.out.println("Enter value 0 and 30");
    }
}


