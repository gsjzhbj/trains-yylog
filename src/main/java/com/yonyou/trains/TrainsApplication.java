package com.yonyou.trains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TrainsApplication {
    private static Logger logger= LoggerFactory.getLogger("yylog");
    public static void main(String[] args) {
        logger.debug("yylog application start.");
        logger.info("yylog application start.");
        logger.error("yylog application start.");
        SpringApplication.run(TrainsApplication.class, args);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testLogLevel() {
        logger.debug("Logger Level ：DEBUG");
        logger.info("Logger Level ：INFO");
        logger.error("Logger Level ：ERROR");
        Boolean debugEnabled=logger.isDebugEnabled();
        return debugEnabled.toString();
    }


}
