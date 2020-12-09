package szabo.fpv.umb.zakladnewidgety;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    TextView textView;
    Intent intent;
    ImageButton imageButton;
    CheckBox checkBox;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        changeTextHolder();
        checkBox = findViewById(R.id.av2_checkbox1);
        aSwitch = findViewById(R.id.av2_switch);

        imageButton = findViewById(R.id.av2_ib);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSwitchandCheckbox();

            }
        });


    }

   private void changeTextHolder(){
       intent = getIntent();
       String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

       textView = findViewById(R.id.av2tv_placeholder);
       textView.setText(text);
   }
   private void changeSwitchandCheckbox(){
        checkBox.toggle();
        if(aSwitch.isChecked()){
            aSwitch.setChecked(false);
        }
        else{
            aSwitch.setChecked(true);
        }

   }
}