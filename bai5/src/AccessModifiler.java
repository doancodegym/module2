class A{
    int data = 40;
    protected void msg(){
        System.out.println("hello");
    }
}

public class AccessModifiler {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();
    }
}
