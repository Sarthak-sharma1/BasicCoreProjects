package FirstPrograms;

class  A{
         public void name(){
             System.out.println("My name is class A");
         }
}
abstract class B{
     abstract void myName();
}
class C extends A{
    @Override
    public void name(){
        super.name();
    }
    public void heyJava(){
        System.out.println("Hey Java");
    }
}
class D extends B{

    @Override
    void myName() {
        System.out.println("my Name is class B,D");
    }
}
public class AC {
    public static void main(String[] args) {
        C a = new C();
        a.name();
        a.heyJava();
        B b = new D();
        b.myName();
    }
}
