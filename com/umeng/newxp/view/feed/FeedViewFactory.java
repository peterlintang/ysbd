package com.umeng.newxp.view.feed;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout.LayoutParams;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.view.handler.utils.b.a;
import com.umeng.newxp.view.handler.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FeedViewFactory
{
  public static Context context;
  private static c mImageFetcher;
  
  public static View getFeedView(Activity paramActivity, Feed paramFeed)
  {
    return getFeedView(paramActivity, paramFeed, new FrameLayout.LayoutParams(-1, -2));
  }
  
  public static FeedView getFeedView(Activity paramActivity, Feed paramFeed, FrameLayout.LayoutParams paramLayoutParams)
  {
    FeedView localFeedView = new FeedView(paramActivity);
    if (Feed.a.b == paramFeed.style)
    {
      localObject1 = new DragViewPager(context);
      paramLayoutParams.height = ((int)context.getResources().getDimension(FeedRes.dimen_umeng_xp_feed_pager_height(paramActivity)));
      ((DragViewPager)localObject1).setLayoutParams(paramLayoutParams);
      paramLayoutParams = new ArrayList();
      Iterator localIterator = paramFeed.a.iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Promoter)localIterator.next();
        localObject2 = new b(context, (Promoter)localObject2);
        ((b)localObject2).a(paramFeed.c);
        paramLayoutParams.add(localObject2);
      }
      ((DragViewPager)localObject1).setAdapter(new FeedViewFactory.ViewPagerAdapter(paramLayoutParams));
      ((DragViewPager)localObject1).setOnItemClickListener(new FeedViewFactory.1(paramFeed, paramActivity));
      ((DragViewPager)localObject1).setOnPageChangeListener(new FeedViewFactory.2((DragViewPager)localObject1, paramFeed));
      ((DragViewPager)localObject1).getViewTreeObserver().addOnGlobalLayoutListener(new FeedViewFactory.3((DragViewPager)localObject1, paramFeed));
      localFeedView.addView((View)localObject1);
      return localFeedView;
    }
    Object localObject1 = new e(context);
    paramLayoutParams.height = ((int)context.getResources().getDimension(FeedRes.dimen_umeng_xp_feed_simple_height(paramActivity)));
    ((e)localObject1).setLayoutParams(paramLayoutParams);
    localFeedView.addView((View)localObject1, paramLayoutParams);
    paramLayoutParams = (ItemClickStrip)View.inflate(context, FeedRes.layout_umeng_xp_feed_horizontalstrip(paramActivity), null);
    paramLayoutParams.setOnItemClickListener(new FeedViewFactory.4(paramFeed, paramActivity));
    paramLayoutParams.setChildVisibleChanged(new FeedViewFactory.5(paramFeed, paramLayoutParams));
    paramLayoutParams.getViewTreeObserver().addOnGlobalLayoutListener(new FeedViewFactory.6(paramLayoutParams, paramFeed));
    ((e)localObject1).addView(paramLayoutParams, new ViewGroup.LayoutParams(-1, -1));
    ((e)localObject1).a(new FeedViewFactory.7(paramLayoutParams, paramFeed));
    return localFeedView;
  }
  
  public static c getImageFetcher()
  {
    if (mImageFetcher == null)
    {
      Object localObject = new c(context, 0);
      mImageFetcher = (c)localObject;
      ((c)localObject).b(false);
      localObject = new b.a(context, "thumbs");
      ((b.a)localObject).a(0.25F);
      mImageFetcher.a((b.a)localObject);
    }
    return mImageFetcher;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */