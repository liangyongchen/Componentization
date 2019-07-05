package estthgapp.com.componentizationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import estthgapp.com.baselibrary.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到LoginActivity组件
                ServiceFactory.getInstance().getmLogin().launch(MainActivity.this);
            }
        });

        findViewById(R.id.main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到MainActivity组件
                ServiceFactory.getInstance().getmMain().launch(MainActivity.this);
            }
        });

    }
}
