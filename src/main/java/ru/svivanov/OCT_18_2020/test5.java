package ru.svivanov.OCT_18_2020;

import java.util.ArrayList;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        test5();
    }
    static void test5() { List<Thread> threads = new ArrayList<>(); for (int i = 0; i < 5; i++) { threads.add(new Thread(new ThreadImpl())); } threads.forEach(Thread::start); threads.forEach(t -> { try { t.join(); } catch (InterruptedException ignored) { } });}private static class ThreadImpl implements Runnable { private static int counter = 0; @Override public synchronized void run() { int localValue = ++counter; try { Thread.sleep((long) (Math.random() * 20)); } catch (InterruptedException ignored) { } System.out.println(localValue); }}
}
