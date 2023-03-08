package examproto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationContext {

    Properties props;

    public ApplicationContext() {
        props = new Properties();
        try {
            props.load(new FileInputStream("D:\\IntelliJ\\IdeaProjects\\understoodbean\\resources\\beans.properties"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Object getBeans(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String className = props.getProperty(id);

            // 클래스이름에 해당하는 문자열로 instance를 생성할 수 있음
        Class<?> aClass = Class.forName(className);
//            Method[] methods = aClass.getMethods();
//            for(Method m : methods) {
//                System.out.println(m.getName());
//            }

//        Object obj = aClass.newInstance();
        return aClass.newInstance();
    }

}
