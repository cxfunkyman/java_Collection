interface First{
    abstract void show();
}

interface Second{
    abstract void display();
}

class Interface_Implementation implements First,Second{
    public void  show() {
        System.out.println("implementing abstract show of interface First\n");
    }
    public void  display() {
        System.out.println("implementing abstract display of interface Second\n");
    }
} 

class Interf_Implem implements First{
    public void  show() {
        System.out.println("implementing abstract show of interface First\n");
    }
    public void  display() {
        System.out.println("implementing class's own display, not abstract one");
    }
} 

public class FirstIntefaceExample {
    public static void main(String[] args) {
        Interface_Implementation obj=new Interface_Implementation();
        obj.show();
        obj.display();
        Interf_Implem obj1=new Interf_Implem();
        obj1.show();
        obj1.display();
    }
}