import javassist.*;


public class Crack {
    public static void main(String[] args) throws Throwable {
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.get("com.xk72.charles.kKPk");
        //修改 lcJx 方法返回true
        CtClass[] param = new CtClass[1];
        param[0] = classPool.get("long");
        CtMethod method = ctClass.getDeclaredMethod("lcJx", param);
        method.setBody("return true;");

        //修改KcPF 返回为任意long
        param = new CtClass[3];
        param[0] = classPool.get(String.class.getName());
        param[1] = classPool.get(String.class.getName());
        param[2] = classPool.get("int");
        method = ctClass.getDeclaredMethod("KcPF", param);
        method.setBody("return 0L;");

        //静态方法 lcJx 方法返回true
        method = ctClass.getDeclaredMethod("lcJx", null);
        method.setBody("return true;");

        //  这里返回Registered Name， 可以自行修改
        method = ctClass.getDeclaredMethod("JZlU", null);
        method.setBody("return \"wrbug\";");

        // 将class文件写入到 output目录
        ctClass.writeFile("output");

    }
}
