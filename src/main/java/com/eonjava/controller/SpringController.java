package com.eonjava.controller;

import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;

import javax.servlet.http.*;

public class SpringController extends AbstractController
{
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        ModelAndView model = new ModelAndView("index");
        model.addObject("msg", "Hello Spring");

        return model;
    }
}
