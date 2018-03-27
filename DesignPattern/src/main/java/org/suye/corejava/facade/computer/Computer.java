package org.suye.corejava.facade.computer;

/**
 * Created by suye on 2018/3/27.
 */
public class Computer {
    private Cpu cpu;

    private Memory memory;

    private Disk disk;

    public Computer(Cpu cpu, Memory memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void startup() {
        cpu.startup();
        memory.startup();
        disk.startup();
    }

    public void shutdown() {
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
    }
}
