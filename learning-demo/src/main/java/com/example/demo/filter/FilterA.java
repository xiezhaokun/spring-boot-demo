package com.example.demo.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author xiezhaokun
 */
public class FilterA implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterA init()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FilterA doFilter()");
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        System.out.println("FilterA destroy()");
    }
}
