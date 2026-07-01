package com.umeng.xp.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.common.b.g;
import com.umeng.xp.Promoter;
import com.umeng.xp.a.a;
import com.umeng.xp.a.c;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.AdapterListener;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import java.util.List;

class EmbededContainer$a
{
  private ListView b;
  private d c;
  private View d;
  private TextView e;
  private ImageView f;
  
  public EmbededContainer$a(EmbededContainer paramEmbededContainer, ListView paramListView, XpListenersCenter.AdapterListener paramAdapterListener)
  {
    this.b = paramListView;
    a();
    EmbededContainer.a(paramEmbededContainer).timeLine[2] = System.currentTimeMillis();
    this.d.setVisibility(0);
    EmbededContainer.b(paramEmbededContainer).addFooterView(this.d);
    this.c = new s(this, EmbededContainer.b(paramEmbededContainer), EmbededContainer.c(paramEmbededContainer), com.umeng.xp.a.d.p(EmbededContainer.c(paramEmbededContainer)), false, EmbededContainer.d(paramEmbededContainer), 8, EmbededContainer.a(paramEmbededContainer), paramEmbededContainer);
    if (paramAdapterListener != null) {
      this.c.a(paramAdapterListener);
    }
    if (!ExchangeConstants.CONTAINER_AUTOEXPANDED) {
      EmbededContainer.g(paramEmbededContainer);
    }
    paramListView = new EmbededContainer.a.a(this, EmbededContainer.a(paramEmbededContainer));
    if (EmbededContainer.b(paramEmbededContainer) != null)
    {
      EmbededContainer.b(paramEmbededContainer).setOnScrollListener(paramListView);
      EmbededContainer.a(paramEmbededContainer).page_index = 0;
    }
    EmbededContainer.a(paramEmbededContainer).timeLine[3] = System.currentTimeMillis();
    paramListView = new e.a(EmbededContainer.c(paramEmbededContainer)).a(0).b(0).c(EmbededContainer.a(paramEmbededContainer).getTimeConsuming()).d(EmbededContainer.h(paramEmbededContainer)).c(paramEmbededContainer.mType).a((Promoter[])EmbededContainer.d(paramEmbededContainer).toArray(new Promoter[0])).a(EmbededContainer.a(paramEmbededContainer).slot_id).b(EmbededContainer.a(paramEmbededContainer).sessionId).a();
    new XpReportClient(EmbededContainer.c(paramEmbededContainer)).sendAsync(paramListView, null);
  }
  
  private void a()
  {
    this.d = ((LayoutInflater)EmbededContainer.c(this.a).getSystemService("layout_inflater")).inflate(com.umeng.xp.a.d.q(EmbededContainer.c(this.a)), null);
    this.e = ((TextView)this.d.findViewById(c.I(EmbededContainer.c(this.a))));
    SpannableString localSpannableString = c();
    this.e.setText(localSpannableString);
    this.f = ((ImageView)this.d.findViewById(c.z(EmbededContainer.c(this.a))));
    this.f.setVisibility(8);
    EmbededContainer.a(this.a, AnimationUtils.loadAnimation(EmbededContainer.c(this.a), a.d(EmbededContainer.c(this.a))));
  }
  
  private void b()
  {
    t localt = new t(this);
    EmbededContainer.a(this.a).pagination = true;
    if (EmbededContainer.a(this.a).page_index <= 0) {
      EmbededContainer.a(this.a).page_index = 1;
    }
    ExchangeDataService localExchangeDataService = EmbededContainer.a(this.a);
    localExchangeDataService.page_index += 1;
    EmbededContainer.a(this.a).requestDataAsyn(EmbededContainer.c(this.a), localt);
  }
  
  private SpannableString c()
  {
    Object localObject = g.a();
    localObject = new SpannableString("更新于:     " + (String)localObject);
    ((SpannableString)localObject).setSpan(new AbsoluteSizeSpan((int)TypedValue.applyDimension(2, 12.0F, EmbededContainer.c(this.a).getResources().getDisplayMetrics())), 4, ((SpannableString)localObject).length(), 33);
    ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-7829368), 4, ((SpannableString)localObject).length(), 33);
    return (SpannableString)localObject;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\EmbededContainer$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */