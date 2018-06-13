package com.initStart;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @Description:项目文件启动加载
 */
public class InterfaceUrlIntiServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        InterfaceUrlInti.init();
    }
}
