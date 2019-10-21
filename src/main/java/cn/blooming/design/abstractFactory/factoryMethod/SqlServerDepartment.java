package cn.blooming.design.abstractFactory.factoryMethod;

public class SqlServerDepartment implements IDepartment{
    @Override
    public void  insert(Department department){
        System.out.println("SqlServer insert a department");
    }
    @Override
    public Department get(int id){
        System.out.println("SqlServer get department by id");
        return null;
    }
}
