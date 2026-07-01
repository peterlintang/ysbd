package com.umeng.socialize.view.map;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;
import java.util.ArrayList;
import java.util.List;

public class UItemizedOverlay
  extends ItemizedOverlay<OverlayItem>
{
  private Context context;
  private List<OverlayItem> mOverlays = new ArrayList();
  
  public UItemizedOverlay(Drawable paramDrawable, Context paramContext)
  {
    super(boundCenterBottom(paramDrawable));
    this.context = paramContext;
  }
  
  public void addOverlay(OverlayItem paramOverlayItem)
  {
    this.mOverlays.add(paramOverlayItem);
    populate();
  }
  
  protected OverlayItem createItem(int paramInt)
  {
    return (OverlayItem)this.mOverlays.get(paramInt);
  }
  
  protected boolean onTap(int paramInt)
  {
    this.mOverlays.get(paramInt);
    return true;
  }
  
  public int size()
  {
    return this.mOverlays.size();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\map\UItemizedOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */