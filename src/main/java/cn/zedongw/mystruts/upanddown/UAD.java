package cn.zedongw.mystruts.upanddown;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @ClassName UAD
 * @Description: 基于struts2的上传与下载
 * @Author ZeDongW
 * @Date 2019/12/5/0005 7:03
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UAD{

    Logger logger = LogManager.getLogger(ActionSupport.class.getName());

    private String path = ServletActionContext.getServletContext().getRealPath("/upload");; //上传的文件路径

    private File recFile; //上传的文件

    private String recFileFileName; //文件名

    private String recFileContentType; //文件类型

    private String downFileName;

    public void setDownFileName(String downFileName) {
        this.downFileName = downFileName;
    }

    public void setRecFile(File recFile) {
        this.recFile = recFile;
    }

    public void setRecFileFileName(String recFileFileName) {
        this.recFileFileName = recFileFileName;
    }

    public void setRecFileContentType(String recFileContentType) {
        this.recFileContentType = recFileContentType;
    }

    /** @MethodName: upload
      * @Description: 文件上传
      * @Param: []
      * @Return: java.lang.String
      * @Author: ZeDongW
      * @Date: 2019/12/5/0005 7:11
      **/
    public String upload(){

        //创建目标文件对象
        File destFile = new File(path, recFileFileName);

        //把上传文件拷贝到目标文件中
        try {
            FileUtils.copyFile(recFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }

    /** @MethodName: list
      * @Description: 获取要下载的文件列表
      * @Param: []
      * @Return: java.lang.String
      * @Author: ZeDongW
      * @Date: 2019/12/5/0005 7:27
      **/
    public String list(){
        //目录对象
        File dir = new File(path);

        //获取目录下的所有文件
        String[] fileNames = dir.list();

        //保存s
        ActionContext ac = ActionContext.getContext();

        //获取request对象
        Map<String, Object> req = ac.getContextMap();

        //将数据放入request对象中
        req.put("fileNames", fileNames);

        return "list";
    }

    /** @MethodName: down
      * @Description: 下载文件
      * @Param: []
      * @Return: java.lang.String
      * @Author: ZeDongW
      * @Date: 2019/12/17/0017 10:46
      **/
    public String down(){
        logger.info("---开始下载文件---文件{}", downFileName);
    return "download";
    }

    public InputStream getAttrInputStream(){
        return ServletActionContext.getServletContext().getResourceAsStream("/upload/" + downFileName);
    }

    // 4. 下载显示的文件名（浏览器显示的文件名）
    public String getDownFileName() {
        // 需要进行中文编码
        try {
            downFileName = URLEncoder.encode(downFileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return downFileName;
    }
}
