package cn.blooming.design.abstractFactory.factoryMethod;


public class SqlServerUser implements IUser{
    @Override
    public void  insert(User user){
        System.out.println("sqlserver insert a user");
    }
    @Override
    public User get(int id){
        System.out.println("sqlserver get user by id");
        return null;
    }
}
