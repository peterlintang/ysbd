package com.ireadercity.b2.store;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.d;
import com.ireadercity.b2.f.b;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.ui.HorizontialListView;
import com.ireadercity.b2.ui.widget.DetailImageView;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class CloudStoreBookDetailActivity
  extends Activity
{
  Handler a = new w(this);
  private com.ireadercity.b2.b.g b;
  private NetBookInfo c;
  private Toast d;
  private int e;
  private HorizontialListView f;
  private ImageButton g;
  private ImageView h;
  private com.ireadercity.b2.c.a i;
  private RelativeLayout j;
  
  private void c()
  {
    String str2 = this.c.i();
    String str1 = v.a(str2, "");
    new StringBuilder("bookURL").append(str2).toString();
    new StringBuilder("bookFileName").append(str1).toString();
    if (!this.i.f(com.ireadercity.b2.a.l + "/" + str1))
    {
      if (com.ireadercity.b2.e.a.a(this.c.d()) == null)
      {
        if (com.ireadercity.b2.a.e)
        {
          str1 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("userName", null);
          if (((str1 == null) || (!str1.equals(this.c.j()))) && (!b.a(this, this.c.m()))) {
            return;
          }
          d();
        }
        d locald = new d();
        str1 = str2;
        if (!str2.startsWith("http://")) {
          str1 = com.ireadercity.b2.a.B + str2;
        }
        locald.f(str1);
        locald.e(this.c.d());
        locald.b(this.c.g());
        locald.d(this.c.f());
        locald.c(this.c.e());
        locald.a(this.c);
        this.c.l();
        com.ireadercity.b2.e.a.a(getApplicationContext()).b(locald);
        this.d.setText("已加入到下载列表");
        this.d.show();
        return;
      }
      this.d.setText("你已加入过本书到下载列表!");
      this.d.show();
      return;
    }
    this.d.setText("书架上已经有此书，不用重复下载!");
    this.d.show();
  }
  
  private void d()
  {
    TextView localTextView = (TextView)findViewById(2131361845);
    int k = b.a();
    localTextView.setText("积分：需要" + this.c.m() + ",你有" + k + "分");
    if (this.c.m() > k) {
      localTextView.setTextColor(-65536);
    }
  }
  
  public final void a()
  {
    Object localObject1 = PreferenceManager.getDefaultSharedPreferences(this);
    Object localObject2 = ((SharedPreferences)localObject1).getString("userName", null);
    Object localObject3 = ((SharedPreferences)localObject1).getString("password", null);
    new StringBuilder(" userName=").append((String)localObject2).append(" password=").append((String)localObject3).append("activity=").append(this).toString();
    if ((!com.ireadercity.b2.h.y.d((String)localObject2)) && (!com.ireadercity.b2.h.y.d((String)localObject3)))
    {
      if (this.e == 93) {}
      for (localObject1 = com.ireadercity.b2.a.z + "/iOSServices/RemoveMyFavoriteBook.aspx";; localObject1 = com.ireadercity.b2.a.z + "/iOSServices/PurchaseHistory.aspx")
      {
        com.ireadercity.b2.e.g localg = new com.ireadercity.b2.e.g(this.a);
        localg.a(com.ireadercity.b2.h.y.b());
        localg.a(com.ireadercity.b2.h.y.a());
        localg.a(com.ireadercity.b2.a.J);
        BasicNameValuePair localBasicNameValuePair1 = new BasicNameValuePair("UserBookType", "1");
        BasicNameValuePair localBasicNameValuePair2 = new BasicNameValuePair("BookID", this.c.d());
        localObject2 = new BasicNameValuePair("BookStore_uID", (String)localObject2);
        localObject3 = new BasicNameValuePair("BookStore_pWD", (String)localObject3);
        localg.a().add(localObject2);
        localg.a().add(localObject3);
        localg.a().add(localBasicNameValuePair2);
        localg.a().add(localBasicNameValuePair1);
        localg.b((String)localObject1);
        return;
      }
    }
    this.d.setText("必须登陆才能保存你的收藏记录到服务器。");
    this.d.show();
  }
  
  public final void b()
  {
    NetBookInfo localNetBookInfo = this.c;
    Object localObject1 = (TextView)findViewById(2131361835);
    new StringBuilder("bookTitle=").append(localObject1).append(" this=").append(this).toString();
    Object localObject4 = (TextView)findViewById(2131361840);
    Object localObject2 = (TextView)findViewById(2131361841);
    this.j = ((RelativeLayout)findViewById(2131361858));
    TextView localTextView1 = (TextView)findViewById(2131361852);
    localTextView1.setOnClickListener(new t(this, localTextView1));
    DetailImageView localDetailImageView = (DetailImageView)findViewById(2131361839);
    ImageView localImageView = (ImageView)findViewById(2131361844);
    Object localObject3 = new x(this);
    this.f = ((HorizontialListView)findViewById(2131361861));
    this.f.setOnItemClickListener((AdapterView.OnItemClickListener)localObject3);
    this.g = ((ImageButton)findViewById(2131361836));
    this.g.setOnClickListener(new y(this));
    TextView localTextView2 = (TextView)findViewById(2131361835);
    localObject3 = (TextView)findViewById(2131361846);
    TextView localTextView3 = (TextView)findViewById(2131361847);
    TextView localTextView4 = (TextView)findViewById(2131361857);
    TextView localTextView5 = (TextView)findViewById(2131361856);
    localTextView3.setOnClickListener(new z(this));
    localTextView5.setOnClickListener(new aa(this, localNetBookInfo));
    localTextView4.setOnClickListener(new ab(this));
    ((TextView)findViewById(2131361848)).setOnClickListener(new ac(this));
    ((TextView)localObject1).setText(localNetBookInfo.e());
    ((TextView)localObject4).setText("作者：" + localNetBookInfo.g());
    localTextView1.setText(localNetBookInfo.f());
    localObject4 = new StringBuilder("大小：");
    long l = localNetBookInfo.a();
    float f1 = (float)l;
    if (l > 1000000L)
    {
      localObject1 = String.format("%.2fM", new Object[] { Float.valueOf(f1 / 1000000.0F) });
      ((TextView)localObject2).setText((String)localObject1);
      if (com.ireadercity.b2.a.e) {
        d();
      }
      localObject2 = localNetBookInfo.h();
      localObject1 = localObject2;
      if (!((String)localObject2).startsWith("http")) {
        localObject1 = com.ireadercity.b2.a.A + localNetBookInfo.h();
      }
      this.b.a((String)localObject1, localDetailImageView);
      localObject1 = BitmapFactory.decodeStream(getResources().openRawResource(2130837922));
      int m = (int)(((Bitmap)localObject1).getWidth() * this.c.k() / 10.0F);
      int k = m;
      if (m == 0) {
        k = 1;
      }
      localObject2 = Bitmap.createBitmap((Bitmap)localObject1, 0, 0, k, ((Bitmap)localObject1).getHeight());
      localImageView.setImageBitmap((Bitmap)localObject2);
      localImageView.setScaleType(ImageView.ScaleType.FIT_START);
      new StringBuilder("bitmap.getWidth()=").append(((Bitmap)localObject1).getWidth()).append(" cropedBitmap.getWidth()=").append(((Bitmap)localObject2).getWidth()).toString();
      if (localNetBookInfo.e().length() <= 8) {
        break label877;
      }
      localObject1 = localNetBookInfo.e().substring(0, 8);
      label640:
      localTextView2.setText((CharSequence)localObject1);
      this.h = ((ImageView)findViewById(2131361854));
      this.h.setOnClickListener(new ad(this, localTextView1));
      ((ImageButton)findViewById(2131361817)).setOnClickListener(new ae(this));
      ((TextView)localObject3).setOnClickListener(new u(this));
      localObject1 = this.c.i();
      localObject1 = ((String)localObject1).substring(((String)localObject1).lastIndexOf('/') + 1, ((String)localObject1).length());
      if (!this.i.f(com.ireadercity.b2.a.l + "/" + (String)localObject1)) {
        break label887;
      }
      ((TextView)localObject3).setText("  已经下载  ");
      ((TextView)localObject3).setClickable(false);
      ((TextView)localObject3).setEnabled(false);
    }
    for (;;)
    {
      this.c.d();
      new af(this).execute(new String[] { this.c.d() });
      return;
      if (l > 1000L)
      {
        localObject1 = String.format("%.2fK", new Object[] { Float.valueOf(f1 / 1000.0F) });
        break;
      }
      localObject1 = String.valueOf(f1);
      break;
      label877:
      localObject1 = localNetBookInfo.e();
      break label640;
      label887:
      ((TextView)localObject3).setText("  免费下载  ");
      ((TextView)localObject3).setEnabled(true);
      ((TextView)localObject3).setClickable(true);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    com.ireadercity.b2.a.ag = this;
    this.i = com.ireadercity.b2.c.a.a(this);
    this.d = Toast.makeText(this, "", 0);
    this.d.setGravity(17, 0, 0);
    this.b = new com.ireadercity.b2.b.g(getApplicationContext(), 2);
    paramBundle = getIntent().getExtras();
    this.c = ((NetBookInfo)paramBundle.getSerializable("book"));
    this.e = ((Integer)paramBundle.getSerializable("dataType")).intValue();
    b();
  }
  
  protected void onDestroy()
  {
    try
    {
      super.onDestroy();
      com.ireadercity.b2.a.d();
      finalize();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  protected void onResume()
  {
    if (com.ireadercity.b2.a.e) {
      d();
    }
    super.onResume();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\CloudStoreBookDetailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */