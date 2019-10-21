package cn.blooming.design.system;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception {
        //获取系统所有的环境变量
        Map<String,String> env = System.getenv();
        for (String name:env.keySet()){
            System.out.println(name+"-->"+env.get(name));
        }
        //获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有的系统属性
        Properties properties = System.getProperties();
        //将所有的系统属性保存到props.txt文件中
        properties.store(new FileOutputStream("props.txt"),"System Properties");
        System.out.println(properties.getProperty("os.name"));
    }
}
