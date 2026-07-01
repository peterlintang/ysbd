package com.umeng.newxp.view.handler;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class UMEWallPromoter
  extends Promoter
  implements Parcelable
{
  public String ad_location;
  public int ismall;
  public int[] pic_resolution;
  public int postfee;
  public double price;
  public double promoterPrice;
  public String res_name = "商品详情";
  public int sell;
  
  protected UMEWallPromoter(Parcel paramParcel)
  {
    super(paramParcel);
    paramParcel = ExchangeConstants.LOG_TAG;
  }
  
  public UMEWallPromoter(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    this.price = paramJSONObject.optDouble("price");
    this.promoterPrice = paramJSONObject.optDouble("promoprice");
    this.ad_location = paramJSONObject.optString("ad_location");
    TextUtils.isEmpty(paramJSONObject.optString("pic_resolution"));
    this.ismall = paramJSONObject.optInt("ismall");
    this.postfee = paramJSONObject.optInt("postfee");
    this.sell = paramJSONObject.optInt("sell");
    paramJSONObject = paramJSONObject.optString("resource_name");
    if (!TextUtils.isEmpty(paramJSONObject)) {
      this.res_name = paramJSONObject;
    }
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = super.toJson();
    try
    {
      localJSONObject.put("price", this.price);
      localJSONObject.put("promoprice", this.promoterPrice);
      localJSONObject.put("ad_location", this.ad_location);
      localJSONObject.put("ismall", this.ismall);
      localJSONObject.put("postfee", this.postfee);
      localJSONObject.put("sell", this.sell);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel = ExchangeConstants.LOG_TAG;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\UMEWallPromoter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */