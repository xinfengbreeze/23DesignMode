import com.Builder.HpComputerBuilder;
import com.Director.ComputerDirectory;
import com.computer.Computer;

import java.util.Dictionary;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class Test {
    public static void main(String[] args){
        ComputerDirectory directory  = new ComputerDirectory();
        Computer computer = directory.buildComputer(new HpComputerBuilder());
        System.out.println(computer.getLogo());
        System.out.println(computer.getMainBoard().getName());
        System.out.println(computer.getCpu().getName());
        System.out.println(computer.getGpu().getName());
    }
}
