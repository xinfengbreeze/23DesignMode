/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 * 工厂方法设计模式中   具体的产品工厂类
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
