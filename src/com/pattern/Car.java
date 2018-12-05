package com.pattern;

/**
 * 汽车
 */
public abstract class Car {
    protected Engine engine;//引擎的引用
    public Car(Engine engine){
        this.engine = engine;
    }
    public abstract void installEngine();
}
