package com.tht.swordOffer;

/**
 * 替换空格
 * Input:
 * "We Are Happy"
 *
 * Output:
 * "We%20Are%20Happy"
 */
public class replaceSpace {

    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}
