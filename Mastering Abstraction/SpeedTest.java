// File: SpeedTest.java

interface ISample {
    int getValue();
}

abstract class ASample implements ISample {
    int x = 0;
    public int getValue() { return x++; }
}

class SampleImpl extends ASample { }

class ConcreteClass {
    int y = 0;
    public int getValue() { return y++; }
}

public class SpeedTest {
    public static void main(String[] args) {

        final int LOOP = 1_000_000;

        ISample iRef = new SampleImpl();
        ASample aRef = new SampleImpl();
        SampleImpl objRef = new SampleImpl();
        ConcreteClass c = new ConcreteClass();

        long start, end;

        // Interface reference
        start = System.nanoTime();
        for(int i=0; i<LOOP; i++) iRef.getValue();
        end = System.nanoTime();
        System.out.println("Interface via interface ref: " + (end-start));

        // Abstract class reference
        start = System.nanoTime();
        for(int i=0; i<LOOP; i++) aRef.getValue();
        end = System.nanoTime();
        System.out.println("Interface via abstract ref: " + (end-start));

        // Concrete object reference
        start = System.nanoTime();
        for(int i=0; i<LOOP; i++) objRef.getValue();
        end = System.nanoTime();
        System.out.println("Interface via concrete ref: " + (end-start));

        // Concrete class normal method
        start = System.nanoTime();
        for(int i=0; i<LOOP; i++) c.getValue();
        end = System.nanoTime();
        System.out.println("Concrete method: " + (end-start));
    }
}
