public class Overriding {
    void show(){
        System.out.println("1");
    }
}

class A  extends Overriding{
    void show(){
        System.out.println("2");
    }
}

public class Main(){
public static void main(String args[]){
    Overriding obj1 = new Overriding();
    obj1.show();
    
    Overriding obj2 = new A();
    obj2.show();
    
}
}

