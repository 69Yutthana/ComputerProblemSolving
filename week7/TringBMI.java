void main() {
    IO.println("Enter your number: ");
    int number = Integer.parseInt(IO.readln());

    if (number == 1) {
        IO.println("Enter the base od the triangle: ");
        double BOTT = Double.parseDouble(IO.readln());
        IO.println("Enter the height of the triangle: ");
        double HOTT = Double.parseDouble(IO.readln());
        double areofthetringle = (1.0 / 2.0) * BOTT * HOTT;
        IO.println("Area of the triangle: " + areofthetringle + " square units");

    } else if (number == 2) {
        IO.print("Enter weight (kg) : ");
        double KG = Double.parseDouble(IO.readln());

        IO.print("Enter height (m) : ");
        double M = Double.parseDouble(IO.readln());

        double BMI = KG / (M * M);

        IO.println(" Weight = " + KG + " Height = " + M + " BMI = " + BMI);
    }

}