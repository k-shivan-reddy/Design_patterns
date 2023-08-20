//Incase Multi thread envirnoment we might end up in two instances

public class Singleton
{
// 
private static Singleton instance = null;

// constructor should be made private
private Singleton()
{

}

//Function used to get single instance
static Singleton getInstance()
{
    if(instance == null)
    {
        instance  = new Singleton();
    }
return instance;
}

}

// Possible solution for above problem
class SingletonEargerInitialisation
{
private static SingletonEargerInitialisation instance = new SingletonEargerInitialisation();
// constructor should be made private
private SingletonEargerInitialisation()
{

}

//Function used to get single instance
static SingletonEargerInitialisation getInstance()
{
return instance;
}

}



class SingletonSynchronised
{
// 
private static SingletonSynchronised instance = null;

// constructor should be made private
private SingletonSynchronised()
{

}

//Function used to get single instance
static synchronized SingletonSynchronised getInstance()
{
    if(instance == null)
    {
        instance  = new SingletonSynchronised();
    }
return instance;
}

}


class SingletonDoubleLock
{
// 
private static SingletonDoubleLock instance = null;

// constructor should be made private
private SingletonDoubleLock()
{

}

//Function used to get single instance
static  SingletonDoubleLock getInstance()
{
    if(instance == null)
    {
        synchronized(SingletonDoubleLock.class)
        {
            instance  = new SingletonDoubleLock();
        }

    }
return instance;
}

}