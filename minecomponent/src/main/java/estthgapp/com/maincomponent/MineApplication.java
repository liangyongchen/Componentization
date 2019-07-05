package estthgapp.com.maincomponent;

import android.app.Application;

import estthgapp.com.baselibrary.IAppInterface;
import estthgapp.com.baselibrary.ServiceFactory;

public class MineApplication extends Application implements IAppInterface {

    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmMain(new MineService());
    }
}
