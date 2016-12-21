import com.Facade;

/**
 * User: kaifeng.yuan
 * Date: 12/21/16.
 */
public class Test {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.getChips();
        System.out.println("------------------");
        facade.getCookCola();
        System.out.println("------------------");
        facade.getPeisiCola();
        System.out.println("------------------");
        facade.getHamburger();
        System.out.println("------------------");
        facade.makeTaoCan();
    }
}
