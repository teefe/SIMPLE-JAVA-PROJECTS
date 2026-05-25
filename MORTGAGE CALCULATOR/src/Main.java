void main() {
    final byte numberOfMonthPerYear =12;
    final byte percetage = 100;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal (1K - 1M):");
    int principal = scanner.nextInt();
    System.out.println("So principal is :" + principal);

    System.out.print("Annual Interest Rate:");
    double annualInterestRate =  scanner.nextDouble();
    System.out.println("So annual Interest Rate is :" + annualInterestRate);
    double monthlyInterestRate =  annualInterestRate/percetage/numberOfMonthPerYear;

    System.out.print("Period (Years)");
    int period = scanner.nextInt();
    System.out.println("So period is :" + period);

    int numberOfPayments = numberOfMonthPerYear*period;

    double numerator = monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments);
    double denominator = Math.pow(1+monthlyInterestRate,numberOfPayments) - 1;
    double Mortgage = principal * (numerator/denominator);

    System.out.println("Mortgage is :" + Mortgage);
}
