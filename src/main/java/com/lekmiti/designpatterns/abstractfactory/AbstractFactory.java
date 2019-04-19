package com.lekmiti.designpatterns.abstractfactory;

public interface AbstractFactory<T,A> {
    T create(A argument) throws Exception;
}
