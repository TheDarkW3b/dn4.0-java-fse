public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private boolean hasGPU;

    public Computer(String cpu, String ram, String storage, boolean hasGPU) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.hasGPU = hasGPU;
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + (hasGPU ? "Yes" : "No"));
    }
}
