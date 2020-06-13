package cn.zedongw.mystruts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName InterceptorDemo
 * @Description: 自定义拦截器演示
 * @Author ZeDongW
 * @Date 2020/1/12/0012 18:26
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class InterceptorDemo implements Interceptor {

    Logger logger = LogManager.getLogger(InterceptorDemo.class.getName());

    public InterceptorDemo() {
        logger.info("==========================================创建了过滤器对象========================================");
    }

    @Override
    public void destroy() {
        logger.info("==========================================销毁了过滤器对象========================================");
    }

    @Override
    public void init() {
        logger.info("==========================================执行了拦截器的初始化方法========================================");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        logger.info("==========================================执行Action之前========================================");

        String resultFlag = invocation.invoke();

        logger.info("==========================================拦截器，业务处理-结束：{}========================================", resultFlag);

        return resultFlag;
    }
}
