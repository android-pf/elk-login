package com.pf.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pf.login.export.router.LoginRouter;

@Route(path = LoginRouter.PATH_LOGIN_ACTIVITY)
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        //跳转页面1
//        findViewById(R.id.tv_page_name1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ARouter.getInstance()
//                        .build("/home/HomeActivity")
//                        .withString("key1", "param1")//携带参数1
//                        .withString("key2", "param2")//携带参数2
//                        .navigation();
//
////                CartServiceUtil.navigateCartPage("param1", "param1");
//            }
//        });
//
//        //跳转页面1
//        findViewById(R.id.tv_page_name2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ARouter.getInstance()
//                        .build("/home/HomeActivity")
//                        .withString("key1", "param3")//携带参数1
//                        .withString("key2", "param4")//携带参数2
//                        .navigation();
//
////                CartServiceUtil.navigateCartPage("param1", "param1");
//            }
//        });
    }
}
