package com.mj147.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MsgSource {
    public final ConstErrorMsg ERR001;
    public final ConstErrorMsg ERR002;
    public final ConstErrorMsg ERR003;
    public final ConstErrorMsg ERR004;
    public final ConstErrorMsg ERR005;
    public final ConstErrorMsg ERR006;
    public final ConstErrorMsg ERR007;

    public MsgSource(@Value("${common.const.error.msg.err001}") String err001MsgValue,
                     @Value("${common.const.error.msg.err002}") String err002MsgValue,
                     @Value("${common.const.error.msg.err003}") String err003MsgValue,
                     @Value("${common.const.error.msg.err004}") String err004MsgValue,
                     @Value("${common.const.error.msg.err005}") String err005MsgValue,
                     @Value("${common.const.error.msg.err006}") String err006MsgValue,
                     @Value("${common.const.error.msg.err007}") String err007MsgValue
    ) {
        ERR001 = new ConstErrorMsg("ERR001", err001MsgValue);
        ERR002 = new ConstErrorMsg("ERR002", err002MsgValue);
        ERR003 = new ConstErrorMsg("ERR003", err003MsgValue);
        ERR004 = new ConstErrorMsg("ERR004", err004MsgValue);
        ERR005 = new ConstErrorMsg("ERR005", err005MsgValue);
        ERR006 = new ConstErrorMsg("ERR006", err006MsgValue);
        ERR007 = new ConstErrorMsg("ERR007", err007MsgValue);
    }
}
