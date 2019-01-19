package com.zking.ssmProject.controller;

import com.zking.ssmProject.model.Proposal;
import com.zking.ssmProject.service.IProposalService;
import com.zking.ssmProject.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProposalController {

    @Autowired
    private IProposalService proposalService;

    @RequestMapping("/submit")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    public Map<String,Object> submit(Proposal proposal){
        int insert = proposalService.insert(proposal);
        Map<String,Object> map=new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","提交成功");
        }
        return map;
    }

    @RequestMapping("/queryProposal")
    @Transactional(readOnly = true)
    @ResponseBody
    public boolean queryProposal(Proposal proposal){
        List<Proposal> proposals =
                proposalService.queryProposal(proposal);
        if(0!=proposals.size()&&null!=proposals){
            return true;
        }
        return  false;
    }

    @RequestMapping("/queryPeriod")
    @Transactional(readOnly = true)
    @ResponseBody
    public List<Proposal> queryPeriod(Proposal proposal){
        List<Proposal> proposals = proposalService.queryPeriod(proposal);
        return proposals;
    }

    @RequestMapping("/queryProposalPager")
    @Transactional(readOnly = true)
    @ResponseBody
    public Map<String,Object> queryProposalPager(Proposal proposal, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        List<Proposal> proposals = proposalService.queryProposalPager(proposal, pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageBean.getTotal());
        map.put("data", proposals);
        return map;
    }

    @RequestMapping("/deleteProposal")
    @Transactional
    @ResponseBody
    public Map<String,Object> deleteProposal(Proposal proposal){
        int i = proposalService.deleteProposal(proposal);
        Map<String,Object> map=new HashMap<>();
        if(i>0){
            map.put("success", true);
            map.put("message", "删除成功");
        }
        return map;
    }

    @RequestMapping("/updateProposal")
    @Transactional()
    @ResponseBody
    public Map<String,Object> updateProposal(Proposal proposal){
        int insert = proposalService.updateProposal(proposal);
        Map<String,Object> map=new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","提交成功");
        }
        return map;
    }

    @RequestMapping("/updateState")
    @Transactional()
    @ResponseBody
    public Map<String,Object> updateState(Proposal proposal){
        int insert = proposalService.updateState(proposal);
        Map<String,Object> map=new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","已审核");
        }
        return map;
    }

    @RequestMapping("/evaluate")
    @Transactional()
    @ResponseBody
    public Map<String,Object> evaluate(Proposal proposal){
        int insert = proposalService.evaluate(proposal);
        Map<String,Object> map=new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","已评价");
        }
        return map;
    }


    @RequestMapping("/Statistics")
    @Transactional(readOnly = true)
    @ResponseBody
    public Map<String,Object> proposalStatistics (Proposal proposal){
        List<Map<String, Object>> proposalStatistics = proposalService.proposalStatistics(proposal);
        List x=new ArrayList<>();
        List data=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        for (Map<String, Object> proposalStatistic : proposalStatistics) {
            x.add(proposalStatistic.get("procategory"));
            data.add(proposalStatistic.get("COUNT"));
        }
        map.put("x",x);
        map.put("data",data);
        return map;
    }

    @RequestMapping("/unclassified")
    @Transactional(readOnly = true)
    @ResponseBody
    public String unclassified (Proposal proposal){
        List<String> unclassified = proposalService.unclassified(proposal);
        return unclassified.get(0);
    }

    @RequestMapping("/unaudited")
    @Transactional(readOnly = true)
    @ResponseBody
    public String unaudited (Proposal proposal){
        List<String> unaudited = proposalService.unaudited(proposal);
        return unaudited.get(0);
    }

    @RequestMapping("/count")
    @Transactional(readOnly = true)
    @ResponseBody
    public String count (Proposal proposal){
        String count = proposalService.count(proposal);
        return count;
    }
}
