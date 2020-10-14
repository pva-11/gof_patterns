package patterns.singleton.gof;

public class SingletonGof {

    private volatile static SingletonGof uniqueSingletonGof;

    private SingletonGof() {
    }

    public static SingletonGof getInstance(){
        if (uniqueSingletonGof == null) {
            synchronized (SingletonGof.class) {
                if (uniqueSingletonGof == null) {
                    uniqueSingletonGof = new SingletonGof();
                }
            }
        }
        return uniqueSingletonGof;
    }
}
