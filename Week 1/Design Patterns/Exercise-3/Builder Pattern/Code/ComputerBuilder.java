public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private boolean hasGPU;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, ram, storage, hasGPU);
    }
}
