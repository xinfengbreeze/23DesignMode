/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class Test {
    public  static void main(String[] args){
        Fruit apple = FruitFactory.getFruit("apple");
        System.out.println(apple.getName());
        Fruit pear = FruitFactory.getFruit("banana");
        System.out.println(pear.getName());
    }
}
