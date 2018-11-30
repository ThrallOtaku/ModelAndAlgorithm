package com.tht.designModel.structureModel.FacadeMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memery memery;

    public Computer(){
        cpu=new CPU();
        disk=new Disk();
        memery=new Memery();
    }


    public void start(){
        cpu.start();
        disk.start();
        memery.start();
        System.out.println("computer start");
    }

    public void shutdown(){
        memery.shutdown();
        disk.shutdown();
        cpu.shutdown();
        System.out.println("couputer shutdown");
    }

}
