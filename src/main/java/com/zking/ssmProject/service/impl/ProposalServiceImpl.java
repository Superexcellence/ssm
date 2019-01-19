package com.zking.ssmProject.service.impl;

import com.zking.ssmProject.mapper.ProposalMapper;
import com.zking.ssmProject.model.Proposal;
import com.zking.ssmProject.service.IProposalService;
import com.zking.ssmProject.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProposalServiceImpl implements IProposalService {

    @Autowired
    private ProposalMapper proposalMapper;

    @Override
    public int insert(Proposal record) {
        return proposalMapper.insert(record);
    }

    @Override
    public List<Proposal> queryProposal(Proposal proposal) {
        return proposalMapper.queryProposal(proposal);
    }

    @Override
    public List<Proposal> queryPeriod(Proposal proposal) {
        return proposalMapper.queryPeriod(proposal);
    }

    @Override
    public List<Proposal> queryProposalPager(Proposal proposal, PageBean pageBean) {
        return proposalMapper.queryProposalPager(proposal);
    }

    @Override
    public int deleteProposal(Proposal proposal) {
        return proposalMapper.deleteProposal(proposal);
    }

    @Override
    public int updateProposal(Proposal proposal) {
        return proposalMapper.updateProposal(proposal);
    }

    @Override
    public int updateState(Proposal proposal) {
        return proposalMapper.updateState(proposal);
    }

    @Override
    public int evaluate(Proposal proposal) {
        return proposalMapper.evaluate(proposal);
    }

    @Override
    public List<Map<String, Object>> proposalStatistics(Proposal proposal) {
        return proposalMapper.proposalStatistics(proposal);
    }

    @Override
    public List<String> unclassified(Proposal proposal) {
        return proposalMapper.unclassified(proposal);
    }

    @Override
    public List<String> unaudited(Proposal proposal) {
        return proposalMapper.unaudited(proposal);
    }

    @Override
    public List<String> proposalType(Proposal proposal) {
        return proposalMapper.proposalType(proposal);
    }

    @Override
    public String count(Proposal proposal) {
        return proposalMapper.count(proposal);
    }


}
