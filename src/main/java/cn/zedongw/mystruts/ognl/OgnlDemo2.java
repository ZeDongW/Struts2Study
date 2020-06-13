package cn.zedongw.mystruts.ognl;

import cn.zedongw.mystruts.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import ognl.Ognl;
import ognl.OgnlContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName OgnlDemo2
 * @Description: ognl的数据流转
 * @Author ZeDongW
 * @Date 2020/2/3/0003 13:08
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class OgnlDemo2 extends ActionSupport {

    Logger logger = LogManager.getLogger(OgnlDemo2.class.getName());

    Users user = new Users("Jack", 27);

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
//        getVS();

        //从AC对象中获取数据
        /*ActionContext context = ActionContext.getContext();

        context.getContextMap().put("request_data", "request_data");
        context.getContextMap().put("cn", "China");

        context.getSession().put("session_data", "session_data");

        context.getApplication().put("application_data", "application_data");
*/
        List list = new ArrayList<Users>();

        Map map = new HashMap<Integer, Users>();

        for (int i = 1; i < 11; i++) {
            Users user = new Users();
            user.setAge(i);
            user.setUserName("jack" + i);
            list.add(user);
            map.put(i, user);
        }

        ActionContext ac = ActionContext.getContext();

        Map<String, Object> request = ac.getContextMap();

        request.put("list", list);

        request.put("map" , map);

        return super.execute();
    }

    private void getVS() {
        //从request获取对象
        HttpServletRequest request = ServletActionContext.getRequest();

        Object stack1 = request.getAttribute("struts.valueStack");

        //从AC对象中获取数据
        ActionContext context = ActionContext.getContext();

        ValueStack stack2 = context.getValueStack();

        logger.info("==================两个集合是否相等：{}=====================", stack1 == stack2);
    }
}
