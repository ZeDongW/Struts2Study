package cn.zedongw.mystruts.interceptor;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName DemoAction
 * @Description: DemoAction
 * @Author ZeDongW
 * @Date 2020/1/12/0012 18:38
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class DemoAction {

    Logger logger = LogManager.getLogger(DemoAction.class.getName());

    public DemoAction() {
        logger.info("==========================================创建了Action实例========================================");
    }

    public String demo(){
        logger.info("==========================================执行了请求处理的方法========================================");
        return "success";
    }
}
