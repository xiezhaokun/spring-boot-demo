package com.example.demo.biz.controller;

import com.example.demo.biz.model.Scores;
import com.example.demo.biz.service.IScoresService;
import com.example.demo.biz.service.Scores2Service;
import com.example.demo.biz.service.ScoresService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiezhaokun
 */
@RestController
@RequestMapping(value = "/score")
public class ScoresController {

    @Resource
    private IScoresService scoresService;

    @Resource
    private Scores2Service scores2Service;

    @PostMapping(value = "/create")
    public Object create(@RequestBody Scores scores) {
        scoresService.create(scores);
        return "success";
    }

    public static void main(String[] args) {
        System.out.println(4 >> 1);
    }
}
