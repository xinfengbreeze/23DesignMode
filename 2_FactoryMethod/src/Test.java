/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class Test {
    public  static void main(String[] args){
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        System.out.println(apple.getName());

        FruitFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        System.out.println(pear.getName());
    }
}
