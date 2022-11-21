package com.ibm.cloud.codeengine.test;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;

public class Main {
    public static void main(String[] args) throws IOException {
        //IOUtils.write("Specifications :", System.out, Charset.forName("UTF-8"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("JVM Tyoe: " + System.getProperty("java.vm.name") + System.getProperty("java.vm.version"));
    }
}
