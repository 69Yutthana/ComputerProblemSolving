void main() {
    IO.print("Enter Width (W) : ");
    double W = Double.parseDouble(IO.readln());

    IO.print("Enter Length (L) : ");
    double L = Double.parseDouble(IO.readln());

    double BSA = (W * L) / 360;

    IO.println(" body surface area = " + BSA);
}