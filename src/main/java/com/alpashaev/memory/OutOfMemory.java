package main.java.com.alpashaev.memory;

public class OutOfMemory {
    public static void noMemory() {
        int a = (int) (Math.random() * 1000000000);
        int array = (int) Math.pow(a, 46);
        int[] noMemory = new int[array];
    }
}
