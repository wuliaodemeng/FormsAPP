package com.example.administrator.formsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/13.
 */

public class TabFragment extends Fragment{
    private int resource;

    private CallBackValue callBackValue;

    View v = null;

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    private int classID = 0;

    public int getChoice() {
        return choice;
    }

    public String getLack_project() {
        return lack_project;
    }

    public String getDescription() {
        return description;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    private int choice = -1;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title = "";

    private int[] n = {0, 0, 0, 0};

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID = -1;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setLack_project(String lack_project) {
        this.lack_project = lack_project;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    String[] text = new String[3];

    private String lack_project = null;
    private String description = null;
    private Bitmap bitmap = null;


    public void setResource(int resource) {
        this.resource = resource;
    }

    public static final int TAKE_PHOTO = 11;

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }

    private ImageView picture;

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    private Uri imageUri;

    public static final int CHOOSE_PHOTO = 22;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callBackValue = (CallBackValue) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(resource, container, false);
        v = view;
        if(title != ""){
            TextView t = (TextView) view.findViewById(R.id.title);
            t.setText(title);
        }

        if(resource != R.layout.tab1 && resource != R.layout.tab2 && resource != R.layout.model4_tab1 && resource != R.layout.model10_tab5 && resource != R.layout.model10_tab7 && resource != R.layout.model8_tab2 && resource != R.layout.mining_tab_8 && resource != R.layout.mining_tab_6) {
            if (view.findViewById(R.id.question) instanceof RadioGroup) {
                RadioGroup radioGroup = view.findViewById(R.id.question);

                switch (choice){
                    case -1:
                        break;
                    case 1:
                        radioGroup.check(R.id.first);
                        break;
                    case 2:
                        radioGroup.check(R.id.second);
                        break;
                    case 3:
                        radioGroup.check(R.id.third);
                        break;
                    case 4:
                        radioGroup.check(R.id.fourth);
                        break;
                    case 5:
                        radioGroup.check(R.id.fifth);
                        break;
                    default:
                        break;
                }

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                        switch (i) {
                            case R.id.first:
                                choice = 1;
                                break;
                            case R.id.second:
                                choice = 2;
                                break;
                            case R.id.third:
                                choice = 3;
                                break;
                            case R.id.fourth:
                                choice = 4;
                                break;
                            case R.id.fifth:
                                choice = 5;
                                break;
                            default:
                                choice = -1;
                                break;
                        }
                        callBackValue.SendChoice(choice, ID);

                    }
                });


            } else if (view.findViewById(R.id.question) instanceof EditText) {
                EditText editText = view.findViewById(R.id.question);
                if(lack_project != ""){
                    editText.setText(lack_project);
                }
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        lack_project = editable.toString();
                        callBackValue.SendLackProject(lack_project, ID);
                    }
                });
            }



            EditText d = view.findViewById(R.id.decription);
            if(description != ""){
                d.setText(description);
            }
            d.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    description = editable.toString();
                    callBackValue.SendDescription(description, ID);
                }
            });
        }

        if(resource == R.layout.model4_tab1){
            CheckBox checkBox1 = (CheckBox) view.findViewById(R.id.question1);
            CheckBox checkBox2 = (CheckBox) view.findViewById(R.id.question2);
            CheckBox checkBox3 = (CheckBox) view.findViewById(R.id.question3);
            CheckBox checkBox4 = (CheckBox) view.findViewById(R.id.question4);
            GetN(choice);
            if(n[0] == 1){
                checkBox1.setChecked(true);
            }
            if(n[1] == 1){
                checkBox2.setChecked(true);
            }
            if(n[2] == 1){
                checkBox3.setChecked(true);
            }
            if(n[3] == 1){
                checkBox4.setChecked(true);
            }


            checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        n[0] = 1;
                    }
                    else {
                        n[0] = 0;
                    }
                    choice = n[3] + n[2] * 2 + n[1] * 4 + n[0] * 8;
                    if(choice == 0){
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        n[1] = 1;
                    }
                    else {
                        n[1] = 0;
                    }
                    choice = n[3] + n[2] * 2 + n[1] * 4 + n[0] * 8;
                    if(choice == 0){
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });
            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        n[2] = 1;
                    }
                    else {
                        n[2] = 0;
                    }
                    choice = n[3] + n[2] * 2 + n[1] * 4 + n[0] * 8;
                    if(choice == 0){
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });
            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        n[3] = 1;
                    }
                    else {
                        n[3] = 0;
                    }
                    choice = n[3] + n[2] * 2 + n[1] * 4 + n[0] * 8;
                    if(choice == 0){
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });

            EditText d = view.findViewById(R.id.decription);
            if(description != ""){
                d.setText(description);
            }
            d.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    description = editable.toString();
                    callBackValue.SendDescription(description, ID);
                }
            });
        }

        if(resource == R.layout.model8_tab2){
            RadioButton radioButton = view.findViewById(R.id.choice);
            if(choice == 1){
                radioButton.setChecked(true);
            }

            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        choice = 1;
                    }
                    else {
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });

            EditText editText = view.findViewById(R.id.question);
            if(lack_project != ""){
                editText.setText(lack_project);
            }
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    lack_project = editable.toString();
                    callBackValue.SendLackProject(lack_project, ID);
                }
            });

            EditText d = view.findViewById(R.id.decription);
            if(description != ""){
                d.setText(description);
            }
            d.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    description = editable.toString();
                    callBackValue.SendDescription(description, ID);
                }
            });


        }
        if(resource == R.layout.model10_tab5 || resource == R.layout.mining_tab_6){
            RadioButton radioButton = view.findViewById(R.id.question);
            if(choice == 1){
                radioButton.setChecked(true);
            }

            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        choice = 1;
                    }
                    else {
                        choice = -1;
                    }
                    callBackValue.SendChoice(choice, ID);
                }
            });

            EditText text1 = view.findViewById(R.id.text1);
            EditText text2 = view.findViewById(R.id.text2);
            EditText text3 = view.findViewById(R.id.text3);
            if(text[0] != "" && text[0] != null){
                text1.setText(text[0]);
            }
            if(text[1] != "" && text[1] != null){
                text2.setText(text[1]);
            }
            if(text[2] != "" && text[2] != null){
                text3.setText(text[2]);
            }

            text1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[0] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });

            text2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[1] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });

            text3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[2] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });
            EditText d = view.findViewById(R.id.decription);
            if(description != ""){
                d.setText(description);
            }
            d.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    description = editable.toString();
                    callBackValue.SendDescription(description, ID);
                }
            });

        }

        if(resource == R.layout.model10_tab7 || resource == R.layout.mining_tab_8){
            EditText text1 = view.findViewById(R.id.text1);
            EditText text2 = view.findViewById(R.id.text2);
            EditText text3 = view.findViewById(R.id.text3);
            if(text[0] != "" && text[0] != null){
                text1.setText(text[0]);
            }
            if(text[1] != "" && text[1] != null){
                text2.setText(text[1]);
            }
            if(text[2] != "" && text[2] != null){
                text3.setText(text[2]);
            }

            text1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[0] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });

            text2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[1] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });

            text3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    text[2] = editable.toString();
                    callBackValue.SendText(text, ID);
                }
            });

            EditText d = view.findViewById(R.id.decription);
            if(description != ""){
                d.setText(description);
            }

            d.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    description = editable.toString();
                    callBackValue.SendDescription(description, ID);
                }
            });

        }


        if(resource != R.layout.tab1 && resource != R.layout.tab2){
            picture = (ImageView) view.findViewById(R.id.picture);

            //picture.setImageResource(R.drawable.upload_picture);
            if(bitmap == null){
                picture.setImageResource(R.drawable.upload_picture);
            }
            else {
                picture.setImageBitmap(bitmap);
            }

            picture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ContextCompat.checkSelfPermission(getActivity(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(getActivity(), new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                    } else{
                        //openAlbum();
                        start_photo(true);
                    }
                }
            });

            picture.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    File outputImage = new File(getActivity().getExternalCacheDir(), "output_image1.jpg");
                    try{
                        if(outputImage.exists()){
                            outputImage.delete();
                        }
                        outputImage.createNewFile();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    if(Build.VERSION.SDK_INT >= 24){
                        imageUri = FileProvider.getUriForFile(getActivity(), "com.example.administrator.formsapp.fileprovider", outputImage);

                    } else {
                        imageUri = Uri.fromFile(outputImage);
                    }
                    //启动相机程序
                    start_photo(false);
                    return false;
                }
            });
            /*

            picture.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    Toast.makeText(getActivity(), "Changed!", Toast.LENGTH_SHORT).show();
                    if(bitmap == null){
                        view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(ContextCompat.checkSelfPermission(getActivity(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                                    ActivityCompat.requestPermissions(getActivity(), new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                                } else{
                                    //openAlbum();
                                    Form_3 form_3 = (Form_3)getActivity();
                                    form_3.openAlbum(ID);
                                }
                            }
                        });

                        view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                File outputImage = new File(getActivity().getExternalCacheDir(), "output_image.jpg");
                                try{
                                    if(outputImage.exists()){
                                        outputImage.delete();
                                    }
                                    outputImage.createNewFile();
                                } catch (IOException e){
                                    e.printStackTrace();
                                }
                                if(Build.VERSION.SDK_INT >= 24){
                                    imageUri = FileProvider.getUriForFile(getActivity(), "com.example.administrator.formsapp.fileprovider", outputImage);

                                } else {
                                    imageUri = Uri.fromFile(outputImage);
                                }
                                //启动相机程序
                                Form_3 form_3 = (Form_3)getActivity();
                                form_3.openCamera(ID);

                                return false;
                            }
                        });
                    }
                    else{

                    }
                }

            });
            */
        }


        return view;
    }

    private void start_photo(boolean flag){
        if(flag){
            if(classID == 11){
                Common_1 form_3 = (Common_1) getActivity();
                form_3.openAlbum(ID);
            }
            if(classID == 12){
                Common_2 form_4 = (Common_2) getActivity();
                form_4.openAlbum(ID);
            }
            if(classID == 13){
                Common_3 form_5 = (Common_3) getActivity();
                form_5.openAlbum(ID);
            }
            if(classID == 14){
                Common_4 form_6 = (Common_4) getActivity();
                form_6.openAlbum(ID);
            }
            if(classID == 15){
                Common_5 form_7 = (Common_5) getActivity();
                form_7.openAlbum(ID);
            }
            if(classID == 16){
                Common_6 form_8 = (Common_6) getActivity();
                form_8.openAlbum(ID);
            }
            if(classID == 17){
                Common_7 form_9 = (Common_7) getActivity();
                form_9.openAlbum(ID);
            }
            if(classID == 18){
                Common_8 form_10 = (Common_8) getActivity();
                form_10.openAlbum(ID);
            }
            if(classID == 19){
                Common_9 form_11 = (Common_9) getActivity();
                form_11.openAlbum(ID);
            }
            if(classID == 21){
                Mining_1 form_3 = (Mining_1) getActivity();
                form_3.openAlbum(ID);
            }
            if(classID == 22){
                Mining_2 form_4 = (Mining_2) getActivity();
                form_4.openAlbum(ID);
            }
            if(classID == 23){
                Mining_3 form_5 = (Mining_3) getActivity();
                form_5.openAlbum(ID);
            }
            if(classID == 24){
                Mining_4 form_6 = (Mining_4)getActivity();
                form_6.openAlbum(ID);
            }
            if(classID == 25){
                Mining_5 form_7 = (Mining_5)getActivity();
                form_7.openAlbum(ID);
            }
            if(classID == 26){
                Mining_6 form_8 = (Mining_6)getActivity();
                form_8.openAlbum(ID);
            }
            if(classID == 27){
                Mining_7 form_9 = (Mining_7)getActivity();
                form_9.openAlbum(ID);
            }
            if(classID == 28){
                Mining_8 form_10 = (Mining_8)getActivity();
                form_10.openAlbum(ID);
            }
            if(classID == 29){
                Mining_9 form_11 = (Mining_9)getActivity();
                form_11.openAlbum(ID);
            }
            if(classID == 210){
                Mining_10 form_8 = (Mining_10)getActivity();
                form_8.openAlbum(ID);
            }
            if(classID == 211){
                Mining_11 form_9 = (Mining_11)getActivity();
                form_9.openAlbum(ID);
            }
            if(classID == 212){
                Mining_12 form_10 = (Mining_12)getActivity();
                form_10.openAlbum(ID);
            }
            if(classID == 213){
                Mining_13 form_11 = (Mining_13)getActivity();
                form_11.openAlbum(ID);
            }
            if(classID == 31){
                Form_3 form_3 = (Form_3)getActivity();
                form_3.openAlbum(ID);
            }
            if(classID == 32){
                Form_4 form_4 = (Form_4)getActivity();
                form_4.openAlbum(ID);
            }
            if(classID == 33){
                Form_5 form_5 = (Form_5)getActivity();
                form_5.openAlbum(ID);
            }
            if(classID == 34){
                Form_6 form_6 = (Form_6)getActivity();
                form_6.openAlbum(ID);
            }
            if(classID == 35){
                Form_7 form_7 = (Form_7)getActivity();
                form_7.openAlbum(ID);
            }
            if(classID == 36){
                Form_8 form_8 = (Form_8)getActivity();
                form_8.openAlbum(ID);
            }
            if(classID == 37){
                Form_9 form_9 = (Form_9)getActivity();
                form_9.openAlbum(ID);
            }
            if(classID == 38){
                Form_10 form_10 = (Form_10)getActivity();
                form_10.openAlbum(ID);
            }
            if(classID == 39){
                Form_11 form_11 = (Form_11)getActivity();
                form_11.openAlbum(ID);
            }
            if(classID == 310){
                Form_12 form_12 = (Form_12)getActivity();
                form_12.openAlbum(ID);
            }
        }
        else{
            if(classID == 11){
                Common_1 form_3 = (Common_1) getActivity();
                form_3.openCamera(ID);
            }
            if(classID == 12){
                Common_2 form_4 = (Common_2) getActivity();
                form_4.openCamera(ID);
            }
            if(classID == 13){
                Common_3 form_5 = (Common_3) getActivity();
                form_5.openCamera(ID);
            }
            if(classID == 14){
                Common_4 form_6 = (Common_4) getActivity();
                form_6.openCamera(ID);
            }
            if(classID == 15){
                Common_5 form_7 = (Common_5) getActivity();
                form_7.openCamera(ID);
            }
            if(classID == 16){
                Common_6 form_8 = (Common_6) getActivity();
                form_8.openCamera(ID);
            }
            if(classID == 17){
                Common_7 form_9 = (Common_7) getActivity();
                form_9.openCamera(ID);
            }
            if(classID == 18){
                Common_8 form_10 = (Common_8) getActivity();
                form_10.openCamera(ID);
            }
            if(classID == 19){
                Common_9 form_11 = (Common_9) getActivity();
                form_11.openCamera(ID);
            }
            if(classID == 21){
                Mining_1 form_3 = (Mining_1) getActivity();
                form_3.openCamera(ID);
            }
            if(classID == 22){
                Mining_2 form_4 = (Mining_2) getActivity();
                form_4.openCamera(ID);
            }
            if(classID == 23){
                Mining_3 form_5 = (Mining_3) getActivity();
                form_5.openCamera(ID);
            }
            if(classID == 24){
                Mining_4 form_6 = (Mining_4)getActivity();
                form_6.openCamera(ID);
            }
            if(classID == 25){
                Mining_5 form_7 = (Mining_5)getActivity();
                form_7.openCamera(ID);
            }
            if(classID == 26){
                Mining_6 form_8 = (Mining_6)getActivity();
                form_8.openCamera(ID);
            }
            if(classID == 27){
                Mining_7 form_9 = (Mining_7)getActivity();
                form_9.openCamera(ID);
            }
            if(classID == 28){
                Mining_8 form_10 = (Mining_8)getActivity();
                form_10.openCamera(ID);
            }
            if(classID == 29){
                Mining_9 form_11 = (Mining_9)getActivity();
                form_11.openCamera(ID);
            }
            if(classID == 210){
                Mining_10 form_8 = (Mining_10)getActivity();
                form_8.openAlbum(ID);
            }
            if(classID == 211){
                Mining_11 form_9 = (Mining_11)getActivity();
                form_9.openCamera(ID);
            }
            if(classID == 212){
                Mining_12 form_10 = (Mining_12)getActivity();
                form_10.openCamera(ID);
            }
            if(classID == 213){
                Mining_13 form_11 = (Mining_13)getActivity();
                form_11.openCamera(ID);
            }
            if(classID == 31){
                Form_3 form_3 = (Form_3)getActivity();
                form_3.openCamera(ID);
            }
            if(classID == 32){
                Form_4 form_4 = (Form_4)getActivity();
                form_4.openCamera(ID);
            }
            if(classID == 33){
                Form_5 form_5 = (Form_5)getActivity();
                form_5.openCamera(ID);
            }
            if(classID == 34){
                Form_6 form_6 = (Form_6)getActivity();
                form_6.openCamera(ID);
            }
            if(classID == 5){
                Form_7 form_7 = (Form_7)getActivity();
                form_7.openCamera(ID);
            }
            if(classID == 36){
                Form_8 form_8 = (Form_8)getActivity();
                form_8.openCamera(ID);
            }
            if(classID == 37){
                Form_9 form_9 = (Form_9)getActivity();
                form_9.openCamera(ID);
            }
            if(classID == 38){
                Form_10 form_10 = (Form_10)getActivity();
                form_10.openCamera(ID);
            }
            if(classID == 39){
                Form_11 form_11 = (Form_11)getActivity();
                form_11.openCamera(ID);
            }
            if(classID == 310){
                Form_12 form_12 = (Form_12)getActivity();
                form_12.openCamera(ID);
            }
        }
    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(R.layout.tab1 == resource){
            Button button = (Button)getActivity().findViewById(R.id.button_tab1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Form_1.class);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    //openAlbum();
                    Form_3 form_3 = (Form_3)getActivity();
                    form_3.openAlbum(ID);
                } else {
                    Toast.makeText(getActivity(), "You denied the permission", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }


    public interface CallBackValue{
        public void SendChoice(int choice, int i);
        public void SendLackProject(String lack_project, int i);
        public void SendDescription(String description, int i);
        public void SendPicture(Bitmap picture, int i);
        public void SendText(String[] text, int i);
    }

    private void GetN(int choice){
        n[0] = n[1] = n[2] = n[3] = 0;
        int i = 3;
        while(choice != 0 && i >= 0){
            n[i] = choice % 2;
            choice /= 2;
            i --;
        }
    }



}
