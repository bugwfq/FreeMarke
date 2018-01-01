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
		//����һ���ʺϵ�Configeration����
		 Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		 //�ƶ�ģ���ŵ�λ��
        cfg.setDirectoryForTemplateLoading(new File("myfreemarker"));
        cfg.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_23));
        //�������ɵı����ʽ
       // cfg.setDefaultEncoding("UTF-8");
        //��ȡһ��������ģ��
        Template temp = cfg.getTemplate("test.ftl");
        Map<String, Object> root= new HashMap<String, Object>(); 
        //root��valuel���Դ洢�������ͣ�ǰ����һ��javaBean��
        root.put("username", "wangfuqiang");
        //�ڶ���map
        Map<String, Object> valueMap = new HashMap<String,Object>();
        valueMap.put("valueMapFirst","���ǵڶ���map�е�valuemapFirst����valueֵ");
        //������list
        List<Object> list = new ArrayList<Object>();
        //list �д��user���� ֻҪ��get��set�����Ϳ�ȡ��
        User u1 =  new User("wang","��");
        User u2 =  new User("ǿ","��");
        list.add(u1);
        list.add(u2);
        valueMap.put("list",list);
        valueMap.put("user",u1);
        root.put("valueMap", valueMap);
        //��������ϵ�������������̨��System.out����������ļ���ʹ��
        /*
        File file = new File("newFile.html");
        FileOutputStream  fos = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(fos,"UTF-8"); 
        */
        Writer writer = new OutputStreamWriter(System.out); 
        //���üӹ����������ı�
        temp.process(root, writer); 
	}
}
