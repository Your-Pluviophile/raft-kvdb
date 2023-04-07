package com.mumu.raft.protocol.rpc;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023-04-07
 */
@Getter
@Setter
@Builder
@Data
public class VoteRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 候选人的任期号  */
    private long term;

    /** 选民ID(ip:selfPort) */
    private String peerAddr;

    /** 候选人Id(ip:selfPort) */
    private String candidateAddr;

    /** 候选人最新的日志条目的索引值 */
    private long lastLogIndex;

    /** 候选人最新的日志条目的任期号  */
    private long lastLogTerm;
}