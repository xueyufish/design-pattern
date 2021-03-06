
package com.xueyufish.dp.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        decoratorMethod1();
        super.operate();
    }

    private void decoratorMethod1() {
        System.out.println("decoratorMethod1.");
    }
}
