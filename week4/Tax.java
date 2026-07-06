void main() {
    IO.print("Enter Salary : ");
    double Salary = Double.parseDouble(IO.readln());

    double Tax = Salary * 0.1;

    IO.println(" Tax = " + Tax);
}