package androdev.com.singletonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Use your singleton class
        SingletonExample singletonExample = SingletonExample.getSingletonInstance();
    }
}