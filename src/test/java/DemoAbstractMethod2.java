abstract class DemoAbstractMth2 {
    abstract void display();
}

abstract class Concreteclass extends DemoAbstractMth2{
    void display(){
        System.out.println("Hello");
    }
    abstract void display1();
}

class Concreteclass1 extends Concreteclass{
    void display1(){
        System.out.println("Helloooi");
    }
}
public class DemoAbstractMethod2{
    public static void main(String[] args){
        Concreteclass1 conc = new Concreteclass1();
        conc.display();
        conc.display1();
        System.out.println("How are you?");
    }
}
