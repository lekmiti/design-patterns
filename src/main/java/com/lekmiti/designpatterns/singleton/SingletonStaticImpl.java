package com.lekmiti.designpatterns.singleton;

public class SingletonStaticImpl {

    private static SingletonStaticImpl INSTANCE;

    private SingletonStaticImpl() {}

    static {
        try {
            INSTANCE = new SingletonStaticImpl();
        } catch (Exception e) { throw new RuntimeException("Error when instantiating the singleton", e);}
    }

    public static SingletonStaticImpl getInstance() {
        return INSTANCE;
    }
}
