package cn.blooming.design.abstractFactory.factoryMethod;

public class AccessUser implements IUser{
    @Override
    public void  insert(User user){
        System.out.println("access insert a user");
    }
    @Override
    public User get(int id){
        System.out.println("access get user by id");
        return null;
    }
}
