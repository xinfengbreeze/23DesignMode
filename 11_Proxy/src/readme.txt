结构设计模式----代理设计模式

代理是面向切面编程的核心，在其他类方法前后加上额外的动作，比如日志，权限管理等等
Java web框架中的spring的AOP

代理分为静态代理  和动态代理

动态代理分为 Java的Proxy和cglib的代理

java的代理是 通过一个接口创建一个实现类

cglib的代理是 通过父类修改字节码产生子类

代理设计模式和装饰者设计模式的区别：
装饰者是对被装饰者的功能增强
代理是在被代理对象的前后加上系统的额外操作和本身的功能没关系



