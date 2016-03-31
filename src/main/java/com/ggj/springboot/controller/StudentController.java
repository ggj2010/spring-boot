package com.ggj.springboot.controller;

import com.ggj.springboot.bean.Student;
import com.ggj.springboot.bean.XMLBean;
import com.ggj.springboot.database.h2.service.StudentService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/3/29 22:46
 */
@RestController
@RequestMapping("student")
@Api(basePath = "/student", value = "学生管理API", description = "学生相关", produces = "application/json")
@Slf4j
public class StudentController {
	@Autowired
	private StudentService studentService;

	// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ApiOperation(value = "测试接口", notes = "测试接口详细描述")
	public String list(@ApiParam(required = true, name = "name", value = "姓名") @RequestParam(name = "name") String stuName, Pageable pageable) {
		return "success";
	}

	@RequestMapping(value = "/student/{ids}/", method = RequestMethod.GET)
	@ApiOperation(value = "根据ID获取用户", notes = "这是描述啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊！")
	/// student/{id}/ @PathVariable long id,
	public Student getStudentById(@PathVariable("ids") long ids) {
		log.info("@PathVariable(\"id\") ids=" + ids);
		return studentService.findStudentById(ids);
	}

	// 使用此注解标示这个接口不在api显示
	@ApiIgnore
	@RequestMapping(value = "/apiIgnore", method = RequestMethod.GET)
	public List<String> apiIgnore() {
		List<String> list = new ArrayList<String>();
		list.add("高");
		list.add("广");
		list.add("金");
		return list;
	}

	@ApiOperation(value = "测试返回格式为xml类型数据", notes = "通过HttpMessageConverters 可以返回不同类型的数据")
	@RequestMapping(value = "/xmltest", method = RequestMethod.GET)
	public XMLBean backXmlStyle() {
		return new XMLBean("1", "http://localhost:8080/student/xmltest.xml  返回xml格式,http://localhost:8080/student/xmltest.json");
	}

	@ApiOperation(value = "获得学生信息", notes = "接受json格式的字符串)", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "商品信息"), @ApiResponse(code = 201, message = "(token验证失败)", response = String.class),
			@ApiResponse(code = 202, message = "(系统错误)", response = String.class) })
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Student getJsonResult(@ApiParam(value = "Json参数", required = true) @RequestBody Student student) throws Exception {
		return studentService.findStudentById(student.getId());
	}


}
