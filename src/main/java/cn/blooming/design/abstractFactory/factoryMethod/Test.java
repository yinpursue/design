package cn.blooming.design.abstractFactory.factoryMethod;

public class Test {
    public static void main(String[] args) {
        IFactory iFactory = new SqlServreFactory();
        IUser iUser = iFactory.createUser();
        User user = new User();
        iUser.insert(user);
        iUser.get(1);
    }
}
