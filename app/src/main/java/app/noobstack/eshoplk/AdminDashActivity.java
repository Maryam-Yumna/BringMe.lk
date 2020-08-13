package app.noobstack.eshoplk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AdminDashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.activity_admin_dash);
    }
}