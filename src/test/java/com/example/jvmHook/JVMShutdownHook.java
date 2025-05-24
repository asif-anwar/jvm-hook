package com.example.jvmHook;

public class JVMShutdownHook {

    static {
        Thread hook = new Thread(() -> {
            System.out.println("***********************Sysout from JVMShutdownHook***********************");
        });
        System.out.println("Register JVM Hook");
        Runtime.getRuntime().addShutdownHook(hook);
    }
}
