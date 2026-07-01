package com.umeng.common.ufp.net;

import org.json.JSONObject;

public class ReportResponse
  extends j
{
  public ReportResponse.STATUS a;
  
  public ReportResponse(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    if (("ok".equalsIgnoreCase(paramJSONObject.optString("status"))) || ("ok".equalsIgnoreCase(paramJSONObject.optString("success"))))
    {
      this.a = ReportResponse.STATUS.SUCCESS;
      return;
    }
    this.a = ReportResponse.STATUS.FAIL;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\ReportResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */