package com.lekmiti.designpatterns.singleton;


import static java.util.Objects.isNull;

public class SingeltonLazyImpl {

    private SingeltonLazyImpl() {}

    private static SingeltonLazyImpl INSTANCE;

    public synchronized static SingeltonLazyImpl getInstance() {
             if(isNull(INSTANCE)) {
                INSTANCE = new SingeltonLazyImpl();
            }
            return INSTANCE;
    }

}
