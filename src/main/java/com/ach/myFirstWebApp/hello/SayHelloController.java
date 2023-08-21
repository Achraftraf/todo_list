package com.ach.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {
@RequestMapping("say-hello")
@ResponseBody
public String sayHello() {
	return "hello , how are you ? "; 
}
@RequestMapping("say-hello-html")
@ResponseBody
public String sayHelloHtml() {
	StringBuffer sb = new StringBuffer();
	sb.append("<html>");
	sb.append("<head>");
	sb.append("<title> My First HTML Page - Changed</title>");
	sb.append("</head>");
	sb.append("<body>");
	sb.append("My first html page with body - Changed");
	sb.append("</body>");
	sb.append("</html>");
	
	return sb.toString();
}
//
// "say-hello-jsp" => sayHello.jsp 
// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
@RequestMapping("say-hello-jsp")
public String sayHelloJsp() {
	return "sayHello";
}


}
