public class Singleton {
private static Singleton instance = null;
private Singleton()
{

}
static Singleton GetInstance()
{
    if(instance == null)
    {
        instance  = new Singleton();
    }
return instance;
}
}
