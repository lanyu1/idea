package com.hand.idea.service.impl;

import com.hand.idea.domain.Great;
import com.hand.idea.mapper.GreatMapper;
import com.hand.idea.service.GreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
@Service
public class GreatServiceImpl implements GreatService {

    @Autowired
    private GreatMapper greatMapper;

    @Override
    public Integer delete(Integer id) {
        return greatMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer save(Great great) {
        return greatMapper.insert(great);
    }

    @Override
    public List<Great> selectGreatEidAndUid(Integer eventid, Integer userid) {

             List<Great> great = greatMapper.selectEidAndUid(eventid,userid);
                return  great;
    }
}
