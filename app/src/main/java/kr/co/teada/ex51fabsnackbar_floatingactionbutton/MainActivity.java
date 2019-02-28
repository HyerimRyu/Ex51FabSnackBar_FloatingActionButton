package kr.co.teada.ex51fabsnackbar_floatingactionbutton;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFab(View view) {

        //토스트랑 비슷한 녀석(다른점 : 버튼같은 액션 추가 가능)
        Snackbar snackbar=Snackbar.make(view, "click!!", Snackbar.LENGTH_INDEFINITE); //액션 닫을때까지 대기: 무한으로 켜놓는 거야
        snackbar.setAction("Submit", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click submit", Toast.LENGTH_SHORT).show();
            }
        });

        snackbar.show();
    }
}
