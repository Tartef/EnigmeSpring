package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

public class CustomErrorController {
    @RequestMapping("/error")
    @ResponseBody
    String error(HttpServletRequest request) {
        return "<h1>Error occurred</h1>";
    }

    public String getErrorPath() {
        return "/error";
    }
}
