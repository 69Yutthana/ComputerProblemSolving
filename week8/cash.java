void main() {
    IO.println("Enter your Product Price: ");
    int price = Integer.parseInt(IO.readln());
    IO.println("Enter your Quantity: ");
    int quantity = Integer.parseInt(IO.readln());
    int total = price * quantity;
    int cash = 1000;
    int change = cash - total;
    if (total < cash) {
        IO.println("cash = " + change);
    } else {
        IO.println("Not enough money");
    }

}