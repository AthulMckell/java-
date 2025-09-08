public class Computer { 
    public class Processor{
        public void displayDetails(){
            System.out.println("Brand : HP");
            System.out.println("Speed: 4ghz");
        }
    }
        public void instance(){
        Processor processor = new Processor();
        processor.displayDetails();
        }
    
    public static void main(String[] args) {
        Computer comp= new Computer();
        comp.instance();

    }
}
