package ua.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Oleksii on 29.01.2017.
 * oleksii.holyk@outlook.com
 */
@Controller
public class EventController {

    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public void addEvent(HttpServletRequest request) {

        System.out.println("HttpServletRequest="+request);
    }
}
