package com.example.administrator.formsapp;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static android.R.id.tabs;
import static com.example.administrator.formsapp.TabFragment.CHOOSE_PHOTO;
import static com.example.administrator.formsapp.TabFragment.TAKE_PHOTO;

/**
 * Created by Administrator on 2017/7/13.
 */

public class Form_7 extends AppCompatActivity implements TabLayout.OnTabSelectedListener, TabFragment.CallBackValue{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TabPagerAdapter adapter;

    TabFragment tab1 = new TabFragment();
    TabFragment tab2 = new TabFragment();
    TabFragment tab3 = new TabFragment();
    TabFragment tab4 = new TabFragment();
    TabFragment tab5 = new TabFragment();
    TabFragment tab6 = new TabFragment();
    TabFragment tab7 = new TabFragment();
    private Model5 model = new Model5();

    private ImageView picture[] = new ImageView[7];
    private Uri imageUri[] = new Uri[7];
    private int id = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_7);

        tab1.setClassID(35);
        tab2.setClassID(35);
        tab3.setClassID(35);
        tab4.setClassID(35);
        tab5.setClassID(35);
        tab6.setClassID(35);
        tab7.setClassID(35);

        model = (Model5) getIntent().getSerializableExtra("model5");
        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_model5", model);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        tabLayout = (TabLayout)findViewById(R.id.tablayout);

        viewPager = (ViewPager)findViewById(R.id.viewpager);

        adapter = new TabPagerAdapter(getSupportFragmentManager());

        if(model != null) {
            tab1.setChoice(model.getChoice(0));
            tab2.setChoice(model.getChoice(1));
            tab3.setChoice(model.getChoice(2));
            tab4.setChoice(model.getChoice(3));
            tab5.setChoice(model.getChoice(4));
            tab6.setChoice(model.getChoice(5));
            tab7.setChoice(model.getChoice(6));

            tab1.setDescription(model.getDescription(0));
            tab2.setDescription(model.getDescription(1));
            tab3.setDescription(model.getDescription(2));
            tab4.setDescription(model.getDescription(3));
            tab5.setDescription(model.getDescription(4));
            tab6.setDescription(model.getDescription(5));
            tab7.setDescription(model.getDescription(6));

            tab1.setBitmap(model.getPicture(0));
            tab2.setBitmap(model.getPicture(1));
            tab3.setBitmap(model.getPicture(2));
            tab4.setBitmap(model.getPicture(3));
            tab5.setBitmap(model.getPicture(4));
            tab6.setBitmap(model.getPicture(5));
            tab7.setBitmap(model.getPicture(6));

        }

        tab1.setID(0);
        tab2.setID(1);
        tab3.setID(2);
        tab4.setID(3);
        tab5.setID(4);
        tab6.setID(5);
        tab7.setID(6);

        tab1.setResource(R.layout.model5_tab7);
        tab2.setResource(R.layout.model5_tab1);
        tab3.setResource(R.layout.model5_tab2);
        tab4.setResource(R.layout.model5_tab3);
        tab5.setResource(R.layout.model5_tab4);
        tab6.setResource(R.layout.model5_tab5);
        tab7.setResource(R.layout.model5_tab6);

        tabLayout.addOnTabSelectedListener(this);

        adapter.addFragment(tab1);
        adapter.addFragment(tab2);
        adapter.addFragment(tab3);
        adapter.addFragment(tab4);
        adapter.addFragment(tab5);
        adapter.addFragment(tab6);
        adapter.addFragment(tab7);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        id = tab.getPosition();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }


    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public class TabPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragments = new ArrayList<>();

        public TabPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        public void addFragment(Fragment fragment) {
            mFragments.add(fragment);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            Drawable drawable;
            drawable = ContextCompat.getDrawable(Form_7.this, R.drawable.other_page);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable, ImageSpan.ALIGN_BOTTOM);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            return spannableString;
        }


    }

    public void SendChoice(int choice, int i){
        if(model != null) model.setChoice(i, choice);
        else Toast.makeText(Form_7.this, "model空指针!", Toast.LENGTH_SHORT).show();

    }
    public void SendLackProject(String lack_project, int i){

    }
    public void SendDescription(String description, int i){
        model.setDescription(i, description);
    }
    public void SendPicture(Bitmap picture, int i){
        model.setPicture(i, picture);
    }
    public void SendText(String[] text, int i){

    }

    public void openAlbum(int id){
        if(id == 0){
            imageUri[0] = tab1.getImageUri();
            picture[0] = tab1.getPicture();
        }
        if(id == 1){
            imageUri[1] = tab2.getImageUri();
            picture[1] = tab2.getPicture();
        }
        if(id == 2){
            imageUri[2] = tab3.getImageUri();
            picture[2] = tab3.getPicture();
        }
        if(id == 3){
            imageUri[3] = tab4.getImageUri();
            picture[3] = tab4.getPicture();
        }
        if(id == 4){
            imageUri[4] = tab5.getImageUri();
            picture[4] = tab5.getPicture();
        }
        if(id == 5){
            imageUri[5] = tab6.getImageUri();
            picture[5] = tab6.getPicture();
        }
        if(id == 6){
            imageUri[6] = tab7.getImageUri();
            picture[6] = tab7.getPicture();
        }

        Intent intent1 = new Intent("android.intent.action.GET_CONTENT");
        intent1.setType("image/*");
        startActivityForResult(intent1, CHOOSE_PHOTO); //打开相册
    }

    public void openCamera(int id){
        if(id == 0){
            imageUri[0] = tab1.getImageUri();
            picture[0] = tab1.getPicture();
        }
        if(id == 1){
            imageUri[1] = tab2.getImageUri();
            picture[1] = tab2.getPicture();
        }
        if(id == 2){
            imageUri[2] = tab3.getImageUri();
            picture[2] = tab3.getPicture();
        }
        if(id == 3){
            imageUri[3] = tab4.getImageUri();
            picture[3] = tab4.getPicture();
        }
        if(id == 4){
            imageUri[4] = tab5.getImageUri();
            picture[4] = tab5.getPicture();
        }
        if(id == 5){
            imageUri[5] = tab6.getImageUri();
            picture[5] = tab6.getPicture();
        }
        if(id == 6){
            imageUri[6] = tab7.getImageUri();
            picture[6] = tab7.getPicture();
        }
        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        intent2.putExtra(MediaStore.EXTRA_OUTPUT, imageUri[id]);
        startActivityForResult(intent2, TAKE_PHOTO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case TAKE_PHOTO:
                if(resultCode == RESULT_OK){
                    try{
                        //将拍摄的照片显示出来
                        Bitmap bitmap;
                        bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri[id]));
                        picture[id].setImageBitmap(bitmap);
                        model.setPicture(id, bitmap);
                        if(id == 0)tab1.setBitmap(bitmap);
                        if(id == 1)tab2.setBitmap(bitmap);
                        if(id == 2)tab3.setBitmap(bitmap);
                        if(id == 3)tab4.setBitmap(bitmap);
                        if(id == 4)tab5.setBitmap(bitmap);
                        if(id == 5)tab6.setBitmap(bitmap);
                        if(id == 6)tab7.setBitmap(bitmap);
                    } catch (IOException e){
                        e.printStackTrace();
                    }

                }
                break;
            case CHOOSE_PHOTO:
                if(resultCode == RESULT_OK){
                    if(Build.VERSION.SDK_INT >= 19){
                        handleImageOnKitKat(data);
                    } else{
                        handleImageBeforeKitKat(data);
                    }
                }
                break;
            default:
                break;
        }
    }

    @TargetApi(19)
    private void handleImageOnKitKat(Intent data){
        String imagePath = null;
        Uri uri = data.getData();
        if(DocumentsContract.isDocumentUri(this, uri)){
            //如果是document类型的Uri,则通过document id处理
            String docId = DocumentsContract.getDocumentId(uri);
            if("com.android.providers.media.documents".equals(uri.getAuthority())){
                String id = docId.split(":")[1]; //解析出数字格式的id
                String selection = MediaStore.Images.Media._ID + "=" + id;
                imagePath = getImagePath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, selection);
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())){
                Uri contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(docId));
                imagePath = getImagePath(contentUri, null);
            }
        } else if("content".equalsIgnoreCase(uri.getScheme())){
            //如果是content类型的Uri，则使用普通方式处理
            imagePath = getImagePath(uri, null);
        } else if("file".equalsIgnoreCase(uri.getScheme())){
            //如果是file类型的Uri，直接获取图片路径即可
            imagePath = uri.getPath();
        }
        displayImage(imagePath);
    }

    private void handleImageBeforeKitKat(Intent data){
        Uri uri = data.getData();
        String imagePath = getImagePath(uri, null);
        displayImage(imagePath);
    }


    private String getImagePath(Uri uri, String selection){
        String path = null;
        //通过Uri和selection来获取真实的图片路径
        Cursor cursor = getContentResolver().query(uri, null, selection, null, null);
        if(cursor != null){
            if(cursor.moveToFirst()){
                path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }

    private void displayImage(String imagePath){
        if(imagePath != null){
            Bitmap bitmap;
            bitmap = BitmapFactory.decodeFile(imagePath);
            picture[id].setImageBitmap(bitmap);
            if(id == 0)tab1.setBitmap(bitmap);
            if(id == 1)tab2.setBitmap(bitmap);
            if(id == 2)tab3.setBitmap(bitmap);
            if(id == 3)tab4.setBitmap(bitmap);
            if(id == 4)tab5.setBitmap(bitmap);
            if(id == 5)tab6.setBitmap(bitmap);
            if(id == 6)tab7.setBitmap(bitmap);
            model.setPicture(id, bitmap);
        } else{
            Toast.makeText(this,"failed to get image", Toast.LENGTH_SHORT).show();
        }
    }



}
