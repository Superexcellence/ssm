package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Proposal;

import java.util.List;
import java.util.Map;

public interface ProposalMapper {
    /**
     * 提案提交
     * @param record
     * @return
     */
    int insert(Proposal record);

    /**
     * 提案号查询
     */
    List<Proposal> queryProposal(Proposal proposal);

    /**
     * 届次查询
     */
    List<Proposal> queryPeriod(Proposal proposal);

    /**
     * 提案查询
     * @param proposal
     * @return
     */
    List<Proposal> queryProposalPager(Proposal proposal);

    /**
     * 删除提案
     * @param proposal
     * @return
     */
    int deleteProposal(Proposal proposal);

    /**
     * 提案修改
     * @param proposal
     * @return
     */
    int updateProposal(Proposal proposal);

    /**
     * 提案审核
     * @param proposal
     * @return
     */
    int updateState(Proposal proposal);

    /**
     * 提案评价
     * @param proposal
     * @return
     */
    int evaluate(Proposal proposal);

    /**
     * 提案统计
     * @param proposal
     * @return
     */
    List<Map<String,Object>> proposalStatistics(Proposal proposal);

    /**
     * 未分类提案统计
     * @param proposal
     * @return
     */
    List<String> unclassified(Proposal proposal);

    /**
     * 未审核提案统计
     * @param proposal
     * @return
     */
    List<String> unaudited(Proposal proposal);

    /**
     * 提案类型统计
     * @param proposal
     * @return
     */
    List<String> proposalType(Proposal proposal);

    /**
     * 提案件数
     * @param proposal
     * @return
     */
    String count(Proposal proposal);
}