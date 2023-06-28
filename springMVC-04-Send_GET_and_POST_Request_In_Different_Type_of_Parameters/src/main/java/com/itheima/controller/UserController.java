package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Name;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-27 18:50
 */
@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String UserName, int age){
        System.out.println("passing regular parameters name ===> " + UserName);
        System.out.println("passing regular parameters age ===> " + age);
        return "{'module'：'commonParam'}";
    }


    //POJO parameter
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("passing pojo parameters user ===> " + user);
        return "{'module'：'commonParam'}";
    }


    //nested POJO parameter
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("passing the nested pojo with pojo parameters user ===> " + user);
        return "{'module'：'commonParam'}";
    }


    // array parameters
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("passing the array parameters likes ===> " + Arrays.toString(likes));
        return "{'module'：'commonParam'}";
    }



    // collection parameters
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("passing the collection parameters likes ===> " + likes);
        return "{'module'：'commonParam'}";
    }


    // collection parameters: JSON format
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("passing the common json parameters list ===> " + likes);
        return "{'module'：'list common json Param'}";
    }



    // pojo parameters: JSON format
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("passing the pojo json parameters list ===> " + user);
        return "{'module'：'pojo json Param'}";
    }

    // pojo parameters within collection: JSON format
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("passing the list of pojo json parameters list ===> " + list);
        return "{'module'：'list pojo for json Param'}";
    }


    //date parameter
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("passing the date parameter date ===> " + date);
        System.out.println("passing the date parameter date1(yyyy-MM-dd) ===> " + date1);
        System.out.println("passing the date parameter date2(yyyy/MM/dd HH:mm:ss) ===> " + date2);
        return "{'module'：'date Param'}";
    }













}

