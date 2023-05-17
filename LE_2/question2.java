class c2 extends m2{
    void show()
    {
     System.out.println("hello juet");   
    }
}
class m2{
    void show()
    {
        System.out.println("hello world ");
        
    }
}

class Main
{
    public static void main(String[]args)
    {
        m2 w= new m2();
        c2 q= new c2();
        w.show();
        q.show();
    }
}