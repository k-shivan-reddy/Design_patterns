package Factory;
interface Parentclass
{
    void func();
}
class childClass1Int implements Parentclass
{
    public void func()
    {
        System.out.println("class1");
    }
}

class childClass2Int implements Parentclass
{
    public void func()
    {
        System.out.println("class2");
    }
}
public class FactoryClass {

    
    public static Parentclass factoryMethod (String value)
    {
        if(value == "child1")
        {
            return new childClass1Int();
        }else if (value == "child2")
        {
            return new childClass2Int();
        }
        return null;

    }
    
}
