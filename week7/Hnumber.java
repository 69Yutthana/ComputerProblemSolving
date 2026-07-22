void main() {
    IO.println("Enter your number: ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter your number: ");
    int num2 = Integer.parseInt(IO.readln());
    if (num1 > num2) {
        int sum2 = num1 - num2;
        IO.println("The Number: " + sum2);
    } else {
        int sum3 = num1 + num2;
        IO.println("The Number: " + sum3);
    }

}