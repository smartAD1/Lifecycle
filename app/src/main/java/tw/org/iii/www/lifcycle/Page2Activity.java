package tw.org.iii.www.lifcycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        int stage = intent.getIntExtra("stage",0);
        String name = intent.getStringExtra("name");
        boolean sound = intent.getBooleanExtra("sound",true);
        int temp = intent.getIntExtra("temp",0);

        mesg = (TextView)findViewById(R.id.page2_mesg);
        mesg.setText("Name: " + name + "\n" +
                "Stage:" + stage + "\n" +
                "Sound: " + (sound?"On":"Off") + "\n" +
                "Temp: " + temp);
    }

    @Override
    public void finish() {
        Intent it = new Intent();
        it.putExtra("a",2);
        it.putExtra("b",3);
        setResult(99,it);
        super.finish();
    }
}