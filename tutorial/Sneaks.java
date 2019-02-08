public class Sneaks {

    public static void main(String[] args) {
        int arg1=Integer.parseInt(args[0]);
        int arg2=Integer.parseInt(args[1]);
        int count=1;
        int step=0;
        int minArg = 0;
        if (arg1>arg2) {
            minArg=arg2;
        }
        else {
            minArg=arg1;
        }
        int sneakRing=(int)Math.ceil(minArg/2.0);
        int[][] pyramid=new int[arg1][arg2];
        
            for (int sneakHead=0; sneakHead<sneakRing;sneakHead++) {
                
                    for (int columns = step; columns<arg2-step; columns++) {
                        pyramid[step][columns]=count++;
                    }
                    step++;

                    for (int rows = step; rows<=arg1-step; rows++) {
                        pyramid[rows][arg2-step]=count++;
                    }

                    for (int columns = arg2-step-1;columns>=step-1 && sneakHead<sneakRing-1;columns--) {

                        pyramid[arg1-step][columns]=count++;
                    }
                    for (int rows = arg1-step-1;rows>=step && sneakHead<sneakRing-1;rows--) {
                        pyramid[rows][sneakHead]=count++;
                    }

                
            }

        

        for (int rows=0;
        rows<arg1;
        rows++) {
            for (int columns=0;
            columns<arg2;
            columns++) {
                System.out.print(pyramid[rows][columns]+"\t");
            }
            System.out.println();
        }
    }
}