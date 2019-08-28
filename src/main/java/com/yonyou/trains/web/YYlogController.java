package com.yonyou.trains.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YYlogController {
    private Logger logger = LoggerFactory.getLogger("yylog");
    @RequestMapping("/")
    public String index(){
        logger.debug("{} call method index.",this.getClass().getSimpleName());
        logger.info("{} call method index.",this.getClass().getSimpleName());
        logger.error("{}","yylog error.");
        return "hello world";
    }
}
