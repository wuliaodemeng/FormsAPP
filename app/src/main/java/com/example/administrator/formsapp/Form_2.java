package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2017/7/12.
 */

public class Form_2 extends AppCompatActivity {
    FormDataUnit formDataUnit = new FormDataUnit();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_2);

        formDataUnit.setCompany(getIntent().getStringExtra("company"));
        formDataUnit.setAddress(getIntent().getStringExtra("address"));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        ImageButton button1 = (ImageButton)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_3.class);
                intent.putExtra("model1", formDataUnit.getModel1());
                startActivityForResult(intent, 1);
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formDataUnit.save();
                Intent intent = new Intent(Form_2.this, Form_0.class);
                startActivity(intent);
            }
        });


        TextView model_name1 = (TextView)findViewById(R.id.model_name1);

        model_name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_3.class);
                intent.putExtra("model1", formDataUnit.getModel1());
                startActivityForResult(intent, 1);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_4.class);
                intent.putExtra("model2", formDataUnit.getModel2());
                startActivityForResult(intent, 2);
            }
        });

        TextView model_name2 = (TextView)findViewById(R.id.model_name2);

        model_name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_4.class);
                intent.putExtra("model2", formDataUnit.getModel2());
                startActivityForResult(intent, 2);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_5.class);
                intent.putExtra("model3", formDataUnit.getModel3());
                startActivityForResult(intent, 3);
            }
        });

        TextView model_name3 = (TextView)findViewById(R.id.model_name3);

        model_name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_5.class);
                intent.putExtra("model3", formDataUnit.getModel3());
                startActivityForResult(intent, 3);
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_6.class);
                intent.putExtra("model4", formDataUnit.getModel4());
                startActivityForResult(intent, 4);
            }
        });

        TextView model_name4 = (TextView)findViewById(R.id.model_name4);

        model_name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_6.class);
                intent.putExtra("model4", formDataUnit.getModel4());
                startActivityForResult(intent, 4);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_7.class);
                intent.putExtra("model5", formDataUnit.getModel5());
                startActivityForResult(intent, 5);
            }
        });

        TextView model_name5 = (TextView)findViewById(R.id.model_name5);

        model_name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_7.class);
                intent.putExtra("model5", formDataUnit.getModel5());
                startActivityForResult(intent, 5);
            }
        });

        ImageButton button6 = (ImageButton)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_8.class);
                intent.putExtra("model6", formDataUnit.getModel6());
                startActivityForResult(intent, 6);
            }
        });

        TextView model_name6 = (TextView)findViewById(R.id.model_name6);

        model_name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_8.class);
                intent.putExtra("model6", formDataUnit.getModel6());
                startActivityForResult(intent, 6);
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_9.class);
                intent.putExtra("model7", formDataUnit.getModel7());
                startActivityForResult(intent, 7);
            }
        });

        TextView model_name7 = (TextView)findViewById(R.id.model_name7);

        model_name7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_9.class);
                intent.putExtra("model7", formDataUnit.getModel7());
                startActivityForResult(intent, 7);
            }
        });

        ImageButton button8 = (ImageButton)findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_10.class);
                intent.putExtra("model8", formDataUnit.getModel8());
                startActivityForResult(intent, 8);
            }
        });

        TextView model_name8 = (TextView)findViewById(R.id.model_name8);

        model_name8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_10.class);
                intent.putExtra("model8", formDataUnit.getModel8());
                startActivityForResult(intent, 8);
            }
        });

        ImageButton button9 = (ImageButton)findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_11.class);
                intent.putExtra("model9", formDataUnit.getModel9());
                startActivityForResult(intent, 9);
            }
        });

        TextView model_name9 = (TextView)findViewById(R.id.model_name9);

        model_name9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_11.class);
                intent.putExtra("model9", formDataUnit.getModel9());
                startActivityForResult(intent, 9);
            }
        });

        ImageButton button10 = (ImageButton)findViewById(R.id.button_10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_12.class);
                intent.putExtra("model10", formDataUnit.getModel10());
                startActivityForResult(intent, 10);
            }
        });

        TextView model_name10 = (TextView)findViewById(R.id.model_name10);

        model_name10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_12.class);
                intent.putExtra("model10", formDataUnit.getModel10());
                startActivityForResult(intent, 10);
            }
        });



    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel1((Model1) data.getSerializableExtra("data_model1"));
                }
                break;
            case 2:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel2((Model2) data.getSerializableExtra("data_model2"));
                }
                break;
            case 3:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel3((Model3) data.getSerializableExtra("data_model3"));
                }
                break;
            case 4:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel4((Model4) data.getSerializableExtra("data_model4"));
                }
                break;
            case 5:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel5((Model5) data.getSerializableExtra("data_model5"));
                }
                break;
            case 6:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel6((Model6) data.getSerializableExtra("data_model6"));
                }
                break;
            case 7:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel7((Model7) data.getSerializableExtra("data_model7"));
                }
                break;
            case 8:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel8((Model8) data.getSerializableExtra("data_model8"));
                }
                break;
            case 9:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel9((Model9) data.getSerializableExtra("data_model9"));
                }
                break;
            case 10:
                if (resultCode == RESULT_OK){
                    formDataUnit.setModel10((Model10) data.getSerializableExtra("data_model10"));
                }
                break;
            default:
                break;
        }

        TextView perc1 = (TextView)findViewById(R.id.perc1);
        TextView perc2 = (TextView)findViewById(R.id.perc2);
        TextView perc3 = (TextView)findViewById(R.id.perc3);
        TextView perc4 = (TextView)findViewById(R.id.perc4);
        TextView perc5 = (TextView)findViewById(R.id.perc5);
        TextView perc6 = (TextView)findViewById(R.id.perc6);
        TextView perc7 = (TextView)findViewById(R.id.perc7);
        TextView perc8 = (TextView)findViewById(R.id.perc8);
        TextView perc9 = (TextView)findViewById(R.id.perc9);
        TextView perc10 = (TextView)findViewById(R.id.perc10);

        perc1.setText(GetPercent(formDataUnit.getModel1().getChoice(), null));
        String[] l = new String[1];
        l[0] = formDataUnit.getModel2().getLack_project();
        perc2.setText(GetPercent(formDataUnit.getModel2().getChoice(), l));
        perc3.setText(GetPercent(formDataUnit.getModel3().getChoice(), null));
        perc4.setText(GetPercent(formDataUnit.getModel4().getChoice(), null));
        perc5.setText(GetPercent(formDataUnit.getModel5().getChoice(), null));
        perc6.setText(GetPercent(formDataUnit.getModel6().getChoice(), null));
        int[] c = new int[2];
        c[0] = formDataUnit.getModel7().getChoice()[0];
        c[1] = formDataUnit.getModel7().getChoice()[2];
        String[] s = new String[2];
        s[0] = formDataUnit.getModel7().getLack_project()[1];
        s[1] = formDataUnit.getModel7().getLack_project()[3];
        perc7.setText(GetPercent(c, s));
        int[] cc = new int[2];
        cc[0] = formDataUnit.getModel8().getChoice(1);
        cc[1] = formDataUnit.getModel8().getChoice(2);
        perc8.setText(GetPercent(cc, formDataUnit.getModel8().getLack_project()));
        int[] ccc = new int[5];
        s[0] = formDataUnit.getModel9().getLack_project()[2];
        s[1] = formDataUnit.getModel9().getLack_project()[3];
        ccc[0] = formDataUnit.getModel9().getChoice()[0];
        ccc[1] = formDataUnit.getModel9().getChoice()[1];
        ccc[2] = formDataUnit.getModel9().getChoice()[4];
        ccc[3] = formDataUnit.getModel9().getChoice()[5];
        ccc[4] = formDataUnit.getModel9().getChoice()[6];
        perc9.setText(GetPercent(ccc, s));
        int[] cccc = new int[6];
        String[] t = new String[6];
        cccc[0] = formDataUnit.getModel10().getChoice()[0];
        cccc[1] = formDataUnit.getModel10().getChoice()[1];
        cccc[2] = formDataUnit.getModel10().getChoice()[2];
        cccc[3] = formDataUnit.getModel10().getChoice()[3];
        cccc[4] = formDataUnit.getModel10().getChoice()[4];
        cccc[5] = formDataUnit.getModel10().getChoice()[5];
        t[0] = formDataUnit.getModel10().getText(5)[0];
        t[1] = formDataUnit.getModel10().getText(5)[1];
        t[2] = formDataUnit.getModel10().getText(5)[2];
        t[3] = formDataUnit.getModel10().getText(6)[0];
        t[4] = formDataUnit.getModel10().getText(6)[1];
        t[5] = formDataUnit.getModel10().getText(6)[2];
        perc10.setText(GetPercent(cccc, t));

    }

    private String GetPercent(int[] choice, String[] lack_project){
        int i;
        double sum = 0, done = 0;
        if(choice != null){
            sum += choice.length;
            for(i = 0; i < choice.length; i ++){
                if(choice[i] != -1){
                    done ++;
                }
            }
        }
        if(lack_project != null){
            sum += lack_project.length;
            for(i = 0; i < lack_project.length; i ++){
                if(lack_project[i] != ""){
                    done ++;
                }
            }
        }
        int perc = (int)(done / sum * 100);
        String s = "" + perc + "%";
        return s;
    }

}
