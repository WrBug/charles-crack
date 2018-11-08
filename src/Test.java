import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = ClassLoaderUtil.loadJarFile(new File("out/artifacts/charles_crack_jar/charles-crack.jar"));
            String name = "wrbug";
            String key = "ss";
            Class<?> kKpk = classLoader.loadClass("com.xk72.charles.kKPk");
            Constructor<?> declaredConstructor = kKpk.getDeclaredConstructor(String.class, String.class);
            declaredConstructor.setAccessible(true);
            Object obj = declaredConstructor.newInstance(name, key);
            Field jZlU = kKpk.getDeclaredField("JZlU");
            jZlU.setAccessible(true);
            System.out.println(jZlU.get(obj));
            System.out.println(name.replaceAll("[ \u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " "));
            Method method = kKpk.getDeclaredMethod("KcPF", String.class, String.class, int.class);
            method.setAccessible(true);
            Object v1 = method.invoke(obj, name, key, 4);
            System.out.println(v1);
            Method lcJx = kKpk.getDeclaredMethod("lcJx", long.class);
            lcJx.setAccessible(true);
            Object v2 = lcJx.invoke(obj, v1);
            System.out.println(v2);
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
