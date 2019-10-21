package cn.blooming.design.protoType.deep;

public class Experience implements Cloneable{
    private String school;

    public Experience(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
