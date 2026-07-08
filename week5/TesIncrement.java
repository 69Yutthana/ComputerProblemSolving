void main() {
    int X, num;
    IO.println("-----Pre-increment-----");
    X = 10;
    IO.println("Before X = " + X);
    num = ++X;
    IO.println("num =" + num);
    IO.println("After X = " + X);

    IO.println("-----Post-increment-----");
    X = 10;
    IO.println("Before X = " + X);
    num = X++;
    IO.println("num =" + num);
    IO.println("After X =" + X);
}