package com.umeng.xp;

import android.net.Uri;
import org.json.JSONObject;

public class Promoter
{
  public static final int LANDING_TYPE_BROWSER = 3;
  public static final int LANDING_TYPE_DIRECT_DOWNLOAD = 1;
  public static final int LANDING_TYPE_POPUP = 0;
  public static final int LANDING_TYPE_WAP_WEBVIEW = 4;
  public static final int LANDING_TYPE_WEBVIEW = 2;
  public static final int REPORT_CLICK_TO_LAUNCH = 4;
  public static final int REPORT_CLICK_TO_LAUNCH_DETAIL_PAGE = 5;
  public static final int REPORT_CLICK_TO_PROMOTE = 2;
  public static final int REPORT_DOWNLOAD = 1;
  public static final int REPORT_DOWNLOAD_CLICK = 3;
  public static final int REPORT_DOWNLOAD_CLICK_DIRECT = 7;
  public static final int REPORT_FILTERED = -1;
  public static final int REPORT_IMPRESSION = 0;
  public String ad_words;
  public int anim_in;
  public String app_package_name = "";
  public int app_version_code;
  public String app_version_name;
  public double bid;
  public int category;
  public int content_type;
  public String description;
  public int display_type;
  public String icon;
  public String img;
  public int landing_type;
  public int new_tip = 0;
  public String price;
  public String promoter;
  public String provider;
  public long size;
  public String text_color;
  public String text_font;
  public String text_size;
  public String title;
  public String url;
  public String url_in_app;
  
  public static Promoter buildMockPromoter()
  {
    return new Promoter();
  }
  
  public static Promoter getPromoterFromJson(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    Promoter localPromoter = new Promoter();
    localPromoter.promoter = paramJSONObject.optString("promoter", "");
    localPromoter.category = paramJSONObject.optInt("category", 0);
    localPromoter.content_type = paramJSONObject.optInt("content_type");
    localPromoter.display_type = paramJSONObject.optInt("display_type", 0);
    String str1 = paramJSONObject.optString("img", "");
    label204:
    String str2;
    if (com.umeng.common.b.g.d(str1) == true)
    {
      localPromoter.img = str1;
      localPromoter.anim_in = paramJSONObject.optInt("anim_in", 0);
      localPromoter.landing_type = paramJSONObject.optInt("landing_type", 0);
      localPromoter.text_size = paramJSONObject.optString("text_size", "");
      localPromoter.text_color = paramJSONObject.optString("text_color");
      localPromoter.text_font = paramJSONObject.optString("text_font");
      localPromoter.title = paramJSONObject.optString("title", "");
      localPromoter.provider = paramJSONObject.optString("provider", "");
      localPromoter.ad_words = paramJSONObject.optString("ad_words", "");
      localPromoter.description = paramJSONObject.optString("description", "");
      str1 = paramJSONObject.optString("icon", "");
      if (com.umeng.common.b.g.d(str1) != true) {
        break label355;
      }
      localPromoter.icon = str1;
      str1 = paramJSONObject.optString("url", "");
      str2 = Uri.parse(str1).getScheme();
      if (com.umeng.common.b.g.d(str1) != true) {
        break label384;
      }
      localPromoter.url = str1;
    }
    for (;;)
    {
      localPromoter.new_tip = paramJSONObject.optInt("new", 0);
      localPromoter.app_version_code = paramJSONObject.optInt("app_version_code", 0);
      localPromoter.url_in_app = paramJSONObject.optString("url_in_app");
      localPromoter.size = paramJSONObject.optLong("size", 0L);
      localPromoter.app_package_name = paramJSONObject.optString("app_package_name", "");
      localPromoter.app_version_name = paramJSONObject.optString("app_version_name", "");
      localPromoter.price = paramJSONObject.optString("price", "");
      localPromoter.bid = paramJSONObject.optDouble("bid", 0.0D);
      return localPromoter;
      localPromoter.img = (com.umeng.xp.common.ExchangeConstants.BASE_URL_LIST[0] + str1);
      break;
      label355:
      localPromoter.icon = (com.umeng.xp.common.ExchangeConstants.BASE_URL_LIST[0] + str1);
      break label204;
      label384:
      if ((str2 != null) && (com.umeng.xp.common.g.a(str2, true, Promoter.a.a()))) {
        localPromoter.url = str1;
      } else {
        localPromoter.url = (com.umeng.xp.common.ExchangeConstants.BASE_URL_LIST[0] + str1);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\Promoter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */