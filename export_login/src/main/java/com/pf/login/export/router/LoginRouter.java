package com.pf.login.export.router;

/**
 * 购物车组件路由表
 * 即 购物车组件中 所有可以从外部跳转的页面 的路由信息
 *
 * @author hufeiyang
 */
public interface LoginRouter {

    /**
     * 购物车页面
     */
    String PATH_LOGIN_ACTIVITY = "/login/LoginActivity";

    /**
     * fragment
     */
    String PATH_LOGIN_FRAGMENT = "/login/LoginFragment";

    /**
     * 购物车服务
     */
    String PATH_LOGIN_SERVICE = "/login/service";

}
