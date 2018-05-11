package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Team;
import com.hand.idea.domain.Teammate;
import com.hand.idea.service.TeammateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuLan on 2018/3/25.
 */
@CrossOrigin
@RestController
@RequestMapping("/teammate")
public class TeammateController {

    @Autowired
    private TeammateService teammateService;

    @RequestMapping(value = "/selectTeammate",method = RequestMethod.GET)
    public Teammate selectTeammate(@RequestParam("id") Integer id){
        return teammateService.selectTeammate(id);
    }

    @RequestMapping(value = "/selectTeamLeader",method = RequestMethod.GET)
    public Teammate selectTeamLeader(@RequestParam("teamid") Integer teamid){
        return teammateService.selectTeamLeader(teamid);
    }

    @RequestMapping(value = "/addTeammate",method = RequestMethod.POST)
    public String addTeammate(@RequestBody Teammate teammate){
        teammateService.addTeammate(teammate);
        return "插入成功";
    }


    @RequestMapping(value = "/deleteTeammate",method = RequestMethod.DELETE)
    public String deleteTeammate(@RequestParam("id") Integer id){
        teammateService.deleteTeammate(id);
        return "删除成功";
    }


    @RequestMapping(value = "/updateTeammate",method = RequestMethod.PUT)
    public String updateTeammate(@RequestBody Teammate teammate){
        teammateService.updateTeammate(teammate);
        return "修改成功";
    }

    @RequestMapping(value = "/selectTeamList",method = RequestMethod.GET)
    public PageInfo<Teammate> selectTeammateList(@RequestParam(value="searchContent",required = false) String searchContent,
                                               @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                               @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize){

        PageInfo<Teammate> pageInfo = teammateService.selectTeammateList(searchContent, page, pageSize);
        return pageInfo;
    }
}
