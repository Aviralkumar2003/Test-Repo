package com.idustrymentordata.demo;

import java.util.Base64;

public class ImageUtil {
    public String getImgData(byte[] byteData) {
        return Base64.getEncoder().encodeToString(byteData);
    }
}