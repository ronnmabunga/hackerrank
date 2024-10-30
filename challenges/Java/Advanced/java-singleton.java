class Singleton {
    public static String str;
    private static Singleton onlyInstance;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (onlyInstance == null) {
            onlyInstance = new Singleton();
        }
        return onlyInstance;
    }

}