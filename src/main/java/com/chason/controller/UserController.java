package com.chason.controller;

import javax.annotation.Resource;

import com.chason.bean.User;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



import com.chason.service.UserService;
import com.chason.util.CommonUtil;


@Controller
@RequestMapping(value = "/users")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("hello1")
    public String hello1(){
        System.out.println("hellosasa");
        return "hello";
    }
    @RequestMapping("he2")
    public String hel2(){
        User user = userService.getUserByName("aaa");
        System.out.println("-------------------------------------------");
        System.out.println(user.getName()+"-----------"+user.getId());
        return "he2";
    }


    /**
     * 通过spring data jpa 调用方法
     * api :localhost:8099/users/byname?username=xxx
     * @param request
     * @return
     */
/*    @RequestMapping(value = "/byname", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> getUser(HttpServletRequest request) {
        Map<String, Object> map = CommonUtil.getParameterMap(request);
        String username = (String) map.get("username");
        return new ResponseEntity<>(userService.getUserByName(username), HttpStatus.OK);
    }*/


}