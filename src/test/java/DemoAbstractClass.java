abstract class DemoAbstract {
    abstract void display();
}
public class DemoAbstractClass{
    public static void main(String[] args){
    DemoAbstract demo = new DemoAbstract(){
        void display(){
            System.out.println("Hello");
        }
    };
        demo.display();
        System.out.println("How are you?");

    }
}
