package jp.suntech.s21027.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);
        Button btClear2 = findViewById(R.id.btClear2);
        btClear2.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input =findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etName2);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id){
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    output.setText(inputStr2+"にお住まいの"+inputStr + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
                case R.id.btClear2:
                    input2.setText("");
                    output.setText("");
            }
        }
    }
}