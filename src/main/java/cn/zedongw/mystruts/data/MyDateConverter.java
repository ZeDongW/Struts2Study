package cn.zedongw.mystruts.data;
import java.text.ParseException;
import	java.text.SimpleDateFormat;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @ClassName MyDateConverter
 * @Description: 自定义日期格式转换器
 * @Author ZeDongW
 * @Date 2019/12/5/0005 6:35
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class MyDateConverter extends StrutsTypeConverter {

    SimpleDateFormat[] sdfs = {new SimpleDateFormat("yyyy-MM-dd"),
        new SimpleDateFormat("yyyy/MM/dd"),
        new SimpleDateFormat("yyyyMMdd"),
        new SimpleDateFormat("yyyy年MM月dd日")};

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if (strings == null || strings.length == 0) {
            return null;
        }

        if (Date.class != aClass){
            return null;
        }

        for (int i = 0; i < sdfs.length; i++) {
            try {
                return sdfs[i].parse(strings[0]);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;
    }

    @Override
    public String convertToString(Map map, Object o) {
        return null;
    }
}
