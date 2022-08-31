package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;

@Controller(value = "actions")
public class myController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView showList() {
        ModelAndView mv = new ModelAndView("list");
        ArrayList<String> currentList = new ArrayList<>();
        currentList.add("AAA");
        currentList.add("BBB");
        currentList.add("CCC");
        currentList.add("SSS+ RANK");
        mv.addObject("currentList", currentList);
        mv.setViewName("list");
        return mv;
    }
}
