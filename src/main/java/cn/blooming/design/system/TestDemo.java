package cn.blooming.design.system;


public class TestDemo {

//    keytool -genkeypair -alias robot -keyalg RSA -keysize 2048 -dname "CN=pursue, OU=company, O=organization, L=city, ST=province,C=china" -keypass 123456 -keystore D:/newcert/robot.keystore -storepass 123456
    public static void main(String[] args) {
        // 公钥
        String strPublicKey = "";
        // 私钥
        String strPrivateKey = "";

        try {
            strPublicKey = KeyStoreCoder.getStrPublicKey("D:/newcert/robot.keystore", "robot", "123456");
            System.out.println("公钥 = 【" + strPublicKey + "】");

            strPrivateKey = KeyStoreCoder.getStrPrivateKey("D:/newcert/robot.keystore", "robot", "123456", "123456");
            System.out.println("\n私钥 = 【" + strPrivateKey + "】");
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        // 原文
        String originalText = "Java实现RSA加密算法！";

        try {
            // RSA算法 公钥加密随机数
            String secretText = KeyStoreCoder.encryptByPublicKey(strPublicKey, originalText);
            System.out.println("\n经RSA公钥加密后 = " + secretText);
            System.out.println("\n经RSA公钥加密后长度 = " + secretText.length());

            String text = KeyStoreCoder.descryptByPrivateKey(strPrivateKey, secretText);
            System.out.println("\n经RSA私钥解密后 = 【" + text + "】");
            System.out.println("\n经RSA私钥解密后长度 = 【" + text.length() + "】");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

