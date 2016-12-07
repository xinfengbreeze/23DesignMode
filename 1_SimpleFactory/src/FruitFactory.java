/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 * 简单工厂设计模式中  工厂类
 */
public class FruitFactory {
    public static Fruit getFruit(String name) {
        if ("apple".equalsIgnoreCase(name)) {
            return new Apple();
        } else if ("pear".equalsIgnoreCase(name)) {
            return new Pear();
        } else if ("banana".equalsIgnoreCase(name)) {
            return new Banana();
        } else {
            return null;
//            throw new Exception("未找到该产品");
        }
    }
}
