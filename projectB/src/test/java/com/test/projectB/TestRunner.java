package com.test.projectB;

import org.junit.Test;

/**
 * User: oleg.grishin
 * Date: 2016/08/23
 * Time: 10:13
 */

public class TestRunner {

    @Test
    public void runTests() {
        com.test.projectA.Test.runTestInProjectA();
        com.test.projectB.Test.runTestInProjectB();
    }
}
