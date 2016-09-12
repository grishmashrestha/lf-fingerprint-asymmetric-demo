package np.com.grishma.fingerprintdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import np.com.grishma.fingerprintdemo.withoutdialog.FingerprintWithoutDialogActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_with_dialog, R.id.button_without_dialog})
    public void setOnClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button_with_dialog:
                intent = new Intent(this, FingerprintWithoutDialogActivity.class);
                break;

            case R.id.button_without_dialog:
                intent = new Intent(this, FingerprintWithoutDialogActivity.class);
                break;
        }
        startActivity(intent);

    }
}
