package oops;

//Defines a set of actions that any implementing class must perform,
// without giving any details on how to perform those actions.
// Think of it as a list of rules for building a house, but no instructions.

interface Machine {
    void turnOn();

    void turnOff();
}

class Fan implements Machine {
    public void turnOn() {
        System.out.println("Fan is on");
    }

    public void turnOff() {
        System.out.println("Fan is off");
    }
}

class Light implements Machine {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

public class Interface {
    public static void main(String[] args) {
        Machine fan = new Fan();
        fan.turnOn();
        fan.turnOff();

        Machine light = new Light();
        light.turnOn();
        light.turnOff();
    }
}

