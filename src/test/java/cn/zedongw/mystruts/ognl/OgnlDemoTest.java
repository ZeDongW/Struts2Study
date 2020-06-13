package cn.zedongw.mystruts.ognl;

import ognl.OgnlException;
import org.junit.Test;

import static org.junit.Assert.*;

public class OgnlDemoTest {
    OgnlDemo demo = new OgnlDemo();

    @Test
    public void ognlTest() throws OgnlException {
        demo.ognlTest();
    }

    @Test
    public void ognlMath() throws OgnlException {
        demo.ognlMath();
    }
}