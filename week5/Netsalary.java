 void main () {
IO.println("Enter salary: ");
double S = Double.parseDouble(IO.readln());
IO.println("Enter deduction: ");
double DP = Double.parseDouble(IO.readln());
double deduction = (S*DP)/100;
double netsalary = S-deduction;
IO.println("deduction = " +deduction );
IO.println("netsalary = " +netsalary ); 
}
