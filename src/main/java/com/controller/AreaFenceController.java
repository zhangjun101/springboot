package com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * u_area_fence
 * 
 * @author zhou
 * @date 2020-03-25 11:51:56
 */
@RestController
@RequestMapping("/test")
public class AreaFenceController {

    @GetMapping("/healthyTest")
    public Object healthyTest(){
        return "ok";
    }
}
