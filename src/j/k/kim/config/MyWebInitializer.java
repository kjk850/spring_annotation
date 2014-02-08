package j.k.kim.config;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletRegistration;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { MyAppConfig.class, DataSourceConfig.class, };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MyAppConfig.class };
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return new Filter[] { characterEncodingFilter };
	}

	@Override
	protected void customizeRegistration(
			ServletRegistration.Dynamic registration) {
		registration.setInitParameter("defaultHtmlEscape", "true");
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		WebApplicationContext context = (WebApplicationContext) super.createRootApplicationContext();
		((ConfigurableEnvironment) context.getEnvironment()).setActiveProfiles("dev");
		return context;
	}
}
