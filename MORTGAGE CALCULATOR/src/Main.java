void main() {
    final byte numberOfMonthPerYear =12;
    final byte percetage = 100;

    while(true){
        System.out.println("Principal (1K - 1M):");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        if (scanner.nextInt() >= 1000 && scanner.nextInt() <= 1000000 ){
            System.out.println("So principal is :" + principal);
            break;
        }else {
            System.out.println("Incorrect input");
        }

    }

}
