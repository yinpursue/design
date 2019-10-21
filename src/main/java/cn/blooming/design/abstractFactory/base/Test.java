package cn.blooming.design.abstractFactory.base;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        SqlServerUser sqlServerUser = new SqlServerUser();
        sqlServerUser.insert(user);
        sqlServerUser.get(1);
    }
}
