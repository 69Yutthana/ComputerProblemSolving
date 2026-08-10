void main() {
    IO.println("Enter your Product Price: ");
    double p = Double.parseDouble(IO.readln());
    IO.println("Enter your Quantity: ");
    int q = Integer.parseInt(IO.readln());
    double total = p * q;
    if (q > 10) {
        IO.println("You get a 10% discount !");
        total = total * 0.9;
    }
    IO.println("Total print " + total + "Baht");
}