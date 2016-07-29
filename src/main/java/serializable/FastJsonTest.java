package serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2016/7/29.
 */
public class FastJsonTest {
    public static void main(String[] args) {
        json2JsonObjectM1();
    }
    public static void json2JsonObjectM1() {
        String s = "{\"name\":\"xiekai\"}";
        JSONObject object = JSON.parseObject(s);
        System.out.println(object.get("name"));
    }
}
