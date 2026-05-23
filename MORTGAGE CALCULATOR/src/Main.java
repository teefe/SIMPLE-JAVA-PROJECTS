//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final int NUMBER_OF_MONTH_IN_A_YEAR = 12;

    System.out.print("Principal:");
    Scanner scanner = new Scanner(System.in);
    int AMOUNT_OF_PRINCIPAL = scanner.nextInt();
    System.out.println("So you need a principal of " + AMOUNT_OF_PRINCIPAL);

    System.out.print("ANNUAL_INTEREST_RATE:");
    float ANNUAL_INTEREST_RATE = scanner.nextFloat();
    System.out.println("so with annual interest of "+ ANNUAL_INTEREST_RATE);

    System.out.print("Period (Years):");
    float Period = scanner.nextFloat();
    System.out.println("Period (Years) "+ Period);

    float MONTHLY_INTEREST_RATE =ANNUAL_INTEREST_RATE/100/12;
    float NUMBER_OF_MONTHLY_PAYMENTS = Period*12;
    double Mortgage = 0;
    double Numerator = Math.pow((1+MONTHLY_INTEREST_RATE),NUMBER_OF_MONTHLY_PAYMENTS) * MONTHLY_INTEREST_RATE;
    double Denominator = Math.pow((1+MONTHLY_INTEREST_RATE),NUMBER_OF_MONTHLY_PAYMENTS) - 1;
    Mortgage = AMOUNT_OF_PRINCIPAL * Numerator /Denominator;
    System.out.println(NumberFormat.getCurrencyInstance().format(Mortgage));
}
