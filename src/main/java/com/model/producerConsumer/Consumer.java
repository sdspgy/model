package com.model.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                consume(queue.take());
            } catch (InterruptedException e) {
            }
        }
    }

    private void consume(Integer n) {

        System.out.println("Thread:" + Thread.currentThread().getId() + " consume:" + n);

    }

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);

        Producer p = new Producer(queue);

        Consumer c1 = new Consumer(queue);

        Consumer c2 = new Consumer(queue);


        new Thread(p).start();

        new Thread(c1).start();

        new Thread(c2).start();
    }
}
