/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package hibernate.globalconf;

import org.orm.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import org.orm.http.ORMHttpServletRequest;

public class TPAAFilter implements Filter {
	private static ServletRequestFactory _servletRequestFactory;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		String ormRequest = filterConfig.getInitParameter("WrapServletRequest");
		if (ormRequest == null || ormRequest.equals("false")) {
			_servletRequestFactory = new NormalServletRequestFactory();
		}
		else {
			if (System.getProperty("weblogic.Name") == null)  {
				ServletRequestFactory servletRequestFactory;
				try {
					servletRequestFactory = new ORMServletRequestFactory(hibernate.globalconf.TPAAPersistentManager.instance());
				}
				catch (PersistentException e) {
					servletRequestFactory = new NormalServletRequestFactory();
				}
				_servletRequestFactory = servletRequestFactory;
			}
			else {
				_servletRequestFactory = new NormalServletRequestFactory();
			}
		}
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		if(request instanceof HttpServletRequest) {
			String url = ((HttpServletRequest) request).getRequestURL().toString();
			if (url.endsWith(".html") || url.endsWith(".htm")) {
				filterChain.doFilter(request, response);
				return;
			}
		}
		try {
			ServletRequest req;
			try {
				req = _servletRequestFactory.getServletRequest(request);
			}
			catch (ClassCastException cce) {
				req = request;
			}
			filterChain.doFilter(req, response);
		}
		finally {
			try {
				PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession(false);
				if (session != null) {
					session.close();
				}
			}
			catch (PersistentException e) {
			}
		}
	}
	
	public void destroy() {
	}
	
	static interface ServletRequestFactory  {
		public ServletRequest getServletRequest(ServletRequest request);
	}
	
	static class NormalServletRequestFactory implements ServletRequestFactory  {
		public ServletRequest getServletRequest(ServletRequest request)  {
			return request;
		}
	}
	
	static class ORMServletRequestFactory implements ServletRequestFactory  {
		private final PersistentManager _persistentManager;
		public ORMServletRequestFactory(PersistentManager persistentManager)  {
			_persistentManager = persistentManager;
		}
		
		public ServletRequest getServletRequest(ServletRequest request)  {
			return new ORMHttpServletRequest(_persistentManager, (HttpServletRequest)request);
		}
	}
}
