package com.pattern;

public class Main {
    public static void main(String[] args) {
        Engine engine2000 = new Engine2000();//引擎2000
        Engine engine2200 = new Engine2200();//引擎2200

        Car bus2000 = new Bus(engine2000);//bus安装2000引擎
        bus2000.installEngine();
        Car bus2200 = new Bus(engine2200);//bus安装2200引擎
        bus2200.installEngine();

        Car jeep2000 = new Jeep(engine2000);//jeep安装2000引擎
        jeep2000.installEngine();
        Car jeep2200 = new Jeep(engine2200);//jeep安装2200引擎
        jeep2200.installEngine();
    }
}
