package com.taobao.munion.ewall.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.taobao.munion.common.MunionInitializer;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.actorframework.DefaultActorManager;
import com.taobao.munion.restool.a;

public class TestActivity
  extends FragmentActivity
{
  private void InitPagerManager()
  {
    FragmentPageManager.getInstance().pushPage(TestFragment.class.getName());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!MunionInitializer.isInitialized()) {
      MunionInitializer.initialize(getApplication());
    }
    setContentView(a.i("munion_ewall_container"));
    FragmentPageManager.getInstance().setFragmentManager(getSupportFragmentManager());
    InitPagerManager();
  }
  
  protected void onDestroy()
  {
    DefaultActorManager.getInstance().terminate();
    super.onDestroy();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\test\TestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */