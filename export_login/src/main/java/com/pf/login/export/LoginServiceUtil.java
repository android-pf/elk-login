package com.pf.login.export;

import com.alibaba.android.arouter.launcher.ARouter;
import com.pf.login.export.bean.LoginInfo;
import com.pf.login.export.router.LoginRouter;
import com.pf.login.export.service.ICartService;

/**
 * 购物车组件服务工具类
 * 其他组件直接使用此类即可：页面跳转、获取服务。
 *
 * @author hufeiyang
 */
public class LoginServiceUtil {

    /**
     * 跳转到 xx页面
     *
     * @param param1
     * @param param2
     */
    public static void navigateLogin(String param1, String param2) {
        ARouter.getInstance()
                .build(LoginRouter.PATH_LOGIN_ACTIVITY)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     *
     * @return
     */
    public static ICartService getService() {
        return (ICartService) ARouter.getInstance().build(LoginRouter.PATH_LOGIN_SERVICE).navigation();
    }

    /**
     * 获取 数量
     *
     * @return
     */
    public static LoginInfo getCartProductCount() {
        return getService().getProductCountInCart();
    }

}
