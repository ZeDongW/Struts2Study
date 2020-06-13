package cn.zedongw.mystruts.data;

import cn.zedongw.mystruts.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * @ClassName Data
 * @Description: struts数据封装
 * @Author ZeDongW
 * @Date 2019/12/4/0004 23:27
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Data extends ActionSupport {

    private Logger logger = LogManager.getLogger(Data.class.getName());  //日志打印

    private Users user; //用户

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String data(){
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> req = ac.getContextMap();
        logger.debug("===================用户名：{}==================", user.getUserName());
        req.put("userName", user.getUserName()); //将用户名放入request域中
        logger.debug("===================年龄：{}==================", user.getAge());
        req.put("userName", user.getAge());
        logger.debug("===================生日：{}==================", user.getBirthday());
        req.put("userName", user.getBirthday());
        logger.debug("===================省份：{}==================", user.getAddress().getProvince());
        req.put("userName", user.getAddress().getProvince());
        logger.debug("===================城市：{}==================", user.getAddress().getCity());
        req.put("userName", user.getAddress().getCity());
        return SUCCESS;
    }
}
