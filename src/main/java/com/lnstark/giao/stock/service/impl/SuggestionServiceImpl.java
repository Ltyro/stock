package com.lnstark.giao.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnstark.giao.stock.entity.po.Suggestion;
import com.lnstark.giao.stock.mapper.SuggestionMapper;
import com.lnstark.giao.stock.service.SuggestionService;

/**
 * by Lnstark
 * 2020/10/31
 */
@Service
@Transactional
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionMapper mapper;


    @Override
    public int save(Suggestion bean) {
        return mapper.insert(bean);
    }
}
