package creational.builder.bt7_computer;

public class Computer {

    String CPU, RAM, storage, screen;
    // Builder làm rồi, phải che hàm khởi tạo lại
    private Computer (Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer\n" +
                "+ CPU = " + CPU + '\n' +
                "+ RAM = " + RAM + '\n' +
                "+ storage = " + storage + '\n' +
                "+ screen = " + screen + '\n';
    }

    public static class Builder {
        private String CPU, RAM, storage, screen;
        // Builder có trách nhiệm tạo thành phần cho CPU

        public Builder buildCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder buildRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder buildStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder buildScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
