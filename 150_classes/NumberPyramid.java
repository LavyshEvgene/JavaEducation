public class NumberPyramid {
    
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int minArg = 0; 
        if (arg1>arg2) {
            minArg=arg2;
        }
        else {
            minArg=arg1;
        }
        int pyramidStep=0;
        int[][] pyramid = new int[arg1][arg2];
        if (arg1>2 && arg2>2) {
            int hightpoint=(int)Math.ceil(minArg/2.0);
            for (int PyramidHead=0; PyramidHead<hightpoint; PyramidHead++)
            {
                for (int rows = pyramidStep; rows<arg1-pyramidStep;rows++){
                   for (int columns=pyramidStep; columns<arg2-pyramidStep;columns++){   
                      pyramid[rows][columns]=pyramidStep+1;
                   } 
                }
                pyramidStep++;
            }
        }
        else {
             for (int rows = 0; rows<arg1; rows++)
        {
            for (int columns=0; columns<arg2; columns++){
                pyramid[rows][columns]=1;
            }
        }
        }
 /*        for (int rows = 0; rows<arg1; rows++)
        {
            for (int columns=0; columns<arg2; columns++){
                System.out.print("-");
            }
            System.out.println();
        }
    }*/
        //Вывод массива
        for (int rows = 0; rows<arg1; rows++)
        {
            for (int columns=0; columns<arg2; columns++){
                System.out.print(pyramid[rows][columns]);
            }
            System.out.println();
        }
}
}