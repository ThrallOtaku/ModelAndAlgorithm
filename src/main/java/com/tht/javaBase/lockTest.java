package com.tht.javaBase;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by thrall on 2018/12/22.
 * synchronized 和lock区别
 */
public class lockTest {

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        lock.lock();

        lock.unlock();

    }

    void  syncAddOrder(){
        synchronized(this){

        }
    }

}
