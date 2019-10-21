package cn.blooming.design.decoration;

public class Finery extends Person {
    protected Person person;
    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show() {
     if(person != null){
         person.show();
     }
    }
}
