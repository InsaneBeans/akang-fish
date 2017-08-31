package com.fisher.utils;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DES3加密解密工具
 */
public class Encryptor {
    /**
     * 记录日志
     */
    private static Logger LOG = LoggerFactory.getLogger(Encryptor.class);
	/**
	 * 3重DES
	 */
	public static final String DES = "DESede";
	/**
	 * DES加密KEY 默认的key 长度必须是24位
	 */
	public static final String DES_KEY = "akang_hu*_beaf_md_dg_&n*2b_2u";

	/**
	 * DES数据解密接口
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String data) {
		if (data == null) {
			return null;
		}
		return new String(decrypt(byte2hex(data.getBytes()), DES_KEY.getBytes()));
	}

	/**
	 * DES数据加密接口
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public final static String encrypt(String data) {
		try {
			return hex2byte(encrypt(data.getBytes(), DES_KEY.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * 
	 * @param src
	 *            数据源
	 * @param key
	 *            密钥，长度必须是24位
	 * @return 返回解密后的原始数据
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] src, byte[] key) throws RuntimeException {
		try { 
			// DES算法要求有一个可信任的随机数源
			SecureRandom sr = new SecureRandom();
			// 从原始密匙数据创建一个DESKeySpec对象
			DESedeKeySpec dks = new DESedeKeySpec(key);
			// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
			// 一个SecretKey对象
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
			SecretKey securekey = keyFactory.generateSecret(dks);
			// Cipher对象实际完成加密操作
			Cipher cipher = Cipher.getInstance(DES);
			// 用密匙初始化Cipher对象
			cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
			// 现在进行加密操作
			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 加密
	 * 
	 * @param src
	 *            数据源
	 * @param key
	 *            密钥，长度必须是24位
	 * @return 返回解密后的原始数据
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] src, byte[] key) throws RuntimeException {
		try { 
			SecureRandom sr = new SecureRandom();
			DESedeKeySpec dks = new DESedeKeySpec(key);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
			SecretKey securekey = keyFactory.generateSecret(dks);
			Cipher cipher = Cipher.getInstance(DES);
			cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 16进制转换到字符数据
	 * 
	 * @param b
	 * @return
	 */
	public static String hex2byte(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}

	/**
	 * 数据转换成16进制 
	 * 
	 * @param b 
	 * @return 16进制数据
	 */
	private static byte[] byte2hex(byte[] b) {
		if ((b.length % 2) != 0) {
		    String message = "Can't tranform byte to hex: \"" + Arrays.toString(b) + "\". ";
		    LOG.error(message);
			throw new IllegalArgumentException(message);
		}
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}
}
