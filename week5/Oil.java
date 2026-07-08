void main() {
    IO.println("Enter distance (km): ");
    double km = Double.parseDouble(IO.readln());
    IO.println("Enter fuel efficiency (km/liter): ");
    double kml = Double.parseDouble(IO.readln());
    IO.println("Enter fuel price per liter: ");
    double fuelPrice = Double.parseDouble(IO.readln());
    double oilUsed = km / kml;
    double pay = oilUsed * fuelPrice;
    IO.println("Fuel used = " + oilUsed);
    IO.println("Total Cost = " + pay);
}