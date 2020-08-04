package ru.svivanov.AUG_04_2020;

import java.util.HashSet;
import java.util.Set;

public class TASK_03 {
    public static void main(String[] args) {
        PlayerDesk playerDesk = new PlayerDesk(6,6);
        playerDesk.start();
    }

    static class PlayerDesk{
        private int width;
        private int length;
        String[][] desk;
        Set<String> filledCells = new HashSet<>();

        PlayerDesk(int width, int length){
            this.length = length;
            this.width = width;
        }

        public void start(){
            create();
            status();
            fullAll();
        }
        private void create(){
            desk = new String[width][length];
            for(int i = 0; i < width; i++){
                for (int j = 0; j < length; j++){
                    desk[i][j] = "[ ]";
                }
            }
        }

        private void status(){
            for(String[] row : desk){
                for(String elem : row){
                    System.out.print(elem);
                }
                System.out.println();
            }
            System.out.print("\n" + "-".repeat(width*2) + "\n");
        }

        private void fullAll(){
            while (true){
                int w1 = (int) (Math.random() * width);
                String s1 = String.valueOf(w1);
                int l1 = (int) (Math.random() * length);
                String s2 = String.valueOf(l1);
                if(!filledCells.contains(s1+s2)){
                    filledCells.add(s1+s2);
                    desk[w1][l1] = "[X]";
                    status();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (filledCells.size() == width * length){
                    break;
                }
            }
        }

    }
}
