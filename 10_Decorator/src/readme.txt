结构设计模式----装饰者模式
装饰者设计模式 最杰出的代表 JDK中的 IO流类
特点：装饰者对被装饰者的功能进行增强
要实现装饰者：
1、装饰者与被装饰者实现同一个接口
2、装饰者 持有被装饰者 ，并对被装饰者进行功能增强
3、当客户端调用装饰者的底层还是调用被装饰者

例子： 编写了一个EncryptInputString 来对InputString进行封装
他们都实现了InputStream的抽象类
EncryptInputString 对 InputString 读到的数据进行 加3，已达到简单加密的功能
EncryptInputString 内部底层还是调用了 InputStream的方法，但是对他进行了增强

