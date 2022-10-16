package logicalprog;
public class StopWatch {
    public static void main(String[] args) {

            long starttime = System.currentTimeMillis();
            System.out.println(starttime);
            long stoptime = System.currentTimeMillis();
            System.out.println(stoptime);

            for (int m=0;m<100;m++)

             double elapsedtime =(double) (stoptime-starttime)/1000;
             System.out.println("Elapsed Time= " +elapsedtime);

        }
    }

