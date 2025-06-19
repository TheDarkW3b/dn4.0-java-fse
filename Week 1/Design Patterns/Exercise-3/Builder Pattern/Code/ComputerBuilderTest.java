public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer gamingPC = new ComputerBuilder()
            .setCpu("Intel i7")
            .setRam("16GB")
            .setStorage("1TB SSD")
            .setHasGPU(true)
            .build();

        gamingPC.showSpecs();
    }
}
