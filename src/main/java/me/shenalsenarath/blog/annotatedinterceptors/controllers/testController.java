package me.shenalsenarath.blog.annotatedinterceptors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shenal on 4/23/16.
 */
@RestController
@RequestMapping(path = "/testCtrl")
public class testController {

    @RequestMapping(path = "/t1", method = RequestMethod.GET)
    public String test1(){
        String rtnStr="tes1";
        System.out.println("You have reached" + rtnStr);
        return rtnStr;
    }

    @RequestMapping(path = "/t2", method = RequestMethod.GET)
    public String test2(){
        String rtnStr="test2";
        System.out.println("You have reached" + rtnStr);
        return rtnStr;
    }


}
