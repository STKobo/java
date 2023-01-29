public class HativeSingleton {
    private static final HativeSingleton instance = new HativeSingleton();
    private HativeSingleton() {}
    private static HativeSingleton getInstance(){
        return instance;
    }
}
