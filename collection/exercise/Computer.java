
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
        this.powerStatus = false;
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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Computer)) {
            return false;
        }

        Computer computer = (Computer) object;
        return Objects.equals(brand, computer.brand)
                && Objects.equals(processor, computer.processor)
                && ramSize == computer.ramSize
                && storageSize == computer.storageSize
                && Objects.equals(storageType, computer.storageType)
                && Objects.equals(gpu, computer.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, processor, ramSize, storageSize, storageType, gpu);
    }

    private static void iterate(List<Computer> computers, Function<Computer, String> assignee) {
        ListIterator<Computer> listIterator = computers.listIterator();

        while (listIterator.hasNext()) {
            var computer = assignee.apply(listIterator.next());
            System.out.println(computer);
        }
    }

    private static void iterate(List<String> brands, UnaryOperator<String> assignee) {
        ListIterator<String> listIterator = brands.listIterator();

        while (listIterator.hasNext()) {
            var brand = assignee.apply(listIterator.next());
            System.out.println(brand);
        }
    }

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.addAll(new ArrayList<>(Arrays.asList(
                new Computer("HP", "Intel Core i5-1235U", 16, 512, "SSD", "Integrated Intel Iris Xe"),
                new Computer("Acer", "AMD Ryzen 3 3200G", 8, 256, "HDD", "Integrated Radeon Vega 8"),
                new Computer("MSI", "Intel Core i9-13900K", 32, 2000, "SSD", "NVIDIA GeForce RTX 4090"),
                new Computer("Apple", "Apple M2 Pro", 32, 1024, "SSD", "Integrated Apple GPU")
        )));

        iterate(computers, Object::toString);
        iterate(computers, Computer::getBrand);

        computers.sort(Comparator.comparing(Computer::getBrand));
        System.out.println(computers);

        boolean containsAll = computers.containsAll(new ArrayList<>(Arrays.asList(
                new Computer("HP", "Intel Core i5-1235U", 16, 512, "SSD", "Integrated Intel Iris Xe"),
                new Computer("Acer", "AMD Ryzen 3 3200G", 8, 256, "HDD", "Integrated Radeon Vega 8")
        )));

        System.out.println("Do we have both computers? " + containsAll + ".");

        List<String> brands = computers.stream().map(Computer::getBrand).toList();

        iterate(brands, brand -> brand.concat(" is now on sale!"));

        int indexOf = computers.indexOf(new Computer("Apple", "Apple M2 Pro", 32, 1024, "SSD", "Integrated Apple GPU"));

        System.out.println("Index of apple macbook is at " + indexOf + ".");

        computers.set(0, new Computer("Razer", "AMD Ryzen 9 6900HX", 32, 2048, "SSD", "NVIDIA GeForce RTX 4090"));

        System.out.println("All computers: " + computers);

        Computer removedComputer = computers.remove(2);

        System.out.println("Removed computer: " + removedComputer + ".");

        computers.addAll(new ArrayList<>(Arrays.asList(
                new Computer("Lenovo", "Intel Core i5-1135G7", 8, 256, "SSD", "Intel Iris Xe"),
                new Computer("Asus", "AMD Ryzen 7 5800H", 16, 1024, "SSD", "NVIDIA GeForce RTX 3070"),
                new Computer("Acer", "Intel Core i3-1115G4", 4, 128, "HDD", "Intel UHD Graphics"),
                new Computer("MSI", "Intel Core i9-12900HK", 32, 1024, "SSD", "NVIDIA GeForce RTX 3080"),
                new Computer("Samsung", "Intel Core i5-1235U", 8, 512, "SSD", "Intel Iris Xe"),
                new Computer("Microsoft", "Intel Core i7-1165G7", 16, 512, "SSD", "Intel Iris Xe")
        )));

        System.out.println("All computers (including brand-new ones): " + computers);

        computers.sort(Comparator.comparing(Computer::getBrand));

        System.out.println("All computers after being sorted: " + computers);

        computers.add(4, new Computer("Apple", "Apple M2", 16, 1024, "SSD", "Apple M2 GPU"));

        System.out.println("All computers after insertion: " + computers);
    }

}
