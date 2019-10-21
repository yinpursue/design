package cn.blooming.design.abstractFactory.base;

public class SqlServerUser {
    public void  insert(User user){
        System.out.println("sqlserver insert a user");
    }
    public User get(int id){
        System.out.println("get user by id");
        return null;
    }
}
