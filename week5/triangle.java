void main () {
IO.println("Enter the base od the triangle: ");
double BOTT = Double.parseDouble(IO.readln());
IO.println("Enter the height of the triangle: ");
double HOTT = Double.parseDouble(IO.readln());
double areofthetringle = (1.0/2.0)*BOTT*HOTT;
IO.println("Area of the triangle: " +areofthetringle +" square units" );
IO.println("-----------------------------------------------------");

IO.println("Enter the length of the rectangle: ");
double LOTR = Double.parseDouble(IO.readln());
IO.println("Enter the width of the rectangle: ");
double WOTR = Double.parseDouble(IO.readln());
double areoftherectangle = LOTR*WOTR;
IO.println("Area of the rectangle: " +areoftherectangle +" square units");
}