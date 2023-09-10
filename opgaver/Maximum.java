class Maximum {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        scanner.close();

        if (a > b && a > c) { 
            System.out.println("Variable a has the greatest value: " + a );
        } 
             else if (b > a && b > c) { 
                System.out.println("Variable b has the greatest value: " + b);  
             }
                else if (c > a && c > b) { 
                    System.out.println("Variable c has the greatest value: " + c);  
                }
}
}