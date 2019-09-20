package com.zetcode.controller;

import com.zetcode.model.Message;
import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
@Controller
public class HelloController {

    @Inject
    private Message message;

    @GET
    public String hello() {
        
        message.setText("Today is a sunny day");
        
        return "hello.jsp";
    }
}