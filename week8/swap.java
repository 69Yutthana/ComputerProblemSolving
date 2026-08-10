void main() {
    IO.println("Enter your Number1: ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter your Number2: ");
    int num2 = Integer.parseInt(IO.readln());
    IO.println("Current -> number 1 = " + num1 + " and " + "number 2 = " + num2);
    if (num2 > num1) {
        IO.println("The second number is more than the first number ... Do nothing .. Bye bye !!!");
    } else {

        IO.println("Swapping . . . . . . . . . . .");
        int sum = num1;
        num1 = num2;
        num2 = sum;
        IO.println("Now -> number 1 = " + num1 + " and number 2 = " + num2);
    }
}