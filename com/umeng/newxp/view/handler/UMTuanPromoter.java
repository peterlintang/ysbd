package com.umeng.newxp.view.handler;

import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class UMTuanPromoter
  extends Promoter
  implements Parcelable
{
  public boolean isNeedOrder;
  public String location = "";
  public int points;
  public double price;
  public double promoterPrice;
  public String publisher;
  public int sell;
  
  private UMTuanPromoter() {}
  
  protected UMTuanPromoter(Parcel paramParcel)
  {
    super(paramParcel);
    paramParcel = ExchangeConstants.LOG_TAG;
  }
  
  public UMTuanPromoter(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    this.price = paramJSONObject.optDouble("price");
    this.promoterPrice = paramJSONObject.optDouble("promoprice");
    this.publisher = paramJSONObject.optString("resource_name");
    this.sell = paramJSONObject.optInt("sell");
    this.points = paramJSONObject.optInt("credits");
    this.location = paramJSONObject.optString("ad_location", "");
    if (paramJSONObject.optInt("reservation", 0) == 0) {}
    for (;;)
    {
      this.isNeedOrder = bool;
      return;
      bool = true;
    }
  }
  
  public static UMTuanPromoter getMock()
  {
    UMTuanPromoter localUMTuanPromoter = new UMTuanPromoter();
    localUMTuanPromoter.price = 5888.0D;
    localUMTuanPromoter.promoterPrice = 998.0D;
    localUMTuanPromoter.isNeedOrder = false;
    localUMTuanPromoter.sell = 305327;
    localUMTuanPromoter.points = 1000;
    localUMTuanPromoter.location = "南京东路";
    localUMTuanPromoter.title = "[全国]至尊无敌超级千足金佛像";
    localUMTuanPromoter.img = "http://cdn0.mobmore.com/public/uploads/icon/519c99b545ce7f21f2f63675.png";
    localUMTuanPromoter.publisher = "美团网";
    return localUMTuanPromoter;
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = super.toJson();
    try
    {
      localJSONObject.put("price", this.price);
      localJSONObject.put("promoprice", this.promoterPrice);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\UMTuanPromoter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */