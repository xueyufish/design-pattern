
package com.xueyufish.dp.absfactory;

/**
 * @author xueyufish
 */

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB();
    }

}
