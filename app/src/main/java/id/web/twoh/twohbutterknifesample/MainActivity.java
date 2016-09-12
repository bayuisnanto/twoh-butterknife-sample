package id.web.twoh.twohbutterknifesample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.et_sayhello)
    EditText etHello;

    @BindView(R.id.bt_submit)
    Button btSubmit;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        tvTitle.setText("Belajar ButterKniew by TWOH's Engineering");
    }

    @OnClick(R.id.bt_submit)
    public void submit() {
        Toast.makeText(MainActivity.this, "You say "+etHello.getText().toString(), Toast.LENGTH_LONG ).show();
    }

    @OnClick(R.id.fab)
    public void clickFAB(View view){
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

}
