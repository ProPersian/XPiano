package azataz.bargche.xpiano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ADD Comment

        Button d1,d2,d3,d4,d5,d6,d7,d8,d9;

        textView = findViewById(R.id.key_name);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);

        d1.setOnClickListener(new ClickPianoKey());
        d2.setOnClickListener(new ClickPianoKey());
        d3.setOnClickListener(new ClickPianoKey());
    }

    private class ClickPianoKey implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.d1:
                    textView.setText("D1");
                    break;
                case R.id.d2:

                    textView.setText("D2");
                    break;
                case R.id.d3:

                    textView.setText("D3");
                    break;
            }
        }
    }
}