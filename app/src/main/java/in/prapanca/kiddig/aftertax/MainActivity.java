package in.prapanca.kiddig.aftertax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView categorybtn;
    private EditText amttxt;
    private Button foodbtn;
    private Button clothesbtn;
    private Button winebtn;
    private Button beerbtn;
    private TextView finalamt;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btndel;
    private Button btnclr;
    private String amount;
    private Double taxamt;
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorybtn = (TextView) findViewById(R.id.categorybtn);
        amttxt = (EditText) findViewById(R.id.amttxt);
        foodbtn = (Button) findViewById(R.id.foodbtn);
        clothesbtn = (Button) findViewById(R.id.clothesbtn);
        winebtn = (Button) findViewById(R.id.winebtn);
        beerbtn = (Button) findViewById(R.id.beerbtn);
        finalamt = (TextView) findViewById(R.id.finalmtbtn);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndel = (Button) findViewById(R.id.btndel);
        btnclr = (Button) findViewById(R.id.btnclr);

        foodbtn.setOnClickListener(this);
        clothesbtn.setOnClickListener(this);
        winebtn.setOnClickListener(this);
        beerbtn.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btnclr.setOnClickListener(this);

        amttxt.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {



            }

            @Override
            public void afterTextChanged(Editable s) {
                amount=s.toString();
                if (categorybtn.getText().toString().equals("Food"))
                {
                taxamt = (Integer.parseInt(amount)) * 1.1;
                finalamt.setText(taxamt.toString());

            }
                if (categorybtn.getText().toString().equals("Clothes")){
                taxamt = (Integer.parseInt(amount)) * 1.2;
                finalamt.setText(taxamt.toString());

                }
                if (categorybtn.getText().toString().equals("Wine")) {
                taxamt = (Integer.parseInt(amount)) * 1.3;
                finalamt.setText(taxamt.toString());
            }
                if (categorybtn.getText().toString().equals("Beer")) {
                taxamt = (Integer.parseInt(amount)) * 1.4;
                finalamt.setText(taxamt.toString());

            }

            }
        });
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.foodbtn:
                categorybtn.setText(foodbtn.getText().toString());

                break;
            case R.id.clothesbtn:
                categorybtn.setText(clothesbtn.getText().toString());
                break;
            case R.id.winebtn:
                categorybtn.setText(winebtn.getText().toString());
                break;
            case R.id.beerbtn:
                categorybtn.setText(beerbtn.getText().toString());
                break;
            case R.id.btn0:
                amttxt.setText(amttxt.getText()+"0");
                break;
            case R.id.btn1:
                amttxt.setText(amttxt.getText()+"1");
                break;
            case R.id.btn2:
                amttxt.setText(amttxt.getText()+"2");
                break;
            case R.id.btn3:
                amttxt.setText(amttxt.getText()+"3");
                break;
            case R.id.btn4:
                amttxt.setText(amttxt.getText()+"4");
                break;
            case R.id.btn5:
                amttxt.setText(amttxt.getText()+"5");
                break;
            case R.id.btn6:
                amttxt.setText(amttxt.getText()+"6");
                break;
            case R.id.btn7:
                amttxt.setText(amttxt.getText()+"7");
                break;
            case R.id.btn8:
                amttxt.setText(amttxt.getText()+"8");
                break;
            case R.id.btn9:
                amttxt.setText(amttxt.getText()+"9");
                break;
            case R.id.btndel:
                amttxt.setText(amttxt.getText());
                break;
            case R.id.btnclr:
                amttxt.setText("0");
                break;

        }

    }
}
