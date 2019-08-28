package com.yonyou.trains.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeTestController {
    private Logger logger = LoggerFactory.getLogger("yylog");
    @RequestMapping("/time")
    public String index(@RequestParam(defaultValue = "0",required = false) int time){
        Long begin=System.currentTimeMillis();
        logger.info("Time method execute begin.");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("{} call method index.",this.getClass().getSimpleName());
        Long end = System.currentTimeMillis();
        logger.info("Time method execute end,cost {}ms",end-begin);
        return "Time method execute end,cost "+(end-begin)+"ms";
    }
}
