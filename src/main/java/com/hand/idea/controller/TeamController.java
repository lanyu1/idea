package com.hand.idea.controller;

import com.google.gson.Gson;
import com.hand.idea.domain.RequestData;
import com.hand.idea.domain.Team;
import com.hand.idea.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
@CrossOrigin
@RestController
@RequestMapping("team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    private RequestData requestData = new RequestData();


    @RequestMapping(value = "/selectTeam",method = RequestMethod.GET)
    public Team selectTeam(@RequestParam("id") Integer id){
        return teamService.selectTeam(id);
    }

    @RequestMapping(value = "/selectTeamList",method = RequestMethod.GET)
    public List<Team> selectTeamWithCollection(@RequestParam("id") Integer id){
        return teamService.selectTeamWithCollection(id);
    }

    @RequestMapping(value = "/addTeam",method = RequestMethod.POST)
    public String addTeam(@RequestBody Team team){
        teamService.addTeam(team);
        requestData.setMessage("添加成功");
        return new Gson().toJson(requestData);
    }


    @RequestMapping(value = "/deleteTeam/{id}",method = RequestMethod.GET)
    public String deleteTeam(@PathVariable("id") Integer id){
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
