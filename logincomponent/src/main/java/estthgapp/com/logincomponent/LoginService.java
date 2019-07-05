package estthgapp.com.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import estthgapp.com.baselibrary.ILoginInterface;

public class LoginService implements ILoginInterface {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
