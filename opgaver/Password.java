class Password {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
            var pw = scanner.nextLine();

        scanner.close();

        var pl = pw.length();

        if (pl >= 5 && pl <=8) { 
            System.out.println("password length OK");
        } 
            else if (pl < 5 ) { 
            System.out.println(" password length is to short " );  
            }
                else if (pl > 8) { 
                System.out.println(" password length is to long " );  
                }
            
            


}
}
