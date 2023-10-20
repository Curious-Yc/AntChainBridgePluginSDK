package org.bcdns.credential.dto.resp;

import lombok.Data;

@Data
public class IssuerApplyStepRespDto {


    private String issuerBid;
    private String stepIndex;
    private String applyNo;
    private String issuerName;
    private long applyTime;
    private long auditTime;
    private String applyResult;

    private String reason;

}
