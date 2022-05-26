public class Car {
    private String model;
    private String color;
    private int year;
    private int speed;
    private int doors;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be greater than 0");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setDoors(int doors) {
        if (doors > 0 && doors < 5) {
            this.doors = doors;
        } else {
            System.out.println("Doors must be between 1 and 5");
        }
    }

    public int getDoors() {
        return doors;
    }
}
