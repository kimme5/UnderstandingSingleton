package exambean;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* Singleton pattern 적용
 * 1) 자기 자신("ApplicationContext")를 참조하는 field "appInstance"를 static으로 선언하여 instance를 생성함
 * 2) 생성자를 private으로 변경하여 다른 클래스에서 new ApplicationContext()를 통해 해당 클래스의 instance를 생성하지 못하도록 처리함
 * 3) 1)에서 생성한 ApplicationContext의 instance인 appInstance를 반환하는 static 메소드를 생성하여 다른 클래스에서 이를 호출하도록 함
 */
public class ApplicationContext {

    private final Properties props;
    private final Map<String, Object> objMap;
    private static final ApplicationContext appInstance = new ApplicationContext();    // 1)
    
    // 2) 생성자를 private으로 선언
    private ApplicationContext() {
        props = new Properties();
        objMap = new HashMap<String, Object>();
        try {
            props.load(new FileInputStream("D:\\IntelliJ\\IdeaProjects\\understoodbean\\resources\\beans.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object getBeans(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Object objProps = objMap.get(id);

        if(objProps == null) {
            String className = props.getProperty(id);
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.newInstance();
            objMap.put(id, obj);
            objProps =objMap.get(id);

        }
        return objProps;
    }
    // 3) 다른 클래스에서 static으로 선언된 해당 메소드를 통해 ApplicationContext 클래스의 instance를 호출할 수 있음
    public static ApplicationContext getInstance() {
        return appInstance;
    }

}
