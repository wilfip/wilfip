class Distance {
    public static void main(String[] args) {
        var scan = new java.util.scannner(system.in);

        var a = scan.nextInt();
        var b = scan.nextInt();
        var x = scan.nextInt();
        var y = scan.nextInt();
        
        scan.close();

        var d = a * x - y + b / math.sqrt(1 + a * a);
       
        system.out.println( "The distance is " + d );
    }
}
