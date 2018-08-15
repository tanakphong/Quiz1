package th.co.cdg.quiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NotiActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        //
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);

        Button Logout = findViewById(R.id.btn_back);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotiActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
