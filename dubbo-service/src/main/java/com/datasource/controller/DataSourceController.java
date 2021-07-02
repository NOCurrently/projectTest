package com.datasource.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@Slf4j
public class DataSourceController {


    @RequestMapping(value = "/xc", method = RequestMethod.POST)
    public Map<String,Object> insertDataSource(@RequestBody Map<String,Object> dataSource) {
        System.out.println(dataSource);
        Map<String,Object> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : dataSource.entrySet()) {
            map.put(entry.getKey()+"xc",entry.getValue()+"xc");
        }
        System.out.println(map);
        return map;
    }
}
