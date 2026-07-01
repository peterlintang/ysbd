package com.umeng.update;

import com.umeng.common.net.l;
import org.json.JSONObject;

public class UpdateResponse
  extends l
{
  public boolean hasUpdate = false;
  public String path;
  public String updateLog = null;
  public String version = null;
  
  public UpdateResponse(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    try
    {
      if (paramJSONObject.has("update"))
      {
        if (paramJSONObject.getString("update").toLowerCase().equals("no")) {
          return;
        }
        this.updateLog = paramJSONObject.getString("update_log");
        this.version = paramJSONObject.getString("version");
        this.path = paramJSONObject.getString("path");
        this.hasUpdate = true;
        return;
      }
    }
    catch (Exception paramJSONObject) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\UpdateResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */