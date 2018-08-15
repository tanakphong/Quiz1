package th.co.cdg.quiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pixplicity.easyprefs.library.Prefs;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText Username = findViewById(R.id.tv_username);
        final EditText Password = findViewById(R.id.tv_password);
        Button Login = findViewById(R.id.btn_login);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Username.setError(null);
                Password.setError(null);

                if (Username.getText().equals("")) {
                    Username.setError(getString(R.string.validate_username));
                    return;
                }
                if (Password.getText().equals("")) {
                    Password.setError(getString(R.string.validate_password));
                    return;
                }


                String _username = Username.getText().toString();
                String _password = Password.getText().toString();
                if (_username.equals("admin") && _password.equals("admin")) {
                    Prefs.putBoolean("LOGIN_STATUS", true);
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(LoginActivity.this, NotiActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        if (Prefs.getBoolean("LOGIN_STATUS",false)) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }

    }
}
