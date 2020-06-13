package cn.zedongw.mystruts.demo;

import cn.zedongw.mystruts.entity.Users;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName DoAction
 * @Description: 处理用户请求
 * @Author ZeDongW
 * @Date 2019/11/30/0030 13:58
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class DoAction extends ActionSupport {

    Logger logger = LogManager.getLogger(ActionSupport.class.getName());

    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String login(){
        logger.info("==============================登陆成功=======================");
        logger.info("登陆用户名：{}", user.getUserName());
        return SUCCESS;
    }

    public String register(){
        logger.info("===========================注册成功=========================");
        logger.info("注册用户名：{}", user.getUserName());
        return SUCCESS;
    }
}
