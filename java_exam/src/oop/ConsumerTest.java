package oop;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer consumer = new Consumer();

        consumer.money = 3500;
        consumer.maxWeight = 2000;

        consumer.buy(3);   

        consumer.showResult();
    }
}

