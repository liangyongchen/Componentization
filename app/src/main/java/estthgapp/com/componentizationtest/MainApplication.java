package estthgapp.com.componentizationtest;

import android.app.Application;

import estthgapp.com.baselibrary.AppConfig;
import estthgapp.com.baselibrary.IAppInterface;

public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        // 将主app的上下文传递login和mine application中
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppInterface) {
                    ((IAppInterface) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
