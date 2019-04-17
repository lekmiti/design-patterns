package com.lekmiti.designpatterns.singleton;

public class SingletonEagerImpl {

    private SingletonEagerImpl() {}

    private static SingletonEagerImpl INSTANCE = new SingletonEagerImpl();

    public static SingletonEagerImpl getInstance() {
        return INSTANCE;
    }

}
