package cn.blooming.design.decoration;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("tom");
        Janes janes = new Janes();
        TShirt tShirt = new TShirt();

        janes.decorate(person);
        tShirt.decorate(janes);
        tShirt.show();
    }
}
