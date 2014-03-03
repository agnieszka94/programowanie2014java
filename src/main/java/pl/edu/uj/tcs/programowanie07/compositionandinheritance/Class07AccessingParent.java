package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/**
 * A simple class accessing Overriden method of a parent.
 * 
 * @author marcin
 *
 */

public class Class07AccessingParent {
    static class Processor {
        int id;
        Processor(int id){
            this.id = id;
        }
        @Override
        public String toString(){
            return "processor: " + id;
        }
    }
    static class Processor64 extends Processor{
        Processor64(int id) {
            super(id);
        }
        @Override
        public String toString() {
            return super.toString() + " (but 64bits)";
        }
    }
    public static void main(String[] args) {
        System.out.println(new Processor64(128));
    }
}
