package com.wilco.manage.global.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class wilcoInterceptor extends HandlerInterceptorAdapter{
	protected Logger logger = LoggerFactory.getLogger(wilcoInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (logger.isDebugEnabled()) {
        	logger.debug("======================================          START         ======================================");
        	logger.debug(" Request URI \t:  " + request.getRequestURI());
        	logger.debug(" Request ParameterMap \t:	" + request.getParameterNames().toString());
        	
        	/*while(request.getParameterNames().hasMoreElements()){
                String param = request.getParameterNames().nextElement().toString();
                logger.debug("param==>" + param);
        	}*/
        }
        return super.preHandle(request, response, handler);
    }
     
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (logger.isDebugEnabled()) {
        	logger.debug("======================================           END          ======================================\n");
        }
    }
}

