package aoc2016;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class dayeight {
    public static void main(String[] args) {
        String[] input = {"rect 1x1" ,
                "rotate row y=0 by 10" ,
                "rect 1x1" ,
                "rotate row y=0 by 10" ,
                "rect 1x1" ,
                "rotate row y=0 by 5" ,
                "rect 1x1" ,
                "rotate row y=0 by 3" ,
                "rect 2x1" ,
                "rotate row y=0 by 4" ,
                "rect 1x1" ,
                "rotate row y=0 by 3" ,
                "rect 1x1" ,
                "rotate row y=0 by 2" ,
                "rect 1x1" ,
                "rotate row y=0 by 3" ,
                "rect 2x1" ,
                "rotate row y=0 by 2" ,
                "rect 1x1" ,
                "rotate row y=0 by 3" ,
                "rect 2x1" ,
                "rotate row y=0 by 5" ,
                "rotate column x=0 by 1" ,
                "rect 4x1" ,
                "rotate row y=1 by 12" ,
                "rotate row y=0 by 10" ,
                "rotate column x=0 by 1" ,
                "rect 9x1" ,
                "rotate column x=7 by 1" ,
                "rotate row y=1 by 3" ,
                "rotate row y=0 by 2" ,
                "rect 1x2" ,
                "rotate row y=1 by 3" ,
                "rotate row y=0 by 1" ,
                "rect 1x3" ,
                "rotate column x=35 by 1" ,
                "rotate column x=5 by 2" ,
                "rotate row y=2 by 5" ,
                "rotate row y=1 by 5" ,
                "rotate row y=0 by 2" ,
                "rect 1x3" ,
                "rotate row y=2 by 8" ,
                "rotate row y=1 by 10" ,
                "rotate row y=0 by 5" ,
                "rotate column x=5 by 1" ,
                "rotate column x=0 by 1" ,
                "rect 6x1" ,
                "rotate row y=2 by 7" ,
                "rotate row y=0 by 5" ,
                "rotate column x=0 by 1" ,
                "rect 4x1" ,
                "rotate column x=40 by 2" ,
                "rotate row y=2 by 10" ,
                "rotate row y=0 by 12" ,
                "rotate column x=5 by 1" ,
                "rotate column x=0 by 1" ,
                "rect 9x1" ,
                "rotate column x=43 by 1" ,
                "rotate column x=40 by 2" ,
                "rotate column x=38 by 1" ,
                "rotate column x=15 by 1" ,
                "rotate row y=3 by 35" ,
                "rotate row y=2 by 35" ,
                "rotate row y=1 by 32" ,
                "rotate row y=0 by 40" ,
                "rotate column x=32 by 1" ,
                "rotate column x=29 by 1" ,
                "rotate column x=27 by 1" ,
                "rotate column x=25 by 1" ,
                "rotate column x=23 by 2" ,
                "rotate column x=22 by 1" ,
                "rotate column x=21 by 3" ,
                "rotate column x=20 by 1" ,
                "rotate column x=18 by 3" ,
                "rotate column x=17 by 1" ,
                "rotate column x=15 by 1" ,
                "rotate column x=14 by 1" ,
                "rotate column x=12 by 1" ,
                "rotate column x=11 by 3" ,
                "rotate column x=10 by 1" ,
                "rotate column x=9 by 1" ,
                "rotate column x=8 by 2" ,
                "rotate column x=7 by 1" ,
                "rotate column x=4 by 1" ,
                "rotate column x=3 by 1" ,
                "rotate column x=2 by 1" ,
                "rotate column x=0 by 1" ,
                "rect 34x1" ,
                "rotate column x=44 by 1" ,
                "rotate column x=24 by 1" ,
                "rotate column x=19 by 1" ,
                "rotate row y=1 by 8" ,
                "rotate row y=0 by 10" ,
                "rotate column x=8 by 1" ,
                "rotate column x=7 by 1" ,
                "rotate column x=6 by 1" ,
                "rotate column x=5 by 2" ,
                "rotate column x=3 by 1" ,
                "rotate column x=2 by 1" ,
                "rotate column x=1 by 1" ,
                "rotate column x=0 by 1" ,
                "rect 9x1" ,
                "rotate row y=0 by 40" ,
                "rotate column x=43 by 1" ,
                "rotate row y=4 by 10" ,
                "rotate row y=3 by 10" ,
                "rotate row y=2 by 5" ,
                "rotate row y=1 by 10" ,
                "rotate row y=0 by 15" ,
                "rotate column x=7 by 2" ,
                "rotate column x=6 by 3" ,
                "rotate column x=5 by 2" ,
                "rotate column x=3 by 2" ,
                "rotate column x=2 by 4" ,
                "rotate column x=0 by 2" ,
                "rect 9x2" ,
                "rotate row y=3 by 47" ,
                "rotate row y=0 by 10" ,
                "rotate column x=42 by 3" ,
                "rotate column x=39 by 4" ,
                "rotate column x=34 by 3" ,
                "rotate column x=32 by 3" ,
                "rotate column x=29 by 3" ,
                "rotate column x=22 by 3" ,
                "rotate column x=19 by 3" ,
                "rotate column x=14 by 4" ,
                "rotate column x=4 by 3" ,
                "rotate row y=4 by 3" ,
                "rotate row y=3 by 8" ,
                "rotate row y=1 by 5" ,
                "rotate column x=2 by 3" ,
                "rotate column x=1 by 3" ,
                "rotate column x=0 by 2" ,
                "rect 3x2" ,
                "rotate row y=4 by 8" ,
                "rotate column x=45 by 1" ,
                "rotate column x=40 by 5" ,
                "rotate column x=26 by 3" ,
                "rotate column x=25 by 5" ,
                "rotate column x=15 by 5" ,
                "rotate column x=10 by 5" ,
                "rotate column x=7 by 5" ,
                "rotate row y=5 by 35" ,
                "rotate row y=4 by 42" ,
                "rotate row y=2 by 5" ,
                "rotate row y=1 by 20" ,
                "rotate row y=0 by 45" ,
                "rotate column x=48 by 5" ,
                "rotate column x=47 by 5" ,
                "rotate column x=46 by 5" ,
                "rotate column x=43 by 5" ,
                "rotate column x=41 by 5" ,
                "rotate column x=38 by 5" ,
                "rotate column x=37 by 5" ,
                "rotate column x=36 by 5" ,
                "rotate column x=33 by 1" ,
                "rotate column x=32 by 5" ,
                "rotate column x=31 by 5" ,
                "rotate column x=30 by 1" ,
                "rotate column x=28 by 5" ,
                "rotate column x=27 by 5" ,
                "rotate column x=26 by 5" ,
                "rotate column x=23 by 1" ,
                "rotate column x=22 by 5" ,
                "rotate column x=21 by 5" ,
                "rotate column x=20 by 1" ,
                "rotate column x=17 by 5" ,
                "rotate column x=16 by 5" ,
                "rotate column x=13 by 1" ,
                "rotate column x=12 by 3" ,
                "rotate column x=7 by 5" ,
                "rotate column x=6 by 5" ,
                "rotate column x=3 by 1" ,
                "rotate column x=2 by 3"};
        int[][] display = new int[6][50];
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i].length; j++) {
                display[i][j] = 0;
            }
        }

        for (int i = 0; i < input.length; i++) {
            if(input[i].startsWith("rect")){
                int x = Integer.valueOf(input[i].substring(5, input[i].indexOf('x')));
                int y = Integer.valueOf(input[i].substring(input[i].indexOf('x')+1));
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < x; k++) {
                        display[j][k] = 1;
                    }
                }
            } else if (input[i].startsWith("rotate row")){
                int y = Integer.valueOf(input[i].substring(13, input[i].indexOf('b')-1));
                int by = Integer.valueOf(input[i].substring(input[i].lastIndexOf('y')+2));
                for (int j = 0; j < by; j++) {
                    int storage;
                    storage = display[y][49];
                    for (int k = 49; k > 0; k--) {
                        display[y][k] = display[y][k-1];
                    }
                    display[y][0] = storage;
                }
            } else if (input[i].startsWith("rotate column")){
                int x = Integer.valueOf(input[i].substring(input[i].indexOf('=')+1, input[i].indexOf('b')-1));
                int by = Integer.valueOf(input[i].substring(input[i].lastIndexOf('y')+2));
                for (int j = 0; j < by; j++) {
                    int storage;
                    storage = display[5][x];
                    for (int k = 5; k > 0; k--) {
                        display[k][x] = display[k-1][x];
                    }
                    display[0][x] = storage;
                }
            }
        }

        visualize(display);
    }

    public static void visualize(int[][] display){
        int count = 0;
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i].length; j++) {
                if(display[i][j] == 0){
                    System.out.print("  ");
                }
                if(display[i][j] == 1){
                    count++;
//                                              Easier to read with double-width letters
                    System.out.print("XX");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(count);
    }
}
