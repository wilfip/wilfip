class AreaCalculator {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Hello, human.  What is your name?");

        var name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("Please write the name of a geometric shape:");

        var shape = scanner.nextLine();
        if (shape.equals("rectangle")) {
            System.out.println("What is the width?");
            var width = scanner.nextDouble();
            System.out.println("What is the height?");
            var height = scanner.nextDouble();

            var squareOrNot = (width == height) ? "a square" : "not a square";
            System.out.println("The specified rectangle is " + squareOrNot);

            var area = width * height;
            System.out.println("The area is: " + area);
        } else if (shape.equals("circle")) {
            System.out.println("What is the radius?");
            var radius = scanner.nextDouble();

            var area = radius * radius * Math.PI;
            System.out.println("The area is: " + area);
        } else {
            System.out.println("I don't know the shape '" + shape + "' :-(");
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}