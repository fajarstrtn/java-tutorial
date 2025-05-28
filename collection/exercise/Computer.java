
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.function.Function;

public class Computer {

    private String brand;
    private String processor;
    private int ramSize;
    private int storageSize;
    private String storageType;
    private String gpu;
    private boolean powerStatus;

    public Computer(String brand, String processor, int ramSize, int storageSize, String storageType, String gpu) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.storageType = storageType;
        this.gpu = gpu;
        this.powerStatus = false; // default is off.
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    public void powerOn() {
        powerStatus = true;
        System.out.println("Computer is now ON.");
    }

    public void powerOff() {
        powerStatus = false;
        System.out.println("Computer is now OFF.");
    }

    public void restart() {
        if (powerStatus) {
            System.out.println("Restarting computer...");
        } else {
            System.out.println("Computer is OFF. Cannot restart.");
        }
    }

    public void upgradeRam(int additionalRam) {
        ramSize += additionalRam;
        System.out.println("RAM upgraded. Total RAM: " + ramSize + " GB");
    }

    public void upgradeStorage(int additionalStorage) {
        storageSize += additionalStorage;
        System.out.println("Storage upgraded. Total Storage: " + storageSize + " GB");
    }

    @Override
    public String toString() {
        return String.format("""
        {"brand": "%s", "processor": "%s", "ramSize": "%d", "storageSize": "%d", "storageType": "%s", "gpu": "%s"}
        """, brand, processor, ramSize, storageSize, storageType, gpu);
    }

    private static void iterate(List<Computer> computers, Function<Computer, String> assignee) {
        ListIterator<Computer> listIterator = computers.listIterator();
        
        while(listIterator.hasNext()) {
            String computer = assignee.apply(listIterator.next());
            System.out.println(computer);
        }
    }

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.addAll(new ArrayList<>(Arrays.asList(
                new Computer("MSI", "Intel Core i9-13900K", 32, 2000, "SSD", "NVIDIA GeForce RTX 4090"),
                new Computer("HP", "Intel Core i5-1235U", 16, 512, "SSD", "Integrated Intel Iris Xe"),
                new Computer("Acer", "AMD Ryzen 3 3200G", 8, 256, "HDD", "Integrated Radeon Vega 8"),
                new Computer("Apple", "Apple M2 Pro", 32, 1024, "SSD", "Integrated Apple GPU")
        )));

        iterate(computers, Object::toString);
        iterate(computers, Computer::getBrand);
    }

}
