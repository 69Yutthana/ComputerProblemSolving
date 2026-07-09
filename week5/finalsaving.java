void main (){
IO.println("Enter initial saving: ");
double IS = Double.parseDouble(IO.readln());
IO.println("Enter monthly saving: ");
double MS = Double.parseDouble(IO.readln());
IO.println("Enter number of months: ");
double NOM = Double.parseDouble(IO.readln());
IO.println("Enter interest percent: ");
double IP = Double.parseDouble(IO.readln());
double totalsaving = IS+MS*NOM;
double interest = (totalsaving*IP)/100;
double finalsaving = totalsaving+interest;
IO.println("Total saving before interest = " +totalsaving);
IO.println("Interest = " +interest);
IO.println("Final saving = " +finalsaving);
}