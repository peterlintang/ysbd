package com.umeng.socialize.view;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import com.umeng.socialize.view.map.UItemizedOverlay;
import com.umeng.socom.net.p;
import java.util.List;

public class CommentDetail
  extends MapActivity
{
  private UMComment comment;
  private MapView map;
  private Button titleLeftBt;
  private TextView titleMidTv;
  private Button titleRightBt;
  
  private void initCommentInfo()
  {
    View localView = findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item"));
    localView.setBackgroundDrawable(null);
    TextView localTextView1 = (TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_name"));
    TextView localTextView2 = (TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_content"));
    ImageView localImageView = (ImageView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_avatar"));
    int i = b.a(this, b.a.c, "umeng_socialize_default_avatar");
    if (!TextUtils.isEmpty(this.comment.user_icon)) {
      p.a(this, localImageView, this.comment.user_icon, false, null, null, SocializeConstants.ROUNDER_ICON);
    }
    for (;;)
    {
      localTextView1.setText(this.comment.uname);
      localTextView2.setText(this.comment.text);
      ((TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_time"))).setText(m.a(this, this.comment.dt));
      localView = localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_has_location"));
      if (this.comment.location != null) {
        break;
      }
      localView.setVisibility(4);
      return;
      localImageView.setImageResource(i);
    }
    localView.setVisibility(0);
  }
  
  private void initMapView(UMLocation paramUMLocation)
  {
    this.map = ((MapView)findViewById(b.a(this, b.a.b, "umeng_socialize_map")));
    List localList = this.map.getOverlays();
    UItemizedOverlay localUItemizedOverlay = new UItemizedOverlay(getResources().getDrawable(b.a(this, b.a.c, "umeng_socialize_location_mark")), this);
    MapController localMapController = this.map.getController();
    if (paramUMLocation != null)
    {
      paramUMLocation = new GeoPoint((int)(paramUMLocation.getLatitude() * 1000000.0D), (int)(paramUMLocation.getLongitude() * 1000000.0D));
      localUItemizedOverlay.addOverlay(new OverlayItem(paramUMLocation, this.comment.uname, null));
      localList.add(localUItemizedOverlay);
      localMapController.setCenter(paramUMLocation);
      localMapController.setZoom(15);
      return;
    }
    localMapController.setZoom(4);
  }
  
  private void initView()
  {
    this.titleLeftBt = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_leftBt")));
    this.titleLeftBt.setOnClickListener(new o(this));
    this.titleRightBt = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_rightBt")));
    this.titleRightBt.setVisibility(8);
    this.titleMidTv = ((TextView)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_middleTv")));
    this.titleMidTv.setText("评论");
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected boolean isRouteDisplayed()
  {
    return false;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(b.a(this, b.a.a, "umeng_socialize_comment_detail"));
    initView();
    this.comment = ((UMComment)getIntent().getExtras().get("Comment"));
    initCommentInfo();
    paramBundle = this.comment.location;
    if ((m.a()) && (paramBundle != null))
    {
      findViewById(b.a(this, b.a.b, "umeng_socialize_map_invisable")).setVisibility(8);
      initMapView(paramBundle);
      return;
    }
    findViewById(b.a(this, b.a.b, "umeng_socialize_map")).setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\CommentDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */