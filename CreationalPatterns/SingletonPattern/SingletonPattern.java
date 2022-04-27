package CreationalPatterns.SingletonPattern;

public class SingletonPattern {
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }
}
