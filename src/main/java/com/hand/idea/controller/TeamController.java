package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.hand.idea.domain.*;
import com.hand.idea.mapper.TeamMapper;
import com.hand.idea.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
@CrossOrigin
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;
    @Autowired
    private TeamMapper teamMapper;

    private RequestData requestData = new RequestData();


    @RequestMapping(value = "/selectTeam",method = RequestMethod.GET)
    public Team selectTeam(@RequestParam("id") Integer id){
        return teamService.selectTeam(id);
    }

    @RequestMapping(value = "/getTeams",method = RequestMethod.GET)
    public List<Team> getTeams(){
        return teamService.getTeams();
    }

    @RequestMapping(value = "/selectTeamList",method = RequestMethod.GET)
    public List<Team> selectTeamWithCollection(@RequestParam("founderid") Integer founderid,
                                               @RequestParam("eventid") Integer eventid){
        return teamService.selectTeamWithCollection(founderid,eventid);
    }

    @RequestMapping(value = "/selectScheduleList",method = RequestMethod.GET)
    public List<Team> selectScheduleList(@RequestParam("eventid") Integer eventid){
        return teamService.selectScheduleList(eventid);
    }
    @RequestMapping(value = "/selectTeammateList",method = RequestMethod.GET)
    public List<Teammate> selectTeammateList(@RequestParam("teamid") Integer teamid){
        return teamService.selectTeammateList(teamid);
    }
    @RequestMapping(value = "/selectQuestionList",method = RequestMethod.GET)
    public PageInfo<Question> selectQuestionList(@RequestParam(value="teamid",required = false) Integer teamid,
                                                 @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                                 @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize){

        PageInfo<Question> pageInfo = teamService.selectQuestionList(teamid, page, pageSize);
        return pageInfo;
    }

    @RequestMapping(value = "/selectTeamListByLike",method = RequestMethod.GET)
    public PageInfo<Team> selectTeamListByLike(@RequestParam(value="searchContent",required = false) String searchContent,
                                               @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                               @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize){

            PageInfo<Team> pageInfo = teamService.selectTeamList(searchContent, page, pageSize);
            return pageInfo;
    }
    @RequestMapping(value = "/addTeam",method = RequestMethod.POST)
    public String addTeam(@RequestBody Team team){
        teamService.addTeam(team);
        requestData.setMessage("添加成功");
        return new Gson().toJson(requestData);
    }


    @RequestMapping(value = "/deleteTeam",method = RequestMethod.DELETE)
    public String deleteTeam(@RequestParam("id") Integer id){
        teamService.deleteTeam(id);
        requestData.setMessage("删除成功");
        return new Gson().toJson(requestData);
    }


    @RequestMapping(value = "/updateTeam",method = RequestMethod.PUT)
    public String updateTeam(@RequestBody Team team){
        teamService.updateTeam(team);
        requestData.setMessage("修改成功");
        return new Gson().toJson(requestData);
    }

}
