package com.mumu.raft.protocol.rpc;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.mumu.raft.log.Entry;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023-04-07
 */
@Getter
@Setter
@ToString
@Builder
public class AppendEntriesRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 候选人的任期号  */
    private long term;

    /** 被请求者 ID(ip:selfPort) */
    private String serverId;

    /** 领导者 Id，以便于跟随者重定向请求 */
    private String leaderId;

    /**前一个条目的日志号 */
    private long prevLogIndex;

    /**前一个条目的任期号 */
    private long preLogTerm;

    /** 准备存储的日志条目（表示心跳时为空；一次性发送多个是为了提高效率） */
    private Entry[] entries;

    /** 领导者已经提交的日志的索引值  follower只有在leader提交之后才能提交，即只有小于leadercommit的日志才能提交*/
    private long leaderCommit;

}
