package cn.zedongw.mystruts.ognl;

import cn.zedongw.mystruts.entity.Address;
import cn.zedongw.mystruts.entity.Users;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

/**
 * @ClassName OgnlDemo
 * @Description: strutsOgnl表达式
 * @Author ZeDongW
 * @Date 2020/2/3/0003 10:48
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class OgnlDemo {

    public void ognlTest() throws OgnlException {
        OgnlContext context = new OgnlContext();

//        context.put("cn", "China");

//        context.setRoot("Jack");

        Users user = new Users();

        user.setAge(18);

        user.setUserName("Jack");

        user.setAddress(new Address("广东", "深圳"));

//        context.put("user", user);

        context.setRoot(user);

        Object ognl = Ognl.parseExpression("address.city");

        Object value = Ognl.getValue(ognl, context, context.getRoot());

        System.out.println(value);
    }

    public void ognlMath() throws OgnlException {
        OgnlContext context = new OgnlContext();
        Object ognl = Ognl.parseExpression("@@floor(10.9)");
        Object value = Ognl.getValue(ognl, context, context.getRoot());
        System.out.println(value);
    }
}
