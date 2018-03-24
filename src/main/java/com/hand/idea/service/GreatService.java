package com.hand.idea.service;

import com.hand.idea.domain.Great;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
public interface GreatService {

    public Integer delete(Integer id);

    public Integer save(Great great);

    public List<Great> selectGreatEidAndUid(Integer eventid,Integer userid);
}
