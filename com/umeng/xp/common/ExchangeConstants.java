package com.umeng.xp.common;

public class ExchangeConstants
{
  public static final int ANIM_3D_X = 7;
  public static final int ANIM_3D_Y = 8;
  public static final int ANIM_SCALE = 6;
  public static final int ANIM_SLIDE_DOWN = 4;
  public static final int ANIM_SLIDE_LEFT = 1;
  public static final int ANIM_SLIDE_RIGHT = 2;
  public static final int ANIM_SLIDE_UP = 3;
  public static String APPKEY;
  public static String[] BASE_URL_LIST;
  public static String CHANNEL;
  public static boolean CONTAINER_AUTOEXPANDED = false;
  public static int CONTAINER_HEIGHT = 0;
  public static int CONTAINER_LIST_COUNT = 0;
  public static int CURTAIN_LIST_COUNT_HORIZEN = 0;
  public static int CURTAIN_PEARL_COUNT_HORIZEN = 0;
  public static int CURTAIN_PEARL_COUNT_VERTICAL = 0;
  public static int DATA_CACHE_TIME = 0;
  public static boolean DATA_COMPRESS = false;
  public static boolean DEBUG_MODE = false;
  public static int DRAWER_LIST_COUNT_VERTICAL = 0;
  public static boolean IGNORE_SERVER_INTERVAL = false;
  public static String LOG_TAG;
  public static boolean ONLY_CHINESE = false;
  public static int REFRESH_INTERVAL = 0;
  public static boolean USE_SCROLL_VIEW_LANDSCAPE = true;
  public static boolean USE_SIMPLE_DIALOG = false;
  public static final String WAP_URL = "http://ex.mobmore.com/api/wap?";
  public static String WEB_CACHE_NAME;
  private static final int a = 5;
  private static final int b = 9;
  public static String banben;
  public static int banner_alpha = 0;
  public static boolean full_screen = false;
  public static boolean handler_auto_expand = false;
  public static boolean handler_left = false;
  public static boolean has_banner = false;
  public static String no;
  public static String protocol_version;
  public static String sdk_version;
  public static String sdk_version_name;
  public static boolean show_price = false;
  public static boolean show_size = false;
  public static String text_color;
  public static final int type_big_handler_bottom = 0;
  public static final int type_big_handler_top = 1;
  public static final int type_cloud_full = 12;
  public static final int type_container = 8;
  public static final int type_float_dialog = 15;
  public static final int type_grid_view_bottom = 41;
  public static final int type_grid_view_top = 42;
  public static final int type_hypertextlink_banner = 13;
  public static final int type_image_entry = 11;
  public static final int type_large_image = 43;
  public static final int type_list_curtain = 7;
  public static final int type_partners_banner = 11;
  public static final int type_pearl_curtain = 9;
  public static final int type_scroll_view_bottom = 10;
  public static final int type_small_handler_list_bottom = 4;
  public static final int type_small_handler_list_top = 5;
  public static final int type_standalone_handler = 6;
  public static final int type_wap_style = 501;
  
  static
  {
    APPKEY = "";
    CHANNEL = null;
    banben = "版本：";
    text_color = "#000000";
    banner_alpha = 255;
    BASE_URL_LIST = new String[] { "http://ex.puata.info", "http://ex.umengcloud.com", "http://ex.mobmore.com" };
    CONTAINER_AUTOEXPANDED = true;
    CONTAINER_HEIGHT = 55;
    CONTAINER_LIST_COUNT = 7;
    CURTAIN_LIST_COUNT_HORIZEN = 4;
    CURTAIN_PEARL_COUNT_HORIZEN = 2;
    CURTAIN_PEARL_COUNT_VERTICAL = 3;
    DATA_CACHE_TIME = 900;
    DATA_COMPRESS = false;
    DRAWER_LIST_COUNT_VERTICAL = 4;
    full_screen = false;
    handler_auto_expand = true;
    handler_left = true;
    has_banner = false;
    WEB_CACHE_NAME = "/download/.web_cache/";
    LOG_TAG = "exchange";
    no = "否";
    ONLY_CHINESE = true;
    protocol_version = "1";
    REFRESH_INTERVAL = 30000;
    IGNORE_SERVER_INTERVAL = false;
    sdk_version = "5.3.20120822";
    sdk_version_name = "1";
    show_price = true;
    show_size = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\ExchangeConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */