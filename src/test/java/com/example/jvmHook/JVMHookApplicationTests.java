package com.example.jvmHook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JVMHookApplicationTests {

    @BeforeAll
    public static final void initiateJVMHook() throws ClassNotFoundException {
        Class.forName("com.example.jvmHook.JVMShutdownHook");
	}

	@Test
    public void simpleTest() {
        assertEquals(6, 6);
	}
}
