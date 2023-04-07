package com.mumu.raft.protocol.rpc;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023-04-07
 */
@Getter
@Setter
public class VoteResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前任期号，以便于候选人去更新自己的任期
     */
    long term;

    /**
     * 候选人赢得了此张选票时为真
     */
    boolean voteGranted;

    public VoteResponse(boolean voteGranted) {
        this.voteGranted = voteGranted;
    }

    private VoteResponse(Builder builder) {
        setTerm(builder.term);
        setVoteGranted(builder.voteGranted);
    }

    public static VoteResponse fail() {
        return new VoteResponse(false);
    }

    public static VoteResponse ok() {
        return new VoteResponse(true);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {

        private long term;
        private boolean voteGranted;

        private Builder() {
        }

        public Builder term(long term) {
            this.term = term;
            return this;
        }

        public Builder voteGranted(boolean voteGranted) {
            this.voteGranted = voteGranted;
            return this;
        }

        public VoteResponse build() {
            return new VoteResponse(this);
        }
    }
}
