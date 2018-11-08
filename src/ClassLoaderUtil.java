
import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;



public final class ClassLoaderUtil {
    /**
     * <pre>
     * 加载JAR文件
     * </pre>
     *
     * @param file
     */
    public static final ClassLoader loadJarFile(File file) {
        try {
            URLClassLoader system = new URLClassLoader(new URL[]{file.toURI().toURL()});
//            addURL.invoke(system, );
            return system;
        } catch (Exception e) {
        }
        return null;
    }
}
