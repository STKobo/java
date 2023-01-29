public class TardiveSingleton {
    private static volatile TardiveSingleton instance = null; 
    private TardiveSingleton() {}
    public static TardiveSingleton getInstance() {
        if (instance == null) {
            synchronized(TardiveSingleton.class){
                instance = new TardiveSingleton();
            }
        }
        return instance; 
    }
}
