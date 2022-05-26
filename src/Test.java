public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ford");
        car1.setColor("Red");
        car1.setYear(2018);
        car1.setSpeed(100);
        car1.setDoors(4);
        System.out.println("Car 1: " + car1.getModel() + " " + car1.getColor() + " " + car1.getYear() + " "
                + car1.getSpeed() + " " + car1.getDoors());

    }

}
