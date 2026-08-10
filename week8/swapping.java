void main() {
    IO.println("Enter your Number: ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter your Number: ");
    int num2 = Integer.parseInt(IO.readln());
    IO.println("Current -> number 1 = " + num1 + " and " + "number 2 = " + num2);
    IO.println("Swapping . . . . . . . . . . .");
    int sum = num1;
    num1 = num2;
    num2 = sum;
    IO.println("Now -> number 1 = " + num1 + " and number 2 = " + num2);
}