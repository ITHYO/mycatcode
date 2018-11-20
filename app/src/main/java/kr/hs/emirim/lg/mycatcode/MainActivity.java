package kr.hs.emirim.lg.mycatcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
final static String TAG="메인액티비티";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.out.println("OnCraeted가 실행됨.");
//        Log.v("MainActivity", "onCreated 가 실행");
//        Log.w("MainActivity", "Log.w 실행");
//        Log.i("MainActivity", "Log.i실행");
//        Log.d("MainActivity", "Log.d 실행");
//        Log.v("MainActivity", "Log.v 실행");
        Log.v(TAG, "onCreated 가 실행");
        Log.w(TAG, "Log.w 실행");
        Log.i(TAG, "Log.i실행");
        Log.d(TAG, "Log.d 실행");
        Log.v(TAG, "Log.v 실행");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
