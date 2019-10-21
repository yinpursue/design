package cn.blooming.design.system;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;

public class IntAddressTest {
    public static void main(String[] args) throws Exception {



        String ip= getLocalIp();
        String mac= getLocalMac();
        String md5Str = DigestUtils.md5Hex(ip+"/"+mac);
        System.out.println("ip mac md5:"+md5Str);
        //公钥
        String strPublicKey = KeyStoreCoder.getStrPublicKey("D:/newcert/robot.keystore", "robot", "123456");
        String secretText = KeyStoreCoder.encryptByPublicKey(strPublicKey, md5Str);
        FileUtils.writeByteArrayToFile(new File("D:/newcert/license.txt"),secretText.getBytes("utf-8"));


        String needToDescrypt = FileUtils.readFileToString(new File("D:/newcert/license.txt"), StandardCharsets.UTF_8);
        //私钥
        String strPrivateKey = KeyStoreCoder.getStrPrivateKey("D:/newcert/robot.keystore", "robot", "123456", "123456");
        String MD5data = KeyStoreCoder.descryptByPrivateKey(strPrivateKey,needToDescrypt);
        System.out.println("accept MD5data:"+MD5data);
        System.out.println(md5Str.equals(MD5data));
    }

    private static String getLocalIp()throws Exception{
        InetAddress ia = InetAddress.getLocalHost();
        String ip=ia.toString().split("/")[1];
        System.out.println(ia);
        System.out.println("IP:"+ip);
        return ip;
    }

    private static String getLocalMac() throws Exception {
        InetAddress ia = InetAddress.getLocalHost();
        //获取网卡，获取地址
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
        //System.out.println("mac数组长度："+mac.length);
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mac.length; i++) {
            if (i != 0) {
                sb.append("-");
            }
            //字节转换为整数
            int temp = mac[i] & 0xff;
            String str = Integer.toHexString(temp);
            //System.out.println("每8位:"+str);
            if (str.length() == 1) {
                sb.append("0" + str);
            } else {
                sb.append(str);
            }
        }
        System.out.println("本机MAC地址:" + sb.toString().toUpperCase());
        return sb.toString().toUpperCase();
    }
}
