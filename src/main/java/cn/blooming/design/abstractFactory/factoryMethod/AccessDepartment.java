package cn.blooming.design.abstractFactory.factoryMethod;

public class AccessDepartment implements IDepartment{
    @Override
    public void  insert(Department department){
        System.out.println("access insert a department");
    }
    @Override
    public Department get(int id){
        System.out.println("access get department by id");
        return null;
    }
}
