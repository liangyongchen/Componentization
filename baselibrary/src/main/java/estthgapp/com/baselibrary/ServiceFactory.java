package estthgapp.com.baselibrary;

public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    private ILoginInterface mLogin;
    private IMineInterface mMain;

    public ILoginInterface getmLogin() {
        return mLogin;
    }

    public void setmLogin(ILoginInterface mLogin) {
        this.mLogin = mLogin;
    }

    public IMineInterface getmMain() {
        return mMain;
    }

    public void setmMain(IMineInterface mMain) {
        this.mMain = mMain;
    }
}
