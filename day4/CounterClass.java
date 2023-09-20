package day4;
public class CounterClass {
    private int count;
    public CounterClass() {
        this.count = 0;
    }
    public CounterClass(int initialValue) {
        this.count = initialValue;
    }
    public void increment() {
        this.count++;
    }
    public void decrement() {
        this.count--;
    }
    public int getCount() {
        return this.count;
    }
    public static void main(String[] args) {
        CounterClass counter1 = new CounterClass();
        CounterClass counter2 = new CounterClass(5);
        counter1.increment();
        counter2.decrement();
        System.out.println(counter1.getCount()); 
        System.out.println(counter2.getCount());
    }
}
