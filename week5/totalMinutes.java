void main() {
    IO.println("Enter hours: ");
    int h = Integer.parseInt(IO.readln());
    IO.println("Enter minutes: ");
    int m = Integer.parseInt(IO.readln());
    int totalMinutes = (h * 60) + m;
    IO.println("Total minutes" + totalMinutes);
}
