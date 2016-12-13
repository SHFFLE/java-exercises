package aoc2016;

public class daytwelve {
    public static void main(String[] args) {
        String[] input = {"cpy 1 a" ,
                "cpy 1 b" ,
                "cpy 26 d" ,
                "jnz c 2" ,
                "jnz 1 5" ,
                "cpy 7 c" ,
                "inc d" ,
                "dec c" ,
                "jnz c -2" ,
                "cpy a c" ,
                "inc a" ,
                "dec b" ,
                "jnz b -2" ,
                "cpy c b" ,
                "dec d" ,
                "jnz d -6" ,
                "cpy 17 c" ,
                "cpy 18 d" ,
                "inc a" ,
                "dec d" ,
                "jnz d -2" ,
                "dec c" ,
                "jnz c -5"};
        int a = 0;
        int b = 0;
        int c = 1;
        int d = 0;
        for (int i = 0; i < input.length; i++) {
            String[] current = input[i].split(" ");
            int current1;
            if(current[1].equals("a")){
                current1 = a;
            } else if (current[1].equals("b")){
                current1 = b;
            } else if (current[1].equals("c")){
                current1 = c;
            } else if (current[1].equals("d")){
                current1 = d;
            } else {
                current1 = Integer.valueOf(current[1]);
            }
            if(current[0].equals("cpy")){
                if(current[2].equals("a")){
                    a = current1;
                } else if (current[2].equals("b")){
                    b = current1;
                } else if (current[2].equals("c")){
                    c = current1;
                } else if (current[2].equals("d")){
                    d = current1;
                }
            } else if (current[0].equals("inc")){
                if(current[1].equals("a")){
                    a++;
                } else if(current[1].equals("b")){
                    b++;
                } else if(current[1].equals("c")){
                    c++;
                } else if(current[1].equals("d")){
                    d++;
                }
            } else if (current[0].equals("dec")){
                if(current[1].equals("a")){
                    a--;
                } else if(current[1].equals("b")){
                    b--;
                } else if(current[1].equals("c")){
                    c--;
                } else if(current[1].equals("d")){
                    d--;
                }
            } else {
                if (current1 != 0){
                    i += Integer.valueOf(current[2])-1;
                }
            }
        }
        System.out.println(a);
    }
}
