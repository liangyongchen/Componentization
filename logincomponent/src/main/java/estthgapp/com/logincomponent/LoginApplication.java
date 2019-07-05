package estthgapp.com.logincomponent;

import android.app.Application;

import estthgapp.com.baselibrary.IAppInterface;
import estthgapp.com.baselibrary.ServiceFactory;

public class LoginApplication extends Application implements IAppInterface {

    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmLogin(new LoginService());
    }
}
