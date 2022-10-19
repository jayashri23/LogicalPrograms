package logicalprog;
public class StopWatch {
//create method
    public void display() {

        System.out.println("Stopwatch Elapsed Time: ");
        //create object of the stopwatch class

        //get start time
        long start =System.nanoTime();
        //get end time
        long end =System.nanoTime();
        //execution time in seconds
        long elapsedTime =(end -start);
        System.out.println( elapsedTime+ " nanoseconds");
    }
    public static void main(String[] args) {
        //create object of the stopwatch class
        StopWatch sw= new StopWatch();
        //call object
        sw.display();
    }
}