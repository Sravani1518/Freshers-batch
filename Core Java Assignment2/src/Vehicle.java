
public abstract class Vehicle
//private abstract class Vehicle
//final abstract class Vehicle





{ //1.making class as abstract because it contains abstract methods
abstract void start(); // only abstract method declaration not implementation
void display() {
System.out.println("display non abstract method"); //non abstract method
}


public static void main(String[] args) {
Scooter s= new Scooter();
s.start();
Car c= new Car();
c.start();
//Vehicle v=new Vehicle() --cannot instantiate abstract class
}
}