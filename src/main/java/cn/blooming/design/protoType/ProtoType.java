package cn.blooming.design.protoType;

import java.beans.Expression;

public class ProtoType implements Cloneable {
    private String name;
    private Experience experience;

    public ProtoType(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
