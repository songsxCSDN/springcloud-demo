package com.ssx.controller;

import com.ssx.common.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/admin")
public class RequestController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/browser/type")
    @ResponseBody
    public CommonResult getUserAgent(HttpServletRequest request){
        CommonResult commonResult = new CommonResult();
        try{
            String type = request.getHeader("User-Agent").toLowerCase();
            //针对ie浏览器做判断
            if(type.contains("msie") || type.contains("trident")){
                commonResult.setCode("200");
                commonResult.setMessage("是ie浏览器");
            }else{
                commonResult.setCode("400");
                commonResult.setMessage("不是ie浏览器");
            }
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("获取浏览器类型失败");
        }
        return commonResult;
    }
}
