package com.umeng.newxp.common;

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
  public static boolean DETAIL_PAGE = false;
  public static int DRAWER_LIST_COUNT_VERTICAL = 0;
  public static boolean IGNORE_SERVER_INTERVAL = false;
  public static String LOG_TAG;
  public static boolean ONLY_CHINESE = false;
  public static int PRELOAD_REPEAT_COUNT = 0;
  public static int REFRESH_INTERVAL = 0;
  public static boolean RICH_NOTIFICATION = false;
  public static boolean ROUND_ICON = false;
  public static boolean TIPS_DOWNLOAD = false;
  public static boolean USE_SCROLL_VIEW_LANDSCAPE = true;
  public static boolean USE_SIMPLE_DIALOG = false;
  public static String WEB_CACHE_NAME;
  public static boolean WELCOME_COUNTDOWN = false;
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
  public static String sdk_version = "6.6.20131129";
  public static boolean show_size = false;
  public static String text_color;
  public static final int type_big_handler_bottom = 0;
  public static final int type_big_handler_top = 1;
  public static final int type_cloud_full = 12;
  public static final int type_container = 8;
  public static final int type_credits_wall = 10;
  public static final int type_feed_stream = 12;
  public static final int type_float_dialog = 15;
  public static final int type_grid_view_bottom = 41;
  public static final int type_grid_view_top = 42;
  public static final int type_hypertextlink_banner = 13;
  public static final int type_large_image = 43;
  public static final int type_list_curtain = 7;
  public static final int type_pearl_curtain = 9;
  public static final int type_scroll_view_bottom = 10;
  public static final int type_small_handler_list_bottom = 4;
  public static final int type_small_handler_list_top = 5;
  public static final int type_standalone_handler = 6;
  public static final int type_suppose = 16;
  public static final int type_wap_style = 501;
  public static final int type_welcome_image = 9;
  
  static
  {
    DEBUG_MODE = false;
    PRELOAD_REPEAT_COUNT = 1;
    APPKEY = "";
    CHANNEL = null;
    banben = "版本：";
    text_color = "#000000";
    banner_alpha = 255;
    TIPS_DOWNLOAD = false;
    BASE_URL_LIST = new String[] { "http://ex.puata.info", "http://ex.umengcloud.com", "http://ex.mobmore.com" };
    CONTAINER_AUTOEXPANDED = true;
    CONTAINER_HEIGHT = 55;
    WELCOME_COUNTDOWN = true;
    CONTAINER_LIST_COUNT = 7;
    CURTAIN_LIST_COUNT_HORIZEN = 4;
    CURTAIN_PEARL_COUNT_HORIZEN = 2;
    CURTAIN_PEARL_COUNT_VERTICAL = 3;
    DETAIL_PAGE = true;
    DATA_CACHE_TIME = 900;
    DATA_COMPRESS = false;
    DRAWER_LIST_COUNT_VERTICAL = 4;
    full_screen = false;
    handler_auto_expand = true;
    handler_left = true;
    has_banner = false;
    WEB_CACHE_NAME = "/download/.web_cache/";
    LOG_TAG = "com.umeng.exchange";
    no = "否";
    ONLY_CHINESE = false;
    protocol_version = "1";
    ROUND_ICON = true;
    REFRESH_INTERVAL = 30000;
    IGNORE_SERVER_INTERVAL = false;
    RICH_NOTIFICATION = true;
    show_size = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\ExchangeConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */