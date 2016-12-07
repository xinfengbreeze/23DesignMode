import com.board.DellMainBoard;
import com.board.MainBoard;
import com.computer.ComputerFactory;
import com.computer.DellComputerFactory;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class Test  {
    public static void main(String[] args){
        ComputerFactory factory = new DellComputerFactory();
        System.out.println(factory.getMainBoard().getName());
        System.out.println(factory.getGpu().getName());
        System.out.println(factory.getCpu().getName());

        if(factory.getMainBoard().getCpuPins() == factory.getCpu().getPins()){
            System.out.println("CPU引脚匹配，可以安装");
        }
        if(factory.getMainBoard().getGpuPins() == factory.getGpu().getPins()){
            System.out.println("GPU引脚匹配，可以安装");
        }
    }
}
