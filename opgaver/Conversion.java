class Conversion {
    public static void main(String[] args) {
        var scan = new java.util.Scanner(System.in);

        var s = scan.nextInt();

        scan.close();

        var m = s / 60;
        var h = m / 60;
        var day = h / 24;
        var sec = s % 60;
        var mins = m % 60;
        var hours = h % 24;

        System.out.println(s+ " Seconds equals "+ day + " days, " + hours +" hours, " + mins + " minutes and " + sec + " seconds." );
        






    }
}
