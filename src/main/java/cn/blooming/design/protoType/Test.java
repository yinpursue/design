package cn.blooming.design.protoType;

public class Test {
    public static void main(String[] args) throws Exception{
        Experience experience = new Experience("qinghua");
        ProtoType protoType1= new ProtoType("tom",experience);
        ProtoType protoType2 = (ProtoType) protoType1.clone();
        protoType2.setName("jerry");
        protoType2.getExperience().setSchool("beida");
        System.out.println(protoType1.getName());
        System.out.println(protoType2.getName());
        System.out.println(protoType1.getExperience().getSchool());
        System.out.println(protoType2.getExperience().getSchool());
    }
}
