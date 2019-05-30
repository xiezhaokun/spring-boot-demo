package com.example.demo.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author xiezhaokun
 */
public class FilterB implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterB init()");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FilterB doFilter() before");
        chain.doFilter(request,response);
        System.out.println("FilterB doFilter() after");
    }

    @Override
    public void destroy() {
        System.out.println("FilterB destroy()");
    }
}
