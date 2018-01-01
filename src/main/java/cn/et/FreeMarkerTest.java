package cn.et;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarkerTest {
	public static void main(String[] args) throws IOException, TemplateException {
		//创建一个适合的Configeration对象
		 Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		 //制定模板存放的位置
        cfg.setDirectoryForTemplateLoading(new File("myfreemarker"));
        cfg.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_23));
        //设置生成的编码格式
       // cfg.setDefaultEncoding("UTF-8");
        //获取一个创建的模板
        Template temp = cfg.getTemplate("test.ftl");
        Map<String, Object> root= new HashMap<String, Object>(); 
        //root中valuel可以存储任意类型（前提是一个javaBean）
        root.put("username", "wangfuqiang");
        //第二层map
        Map<String, Object> valueMap = new HashMap<String,Object>();
        valueMap.put("valueMapFirst","我是第二层map中的valuemapFirst键的value值");
        //第三层list
        List<Object> list = new ArrayList<Object>();
        //list 中存放user对象 只要有get、set方法就可取出
        User u1 =  new User("wang","男");
        User u2 =  new User("强","男");
        list.add(u1);
        list.add(u2);
        valueMap.put("list",list);
        valueMap.put("user",u1);
        root.put("valueMap", valueMap);
        //在这里联系可以输出到控制台用System.out流，若输出文件则使用
        /*
        File file = new File("newFile.html");
        FileOutputStream  fos = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(fos,"UTF-8"); 
        */
        Writer writer = new OutputStreamWriter(System.out); 
        //调用加工方法生成文本
        temp.process(root, writer); 
	}
}
