package com.next.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： lenovo
 * @date： 2022/7/22 15:57
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello!";
    }
}
