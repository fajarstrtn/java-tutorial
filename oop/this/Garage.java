
public class Garage {

    public static void main(String[] args) {
        var car = new Vehicle();
        car.setName("Nissan GT-R");
        car.setSeat(2);
        car.setTankCapacity(74D);
        car.setCc(3800D);

        System.out.println(car.getName());
        System.out.println(car.getSeat());
        System.out.println(car.getTankCapacity());
        System.out.println(car.getCc());
    }

}

class Vehicle {

    private String name;
    private Integer seat;
    private Double tankCapacity;
    private Double cc;

    public Vehicle() {
    }

    public Vehicle(String name, Integer seat, Double tankCapacity, Double cc) {
        this.name = name;
        this.seat = seat;
        this.tankCapacity = tankCapacity;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

}
