package com.pf.login.export.service;


import com.alibaba.android.arouter.facade.template.IProvider;
import com.pf.login.export.bean.LoginInfo;

/**
 * 组件对外暴露的服务
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    LoginInfo getProductCountInCart();
}
