package com.lwb.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testGetInstance(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // assert null
        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        //same
        Assertions.assertSame(instance1, instance2);

    }
}
