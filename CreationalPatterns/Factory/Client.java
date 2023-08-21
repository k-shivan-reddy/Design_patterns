package Factory;

class childClass1 
{
    public void func()
    {
        System.out.println("class1");
    }
}

class childClass2
{
    public void func()
    {
        System.out.println("class2");
    }
}
public class Client {
     public static void main(String[] args) 
     {
        String value = "child1";
        if(value == "child1")
        {
            childClass1 p =new childClass1();
             p.func();
        }else if (value == "child2")
        {
            childClass2 p2 =new childClass2();
            p2.func();
        } 

        // USing Factory Pattern
        Parentclass p = FactoryClass.factoryMethod(value);
        p.func();

    }
    
}
