package com.mumu.raft.protocol.rpc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023-04-07
 */
@Setter
@Getter
@ToString
public class AppendEntriesResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 被请求方的任期号，用于领导人去更新自己 */
    long term;

    /** folleower包含了前一条日志 即通过一致性检查才为真 */
    boolean success;

    public AppendEntriesResponse(long term) {
        this.term = term;
    }

    public AppendEntriesResponse(boolean success) {
        this.success = success;
    }

    public AppendEntriesResponse(long term, boolean success) {
        this.term = term;
        this.success = success;
    }

    private AppendEntriesResponse(Builder builder) {
        setTerm(builder.term);
        setSuccess(builder.success);
    }

    public static AppendEntriesResponse fail() {
        return new AppendEntriesResponse(false);
    }

    public static AppendEntriesResponse ok() {
        return new AppendEntriesResponse(true);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {

        private long term;
        private boolean success;

        private Builder() {
        }

        public Builder term(long val) {
            term = val;
            return this;
        }

        public Builder success(boolean val) {
            success = val;
            return this;
        }

        public AppendEntriesResponse build() {
            return new AppendEntriesResponse(this);
        }
    }
}
