package cn.blooming.design.system;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * 基础加密组件
 *
 * @author 奔跑的蜗牛
 * @version 1.0
 * @since 1.0
 */
public abstract class Coder {

    /**
     * BASE64解密
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key).replace("\r", "").replace("\n", "");
    }
}

