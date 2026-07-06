void main() {
    IO.print("Enter weight (kg) : ");
    double KG = Double.parseDouble(IO.readln());

    IO.print("Enter height (m) : ");
    double M = Double.parseDouble(IO.readln());

    double BMI = KG / (M * M);

    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(KG, M, BMI));
}
