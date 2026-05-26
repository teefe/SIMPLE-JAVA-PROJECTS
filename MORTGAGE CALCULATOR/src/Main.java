void main(String[] args) {
    final byte numberOfMonthPerYear =12;
    final byte percentage = 100;
    int principal = 0;
    double annualInterestRate = 0.0;
    int period = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.print("Principal (UGX1K - UGX1M):");
        int clientValue = scanner.nextInt();
        if  (clientValue >= 1000 && clientValue <= 1000000) {
            principal = clientValue;
            System.out.println("So principal is :" + principal);
            break;
        }else
            System.out.println("Enter value 1K and 1M");
    }

    while (true) {
        System.out.print("Annual Interest Rate:");
        double clientValue =  scanner.nextDouble();
        if (clientValue >= 0 && clientValue <= 30){
            annualInterestRate = clientValue;
            System.out.println("So annual Interest Rate is :" + clientValue);
            break;
        }else
            System.out.println("Enter value 0 and 30");
    }
    while (true) {
        System.out.print("Period (Years):");
        int clientValue = scanner.nextInt();
        if (clientValue >= 1 && clientValue <= 30){
            period = clientValue;
            System.out.println("So period is :" + period);

            break;
        }else
            System.out.println("Enter value 1 or 30");
    }

    int numberOfPayments = numberOfMonthPerYear*period;
    double monthlyInterestRate =  annualInterestRate/ percentage /numberOfMonthPerYear;
    double numerator = monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments);
    double denominator = Math.pow(1+monthlyInterestRate,numberOfPayments) - 1;
    double Mortgage = principal * (numerator/denominator);

    System.out.println("Mortgage is :" + NumberFormat.getCurrencyInstance().format(Mortgage));
}
