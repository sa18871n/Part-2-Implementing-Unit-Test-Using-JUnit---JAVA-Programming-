package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

    @Test
    public void test() {
        JunitTesting test = new JunitTesting();
        int output = test.count("alphabet");
        assertEquals(2, output);
    }

}
