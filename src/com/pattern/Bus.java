package com.pattern;

/**
 * bus
 */
public class Bus extends Car{
    public Bus(Engine engine) {
        super(engine);
    }
    @Override
    public void installEngine() {
        System.out.print("bus:");
        engine.installEngine();
    }
}
