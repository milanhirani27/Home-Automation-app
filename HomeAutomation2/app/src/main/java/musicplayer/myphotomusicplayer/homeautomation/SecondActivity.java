package musicplayer.myphotomusicplayer.homeautomation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btn_on,btn_off,btn_on1,btn_off1,btn_on2,btn_off2,btn_on3,btn_off3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        btn_on = (Button) findViewById(R.id.btn_on);
        btn_off = (Button) findViewById(R.id.btn_off);

        btn_on1 = (Button) findViewById(R.id.btn_on1);
        btn_off1 = (Button) findViewById(R.id.btn_off1);

        btn_on2 = (Button) findViewById(R.id.btn_on2);
        btn_off2 = (Button) findViewById(R.id.btn_off2);

        btn_on3 = (Button) findViewById(R.id.btn_on3);
        btn_off3 = (Button) findViewById(R.id.btn_off3);


        btn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_on.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_off.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

        btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_off.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_on.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

        btn_on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_on1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_off1.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

        btn_off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_off1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_on1.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });
        btn_on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_on2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_off2.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

        btn_off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_off2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_on2.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });
        btn_on3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_on3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_off3.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

        btn_off3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_off3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btn_on3.setBackgroundColor(getResources().getColor(R.color.gray));

            }
        });

    }
}
