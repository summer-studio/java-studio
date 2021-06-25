package com.coffee.studio.lang;

public class JdkString {

    public String replace(String target, String oldChar, String replacement) {
        return target.replace(oldChar, replacement);
    }

    public String replaceAll(String target, String regex, String replacement) {
        return target.replaceAll(regex, replacement);
    }
}
