package org.kv.studentadmissioncontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by KV on 23/12/2016.
 */

public class DayOfWeekBasedAccessInterceptor
		extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler) throws Exception {

		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);

		if (dayOfWeek == 1){
			response.getWriter().write("The Website is closed on Sunday; "
					+ "please try accessing it on any other week day!!");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("HandlerInterceptorAdapter: Spring MVC " +
				"called postHandle method for the" + request.getRequestURI());
	}

	@Override
	public void afterCompletion(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			Exception ex) throws Exception {

		System.out.println("HandlerInterceptorAdapter: Spring MVC " +
				"called afterCompletion method for" + request.getRequestURI());
	}
}
