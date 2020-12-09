package szabo.fpv.umb.zakladnewidgety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    public static final String EXTRA_TEXT = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.checkbox1);
        button = findViewById(R.id.buttonNext);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 checkCheckBox();


             }
         });


    }
    private void checkCheckBox(){
        int selectedId = radioGroup.getCheckedRadioButtonId();
    if(selectedId == -1){
        Toast.makeText(this,"prosím vyberte si možnosť",Toast.LENGTH_SHORT).show();
    }
    else{
        radioButton = findViewById(selectedId);
        openAnotherActivity(Activity2.class,radioButton.getText().toString());

    }

        //Toast.makeText(this,radioButton.getText(), Toast.LENGTH_SHORT).show();

    }
    private void openAnotherActivity(Class activityClass,String text){
        Intent intent = new Intent(this,activityClass);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}