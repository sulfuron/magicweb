package from.jimmy.spring.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

public class WebUtils {
	public static WebApplicationContext getContext(HttpServletRequest request){
		return RequestContextUtils.getWebApplicationContext(request);
	}
}
