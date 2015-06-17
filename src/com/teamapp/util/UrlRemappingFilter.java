package com.teamapp.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlRemappingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		/**
		 * 如果处理HTTP请求，并且需要访问诸如getHeader或getCookies等在ServletRequest中 　
		 * 无法得到的方法，就要把此request对象构造成HttpServletRequest
		 */
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String currentURL = request.getRequestURI(); // 取得根目录所对应的绝对路径:

		if (currentURL.length() > 0
				&& currentURL.charAt(currentURL.length() - 1) != '/') {
			response.sendRedirect(currentURL + '/');
		} else {
			filterChain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
