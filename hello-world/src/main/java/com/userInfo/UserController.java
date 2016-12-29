package com.userInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaotalk on 2016/12/29.
 */

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUserInfo")
    public String getUserInfo(){
        return "yao yao , this is new brance";
    }


}
