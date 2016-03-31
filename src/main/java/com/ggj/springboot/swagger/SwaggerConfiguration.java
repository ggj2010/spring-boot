package com.ggj.springboot.swagger;

import org.springframework.context.annotation.Bean;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:gaoguangjin
 * @Description:利用 Swagger 生成api文档,如果我们想修改swagger-ui.html样式，我们可以将swagger-ui的架包拷贝到public目录下面自己修改swagger-ui.html里面内容
 * @Email:335424093@qq.com
 * @Date 2016/3/29 22:15
 */
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket testApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("test").genericModelSubstitutes(DeferredResult.class)
				// .genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(false).forCodeGeneration(true).pathMapping("/")// base，最终调用接口后会和paths拼接在一起
				.select().paths(or(regex("/.*")))// 过滤的接口
				.build().apiInfo(testApiInfo());
	}

/*	@Bean
	public Docket demoApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("demo").genericModelSubstitutes(DeferredResult.class)
				// .genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(false).forCodeGeneration(false).pathMapping("/").select().paths(or(regex("/demo/.*")))// 过滤的接口
				.build().apiInfo(demoApiInfo());
	}*/

	private ApiInfo testApiInfo() {
		ApiInfo apiInfo = new ApiInfo(" API 测试", // 大标题
				"9月买mac pro", // 小标题
				"1.0", // 版本
				"NO terms of service", 	new Contact("gaoguangjin", "ggjlovezjy.date", "335424093@qq.com"),// 作者
				"生日网站", // 链接显示文字
				"http://www.ggjlovezjy.date"// 网站链接
		);

		return apiInfo;
	}

	private ApiInfo demoApiInfo() {
		ApiInfo apiInfo = new ApiInfo(" API 测试", // 大标题
				"9月买mac pro", // 小标题
				"1.0", // 版本
				"NO terms of service", 	new Contact("gaoguangjin", "ggjlovezjy.date", "335424093@qq.com"),// 作者
				"生日网站", // 链接显示文字
				"http://www.ggjlovezjy.date"// 网站链接
		);
		return apiInfo;
	}
}
