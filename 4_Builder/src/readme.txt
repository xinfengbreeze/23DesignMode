标准的建造者设计模式
1、抽象的产品类
2、多个具体的产品类
3、抽象建造者类
4、多个对应具体产品的建造者类
6、一个导演类

但是实际开发中有很多变形  比如Android中的Dialog的创建
1、没有导演类  Builder干了导演类的活
2、Builder是具体产品的内部类
3、采用链式编程
4、每一个部分是有使用者，来添加的，将建造过程延续到了使用时，增加了灵活性。
ProgressDialog  dialog = new ProgressDialog.Builder()
                                            .setTitle("标题")
                                            .setMessage("提示信息")
                                            .builder();
这种方法在实际应用中较普遍

当一个类在构造方法中需要传入多个参数的时候   就要考虑到使用 建造者设计模式了
