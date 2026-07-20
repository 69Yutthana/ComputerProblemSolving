void main() {
    IO.println("Enter your midtrem score: ");
    int mid = Integer.parseInt(IO.readln());
    IO.println("Enter your final score: ");
    int fiNal = Integer.parseInt(IO.readln());
    int sum = mid + fiNal;
    if (sum >= 50) {
        IO.println("Your total score is " + sum + " . The result is Pass!!");
    } else {
        IO.println("Your total score is " + sum + " . The result is Fail!!");
    }

}