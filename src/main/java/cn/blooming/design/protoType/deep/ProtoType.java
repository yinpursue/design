package cn.blooming.design.protoType.deep;

public class ProtoType implements Cloneable {
    private String name;
    private Experience experience;

    public ProtoType(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public ProtoType(Experience experience)throws CloneNotSupportedException {
        this.experience = (Experience)experience.clone();
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
        ProtoType protoType = new ProtoType(this.experience);
        protoType.name = this.name;
        return protoType;
    }
}
