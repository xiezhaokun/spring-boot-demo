package com.example.demo.biz.service;

import com.example.demo.biz.mapper.ScoresMapper;
import com.example.demo.biz.model.Scores;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author xiezhaokun
 */
@Service
public class ScoresService implements IScoresService{

    @Resource
    private ScoresMapper scoresMapper;

    /**
     *
     * @param scores
     */
    @Override
    //@Transactional(rollbackFor = Exception.class)
    public void create(Scores scores) {
        scoresMapper.insert(scores);
        update(scores);
        throw new NullPointerException("dddddddd");
    }

    @Override
    //@Transactional(rollbackFor = Exception.class)
    public void update(Scores scores) {
        scores.setId(1234);
        scores.setScore(new BigDecimal(111111));
        scoresMapper.insert(scores);
    }
}
