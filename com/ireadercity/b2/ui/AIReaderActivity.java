package com.ireadercity.b2.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Environment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.b.c;
import com.ireadercity.b2.bean.f;
import com.ireadercity.b2.h.y;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AIReaderActivity
  extends Activity
  implements com.ireadercity.b2.e.d
{
  public static AIReaderActivity a;
  private am A;
  private AlertDialog B;
  private Object C;
  private f D;
  private View.OnClickListener E;
  private View.OnClickListener F;
  private ImageView G;
  private LinearLayout H;
  private RelativeLayout I;
  private ImageButton J;
  private ImageButton K;
  private ImageButton L;
  private ImageButton M;
  private ImageButton N;
  private TextView O;
  private View P;
  private RelativeLayout Q;
  private LinearLayout R;
  public volatile int b;
  public View c;
  public View d;
  public ImageButton e;
  public String f = null;
  public ImageButton g;
  public ImageButton h;
  public Button i;
  public Button j;
  public Button k;
  public TextView l;
  private int m;
  private al n;
  private List<f> o;
  private List<f> p;
  private List<com.ireadercity.b2.bean.b> q;
  private List<com.ireadercity.b2.bean.b> r;
  private ListView s;
  private com.ireadercity.b2.a.r t;
  private c u;
  private int[] v = { 2131034128, 2131034204, 2131034208, 2131034136, 2131034218, 2131034222, 2131034200, 2131034196, 2131034154, 2131034182, 2131034144, 2131034176, 2131034118, 2131034116, 2131034194, 2131034152, 2131034124, 2131034156, 2131034214, 2131034224, 2131034206, 2131034142, 2131034130, 2131034202, 2131034166, 2131034158, 2131034114, 2131034112, 2131034210, 2131034184, 2131034126, 2131034178, 2131034164, 2131034220, 2131034216, 2131034170, 2131034134, 2131034122, 2131034132, 2131034168, 2131034186, 2131034140, 2131034174, 2131034150, 2131034148, 2131034172, 2131034146, 2131034188, 2131034160, 2131034162, 2131034198, 2131034212, 2131034192, 2131034138, 2131034180, 2131034120, 2131034190 };
  private int[] w = { 2131034129, 2131034205, 2131034209, 2131034137, 2131034219, 2131034223, 2131034201, 2131034197, 2131034155, 2131034183, 2131034145, 2131034177, 2131034119, 2131034117, 2131034195, 2131034153, 2131034125, 2131034157, 2131034215, 2131034225, 2131034207, 2131034143, 2131034131, 2131034203, 2131034167, 2131034159, 2131034115, 2131034113, 2131034211, 2131034185, 2131034127, 2131034179, 2131034165, 2131034221, 2131034217, 2131034171, 2131034135, 2131034123, 2131034133, 2131034169, 2131034187, 2131034141, 2131034175, 2131034151, 2131034149, 2131034173, 2131034147, 2131034189, 2131034161, 2131034163, 2131034199, 2131034213, 2131034193, 2131034139, 2131034181, 2131034121, 2131034191 };
  private String[] x = { "a175ce0a5e83c450cb6a7cb6d7dddda41", "ac4f6403b3bd24deb8e2d39d882969fdd", "acc4734d1096342dd8f3468c77f4536d8", "a24e62464ce1a48f285cb55d9a4e5043b", "ae36c973b887845e98ea7bf23548f7b27", "af9e7beb5fe2e43538df449fb318f77dc", "aacca0121b5d74260b3f15701e49c309b", "aa60d25f0061b430b9a8d7de726eacfc6", "a501e2bc7ec654040964a391e71d94c17", "a84990d62bcb94c31a61f375465cccfe1", "a40d0ab2e9fca4807b9a4f18a7a5c2ad5", "a7ad6df49a2174832b723bd94480d88d3", "a0c29209894cc428f9c2232c54d9739e5", "a0a898b3477b14a049233892dc339c5d7", "a9e1edea6019a4c63ba4747d3d98e13b6", "a4ddd6d21ad1e403e9401129679e669d4", "a15269c400da045d89ac2ee93583060f0", "a57aad33139ee4482a58e7a7d30c88013", "adcadf906de254222b1f45b10995d1af0", "afdc3742ee9264b5f9d2551fb9763a0fc", "acbb64d92ed9d4c44b8c12efd6682c359", "a3ece94f751f14d309f5f2598c4474189", "a17d29e61a7ca4af8a12746449abe9687", "abaaa143996e041429ef6ae8bfcfa8019", "a64c1e547fabe4af78821266bfe6df5b0", "a59aa2f8377c448f89d1cf56e1c2967fa", "a053e64f9f2934b7195c82fd764c471ea", "a02becf95b76342fc8efd743767d7ff8b", "ad3d2bf450f9340c6a8234e90746e63af", "a876a3e716b2448f791335040abcb2aad", "a16923b548ecc456990510937bf354d7f", "a7ee14661663642ff9b57c6227e263745", "a617bbcaa619543cb9df449cc6011a3fe", "af5d7cc77063443459766cfef5df33e54", "ae0b6cbffb1b74757bee883dc126a41f0", "a6ad84a95c93143c8af9f8d33f9cfcd72", "a1fd93a25735741839a185589942e2a8b", "a150f889ffda94dddbfab53c4610d2983", "a1df3c0872ff64d01a7357482ff5bb06e", "a6855e2bffd1142a0950c939dcfb46c7f", "a8a60323ce7cc4ec9a0ba934cd1639ebb", "a3c83d4cede834318a1f54626a5eae20f", "a75e60d51be9f4a729fb629a04a0c1d49", "a4607b9298a06471299c6660d32e6b9ed", "a44f3a57aec5741b29d3d36dacbb548d5", "a6b98ddfbb9ba49e1bba400a0e8a34694", "a4243617b4e3c431087edbdbcd6033c92", "a8addf2d7721044d7b2a997f8c89bfaf6", "a5dde24eae4b54866a045befdb3ed9f8f", "a5e5b8549d67c43819f60c1c43f8a9777", "aab423604df7a44a1b6cc5a00ff921eb7", "ada37f8570f814bccb9fdfa280bf4a9d0", "a992722d6859e4c6999d38ff9fbb58055", "a3514dbf5be4b412a93616dc5fb602f63", "a8281a8b9473c4979b197fc4985c5dd98", "a0df8be2d0a9e4b819c23fb6722812c7d", "a8f9c372c8d1548219b16c6537457a2a5" };
  private volatile int y;
  private com.ireadercity.b2.c.a z;
  
  public static List<com.ireadercity.b2.bean.b> a(List<com.ireadercity.b2.bean.b> paramList, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < paramList.size())
    {
      com.ireadercity.b2.bean.b localb = (com.ireadercity.b2.bean.b)paramList.get(i1);
      if ((localb != null) && (((localb.k() != null) && (localb.k().indexOf(paramString) >= 0)) || ((localb.n() != null) && (localb.n().indexOf(paramString) >= 0)))) {
        localArrayList.add(localb);
      }
      i1 += 1;
    }
    return localArrayList;
  }
  
  public static void a(View paramView, String paramString)
  {
    ((TextView)paramView.findViewById(2131361825)).setText(paramString);
  }
  
  private void a(com.ireadercity.b2.bean.b paramb, List<f> paramList, f paramf)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      a("没有分类，请先创建分类!");
      a(null, -1);
      return;
    }
    CharSequence[] arrayOfCharSequence = new CharSequence[paramList.size()];
    int i1 = 0;
    while (i1 < paramList.size())
    {
      arrayOfCharSequence[i1] = ((f)paramList.get(i1)).c();
      i1 += 1;
    }
    ad localad = new ad(this);
    this.B = new AlertDialog.Builder(this).setItems(arrayOfCharSequence, new ae(this, paramb, paramList, paramf)).create();
    this.B.setTitle(paramb.k());
    this.B.getWindow().setFlags(1024, 1024);
    this.B.setButton(getString(2131230845), localad);
    this.B.show();
  }
  
  private void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i2 = arrayOfFile.length;
      int i1 = 0;
      while (i1 < i2)
      {
        a(arrayOfFile[i1]);
        i1 += 1;
      }
    }
    paramFile.delete();
  }
  
  private long b(File paramFile)
  {
    long l1 = 0L;
    long l2;
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i2 = arrayOfFile.length;
      int i1 = 0;
      while (i1 < i2)
      {
        l2 = b(arrayOfFile[i1]);
        i1 += 1;
        l1 = l2 + l1;
      }
      paramFile.delete();
      l2 = l1;
    }
    do
    {
      do
      {
        return l2;
        l2 = l1;
      } while (paramFile == null);
      l2 = l1;
    } while (!paramFile.exists());
    l1 = paramFile.length();
    paramFile.delete();
    return 0L + l1;
  }
  
  private boolean b(String paramString)
  {
    try
    {
      paramString = new File(paramString);
      if (!paramString.isDirectory())
      {
        bool3 = paramString.mkdirs();
        bool1 = bool3;
        for (;;)
        {
          try
          {
            paramString = new File(com.ireadercity.b2.a.n);
            bool1 = bool3;
            if (paramString.exists())
            {
              bool2 = bool3;
              bool1 = bool3;
              if (paramString.isDirectory()) {}
            }
            else
            {
              bool1 = bool3;
              localFile1 = new File(com.ireadercity.b2.a.n.replace("/.", "/"));
              bool1 = bool3;
              if (!localFile1.exists()) {
                continue;
              }
              bool1 = bool3;
              localFile1.renameTo(paramString);
              bool2 = bool3;
            }
            bool1 = bool2;
            paramString = new File(com.ireadercity.b2.a.q);
            bool3 = bool2;
            bool1 = bool2;
            if (!paramString.exists())
            {
              bool1 = bool2;
              bool3 = paramString.mkdirs();
            }
            bool1 = bool3;
            paramString = new File(com.ireadercity.b2.a.s);
            bool2 = bool3;
            bool1 = bool3;
            if (!paramString.exists())
            {
              bool1 = bool3;
              bool2 = paramString.mkdirs();
            }
            bool1 = bool2;
            paramString = new File(com.ireadercity.b2.a.t);
            bool3 = bool2;
            bool1 = bool2;
            if (!paramString.exists())
            {
              bool1 = bool2;
              bool3 = paramString.mkdirs();
            }
            bool1 = bool3;
            paramString = new File(com.ireadercity.b2.a.o);
            bool1 = bool3;
            localFile1 = new File(com.ireadercity.b2.a.o.replace("/.", "/"));
            bool1 = bool3;
            if (paramString.exists())
            {
              bool2 = bool3;
              bool1 = bool3;
              if (paramString.isDirectory()) {}
            }
            else
            {
              bool1 = bool3;
              if (!localFile1.exists()) {
                continue;
              }
              bool1 = bool3;
              localFile1.renameTo(paramString);
              bool2 = bool3;
            }
            bool1 = bool2;
            if (paramString.exists()) {
              continue;
            }
            bool1 = bool2;
            bool2 = paramString.mkdirs();
            bool1 = bool2;
          }
          catch (Exception paramString)
          {
            boolean bool2;
            File localFile1;
            String[] arrayOfString;
            int i2;
            int i1;
            continue;
            bool1 = bool2;
            continue;
          }
          try
          {
            if ((!paramString.exists()) || (!localFile1.exists())) {
              continue;
            }
            if (localFile1.list() == null) {
              continue;
            }
            arrayOfString = localFile1.list();
            i2 = arrayOfString.length;
            i1 = 0;
            if (i1 >= i2) {
              continue;
            }
            paramString = arrayOfString[i1];
            try
            {
              File localFile2 = new File(com.ireadercity.b2.a.o.replace("/.", "/") + "/" + paramString);
              if (!paramString.toLowerCase().endsWith("png")) {
                continue;
              }
              paramString = new File(com.ireadercity.b2.a.o + "/" + paramString + "x");
              new StringBuilder("Moving file from ").append(localFile2.getPath()).append(" to ").append(paramString.getPath()).toString();
              org.a.a.a.b.a(localFile2, paramString);
            }
            catch (Exception paramString)
            {
              paramString.printStackTrace();
              paramString.toString();
              continue;
            }
            i1 += 1;
            continue;
            bool1 = bool3;
            bool2 = paramString.mkdirs();
          }
          catch (Exception paramString) {}
          bool1 = bool3;
          bool2 = paramString.mkdirs();
          continue;
          paramString = new File(com.ireadercity.b2.a.o + "/" + paramString);
        }
        paramString.printStackTrace();
        paramString.toString();
        bool2 = bool1;
        do
        {
          return bool2;
          com.ireadercity.b2.c.a.a(getApplicationContext()).b();
          a(localFile1);
          paramString = new File(com.ireadercity.b2.a.p);
          if (!paramString.exists()) {
            break;
          }
          bool2 = bool1;
        } while (paramString.isDirectory());
        localFile1 = new File(com.ireadercity.b2.a.p.replace("/.", "/"));
        if (localFile1.exists())
        {
          localFile1.renameTo(paramString);
          return bool1;
        }
        bool2 = paramString.mkdirs();
        return bool2;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        boolean bool1 = false;
        continue;
        boolean bool3 = false;
      }
    }
  }
  
  public static void g() {}
  
  private boolean h()
  {
    this.i.setText("全选");
    if (this.Q.getVisibility() != 0) {
      return false;
    }
    this.Q.setVisibility(8);
    this.R.setVisibility(0);
    if (this.b <= 0)
    {
      this.g.setImageResource(2130837748);
      this.g.setClickable(false);
    }
    for (;;)
    {
      this.t.c();
      return true;
      this.g.setImageResource(2130837713);
      this.g.setClickable(true);
    }
  }
  
  private void i()
  {
    MobclickAgent.updateOnlineConfig(this);
    MobclickAgent.setOnlineConfigureListener(new m(this));
    if (MobclickAgent.getConfigParams(this, "openewall").equals("1"))
    {
      com.ireadercity.b2.a.au = true;
      if (!MobclickAgent.getConfigParams(this, "ewallforread").equals("1")) {
        break label215;
      }
    }
    String[] arrayOfString1;
    String[] arrayOfString2;
    label215:
    for (com.ireadercity.b2.a.av = true;; com.ireadercity.b2.a.av = false)
    {
      com.ireadercity.b2.a.c = MobclickAgent.getConfigParams(this, "HANDLER_ID");
      com.ireadercity.b2.a.d = MobclickAgent.getConfigParams(this, "HANDLER_ID_FOR_READ");
      com.ireadercity.b2.a.b = MobclickAgent.getConfigParams(this, "FEED_SLOT_ID");
      Object localObject = MobclickAgent.getConfigParams(this, "yuyinList");
      if ((localObject == null) || ("".equals(localObject))) {
        return;
      }
      localObject = ((String)localObject).split("&");
      arrayOfString1 = new String[localObject.length];
      arrayOfString2 = new String[localObject.length];
      int i1 = 0;
      while (i1 < localObject.length)
      {
        String[] arrayOfString3 = localObject[i1].split(":");
        if ((arrayOfString3.length > 0) && (!"".equals(arrayOfString3[0]))) {
          arrayOfString2[i1] = arrayOfString3[0];
        }
        if ((arrayOfString3.length > 1) && (!"".equals(arrayOfString3[1]))) {
          arrayOfString1[i1] = arrayOfString3[1];
        }
        i1 += 1;
      }
      com.ireadercity.b2.a.au = false;
      break;
    }
    com.ireadercity.b2.a.at = arrayOfString2;
    com.ireadercity.b2.a.as = arrayOfString1;
  }
  
  public final void a() {}
  
  public final void a(com.ireadercity.b2.bean.d paramd)
  {
    a("下载开始 ：" + paramd.e());
    a(false);
  }
  
  public final void a(f paramf)
  {
    this.D = paramf;
  }
  
  public final void a(String paramString)
  {
    paramString = Toast.makeText(getApplicationContext(), paramString, 0);
    paramString.setGravity(17, 0, 0);
    paramString.show();
  }
  
  public final void a(String paramString, int paramInt)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    View localView = getLayoutInflater().inflate(2130903085, null);
    Object localObject = (EditText)localView.findViewById(2131362001);
    if (paramString != null) {
      ((EditText)localObject).setText(paramString);
    }
    localObject = new w(this, paramString, (EditText)localObject, localAlertDialog, paramInt);
    localAlertDialog.setOnKeyListener(new x(this, localAlertDialog));
    if (paramString == null) {
      localAlertDialog.setTitle("添加分类");
    }
    for (;;)
    {
      localAlertDialog.setView(localView);
      localAlertDialog.setButton("确定", (DialogInterface.OnClickListener)localObject);
      localAlertDialog.setButton2("取消", (DialogInterface.OnClickListener)localObject);
      localAlertDialog.show();
      return;
      localAlertDialog.setTitle("重命名分类");
    }
  }
  
  public final void a(List<com.ireadercity.b2.bean.b> paramList)
  {
    this.q = paramList;
  }
  
  public final void a(List<com.ireadercity.b2.bean.b> paramList, List<f> paramList1, f paramf)
  {
    int i2 = 0;
    new StringBuilder().append(paramList1).append("  categoryList").toString();
    new StringBuilder().append(this.p).append("  categories").toString();
    CharSequence[] arrayOfCharSequence;
    if ((paramList1 == null) || (paramList1.size() <= 0))
    {
      if (this.b <= 0)
      {
        a("请先创建分类!");
        return;
      }
      new StringBuilder().append(paramList1.size()).append("  categories").toString();
      arrayOfCharSequence = new CharSequence[1];
      arrayOfCharSequence[0] = "移动至顶层";
    }
    for (;;)
    {
      new StringBuilder().append(arrayOfCharSequence.length).append("  itemss.length").toString();
      int i1 = i2;
      for (;;)
      {
        if (i1 < arrayOfCharSequence.length)
        {
          new StringBuilder().append(arrayOfCharSequence[i1]).toString();
          i1 += 1;
          continue;
          if (this.b > 0)
          {
            arrayOfCharSequence = new CharSequence[paramList1.size() + 1];
            arrayOfCharSequence[paramList1.size()] = "移动至顶层";
            i1 = 0;
            while ((i1 < arrayOfCharSequence.length) && (i1 < paramList1.size()))
            {
              arrayOfCharSequence[i1] = ((f)paramList1.get(i1)).c();
              i1 += 1;
            }
            break;
          }
          arrayOfCharSequence = new CharSequence[paramList1.size()];
          i1 = 0;
          while (i1 < arrayOfCharSequence.length)
          {
            arrayOfCharSequence[i1] = ((f)paramList1.get(i1)).c();
            i1 += 1;
          }
        }
      }
      ab localab = new ab(this);
      this.B = new AlertDialog.Builder(this).setItems(arrayOfCharSequence, new ac(this, paramList1, paramList, paramf)).create();
      this.B.setTitle("移动所有书籍到分类");
      this.B.getWindow().setFlags(1024, 1024);
      this.B.setButton(getString(2131230845), localab);
      this.B.show();
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      if (this.n != null) {
        this.n.cancel(true);
      }
      this.n = new al(this, paramBoolean);
      this.n.execute(new Object[0]);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public final void b()
  {
    runOnUiThread(new q(this));
  }
  
  public final void b(com.ireadercity.b2.bean.d paramd)
  {
    a("下载完成 ：" + paramd.e());
    a(false);
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 137	com/ireadercity/b2/ui/AIReaderActivity:v	[I
    //   8: arraylength
    //   9: istore 4
    //   11: iload_3
    //   12: istore_1
    //   13: iload_2
    //   14: iload 4
    //   16: if_icmpge +164 -> 180
    //   19: new 507	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 861
    //   26: invokespecial 527	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: getstatic 863	com/ireadercity/b2/a:l	Ljava/lang/String;
    //   32: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc_w 485
    //   38: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: getfield 314	com/ireadercity/b2/ui/AIReaderActivity:x	[Ljava/lang/String;
    //   45: iload_2
    //   46: aaload
    //   47: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc_w 865
    //   53: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: pop
    //   60: new 867	java/io/FileOutputStream
    //   63: dup
    //   64: new 443	java/io/File
    //   67: dup
    //   68: new 507	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   75: getstatic 863	com/ireadercity/b2/a:l	Ljava/lang/String;
    //   78: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc_w 485
    //   84: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_0
    //   88: getfield 314	com/ireadercity/b2/ui/AIReaderActivity:x	[Ljava/lang/String;
    //   91: iload_2
    //   92: aaload
    //   93: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc_w 865
    //   99: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokespecial 474	java/io/File:<init>	(Ljava/lang/String;)V
    //   108: invokespecial 869	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   111: astore 5
    //   113: aload_0
    //   114: invokevirtual 873	com/ireadercity/b2/ui/AIReaderActivity:getResources	()Landroid/content/res/Resources;
    //   117: aload_0
    //   118: getfield 137	com/ireadercity/b2/ui/AIReaderActivity:v	[I
    //   121: iload_2
    //   122: iaload
    //   123: invokevirtual 879	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   126: astore 6
    //   128: sipush 4096
    //   131: newarray <illegal type>
    //   133: astore 7
    //   135: aload 6
    //   137: aload 7
    //   139: invokevirtual 885	java/io/InputStream:read	([B)I
    //   142: istore_1
    //   143: iload_1
    //   144: iconst_m1
    //   145: if_icmpeq +195 -> 340
    //   148: aload 5
    //   150: aload 7
    //   152: iconst_0
    //   153: iload_1
    //   154: invokevirtual 891	java/io/OutputStream:write	([BII)V
    //   157: goto -22 -> 135
    //   160: astore 5
    //   162: aload 5
    //   164: invokevirtual 540	java/lang/Exception:printStackTrace	()V
    //   167: goto +173 -> 340
    //   170: astore 5
    //   172: aload 5
    //   174: invokevirtual 540	java/lang/Exception:printStackTrace	()V
    //   177: goto +170 -> 347
    //   180: aload_0
    //   181: getfield 196	com/ireadercity/b2/ui/AIReaderActivity:w	[I
    //   184: arraylength
    //   185: istore_2
    //   186: iload_1
    //   187: iload_2
    //   188: if_icmpge +151 -> 339
    //   191: new 507	java/lang/StringBuilder
    //   194: dup
    //   195: ldc_w 893
    //   198: invokespecial 527	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: getstatic 863	com/ireadercity/b2/a:l	Ljava/lang/String;
    //   204: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: ldc_w 485
    //   210: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: aload_0
    //   214: getfield 314	com/ireadercity/b2/ui/AIReaderActivity:x	[Ljava/lang/String;
    //   217: iload_1
    //   218: aaload
    //   219: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: ldc_w 895
    //   225: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: pop
    //   232: new 867	java/io/FileOutputStream
    //   235: dup
    //   236: new 443	java/io/File
    //   239: dup
    //   240: new 507	java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   247: getstatic 501	com/ireadercity/b2/a:o	Ljava/lang/String;
    //   250: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: ldc_w 485
    //   256: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload_0
    //   260: getfield 314	com/ireadercity/b2/ui/AIReaderActivity:x	[Ljava/lang/String;
    //   263: iload_1
    //   264: aaload
    //   265: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: ldc_w 895
    //   271: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   277: invokespecial 474	java/io/File:<init>	(Ljava/lang/String;)V
    //   280: invokespecial 869	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   283: astore 5
    //   285: aload_0
    //   286: invokevirtual 873	com/ireadercity/b2/ui/AIReaderActivity:getResources	()Landroid/content/res/Resources;
    //   289: aload_0
    //   290: getfield 196	com/ireadercity/b2/ui/AIReaderActivity:w	[I
    //   293: iload_1
    //   294: iaload
    //   295: invokevirtual 879	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   298: astore 6
    //   300: sipush 4096
    //   303: newarray <illegal type>
    //   305: astore 7
    //   307: aload 6
    //   309: aload 7
    //   311: invokevirtual 885	java/io/InputStream:read	([B)I
    //   314: istore_2
    //   315: iload_2
    //   316: iconst_m1
    //   317: if_icmpeq +30 -> 347
    //   320: aload 5
    //   322: aload 7
    //   324: iconst_0
    //   325: iload_2
    //   326: invokevirtual 891	java/io/OutputStream:write	([BII)V
    //   329: goto -22 -> 307
    //   332: astore 5
    //   334: aload 5
    //   336: invokevirtual 540	java/lang/Exception:printStackTrace	()V
    //   339: return
    //   340: iload_2
    //   341: iconst_1
    //   342: iadd
    //   343: istore_2
    //   344: goto -340 -> 4
    //   347: iload_1
    //   348: iconst_1
    //   349: iadd
    //   350: istore_1
    //   351: goto -171 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	this	AIReaderActivity
    //   12	339	1	i1	int
    //   3	341	2	i2	int
    //   1	11	3	i3	int
    //   9	8	4	i4	int
    //   111	38	5	localFileOutputStream1	java.io.FileOutputStream
    //   160	3	5	localException1	Exception
    //   170	3	5	localException2	Exception
    //   283	38	5	localFileOutputStream2	java.io.FileOutputStream
    //   332	3	5	localException3	Exception
    //   126	182	6	localInputStream	java.io.InputStream
    //   133	190	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   19	135	160	java/lang/Exception
    //   135	143	160	java/lang/Exception
    //   148	157	160	java/lang/Exception
    //   191	307	170	java/lang/Exception
    //   307	315	170	java/lang/Exception
    //   320	329	170	java/lang/Exception
    //   4	11	332	java/lang/Exception
    //   162	167	332	java/lang/Exception
    //   172	177	332	java/lang/Exception
    //   180	186	332	java/lang/Exception
  }
  
  public final void d()
  {
    new r(this).start();
  }
  
  public final void e()
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    View localView = getLayoutInflater().inflate(2130903085, null);
    localAlertDialog.setTitle("筛选");
    Object localObject = (TextView)localView.findViewById(2131362000);
    EditText localEditText = (EditText)localView.findViewById(2131362001);
    ((TextView)localObject).setText("输入筛选关键字：(无空格)");
    if (this.f != null) {
      localEditText.setText(this.f);
    }
    localObject = new u(this, localEditText, localAlertDialog);
    localAlertDialog.setOnKeyListener(new v(this, localAlertDialog));
    localAlertDialog.setView(localView);
    localAlertDialog.setButton("确定", (DialogInterface.OnClickListener)localObject);
    localAlertDialog.setButton2("取消筛选", (DialogInterface.OnClickListener)localObject);
    localAlertDialog.setButton3("关闭", (DialogInterface.OnClickListener)localObject);
    localAlertDialog.show();
  }
  
  public final List<f> f()
  {
    return this.p;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    Object localObject1;
    if ((this.C instanceof com.ireadercity.b2.bean.b))
    {
      localObject1 = (com.ireadercity.b2.bean.b)this.C;
      switch (paramMenuItem.getOrder())
      {
      }
    }
    for (;;)
    {
      return super.onContextItemSelected(paramMenuItem);
      this.t.c((com.ireadercity.b2.bean.b)localObject1);
      continue;
      Object localObject2 = ((com.ireadercity.b2.bean.b)localObject1).i();
      if (y.d((String)localObject2))
      {
        a("此书不能评论...");
        return true;
      }
      Object localObject3 = new Intent(this, BookCommentActivity.class);
      ((Intent)localObject3).putExtra("storeBookId", (String)localObject2);
      ((Intent)localObject3).putExtra("storeBookName", ((com.ireadercity.b2.bean.b)localObject1).k());
      startActivity((Intent)localObject3);
      continue;
      this.t.a((com.ireadercity.b2.bean.b)localObject1);
      continue;
      if ((this.o == null) || (this.o.size() <= 0))
      {
        a("请先创建分类!");
        return true;
      }
      a((com.ireadercity.b2.bean.b)localObject1, this.p, null);
      continue;
      if (this.D != null)
      {
        this.z.d(((com.ireadercity.b2.bean.b)localObject1).j(), this.D.b());
        b();
        continue;
        localObject2 = this.z.c();
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          localObject3 = ((List)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            f localf = (f)((Iterator)localObject3).next();
            if ((this.D != null) && (localf.b() == this.D.b())) {
              ((List)localObject2).remove(localf);
            }
          }
        }
        a((com.ireadercity.b2.bean.b)localObject1, (List)localObject2, this.D);
        continue;
        localObject2 = new Intent("android.intent.action.SEND");
        ((Intent)localObject2).setType("text/plain");
        ((Intent)localObject2).putExtra("android.intent.extra.SUBJECT", "#书香云集书分享# 书名：" + ((com.ireadercity.b2.bean.b)localObject1).k() + " 作者：" + ((com.ireadercity.b2.bean.b)localObject1).n());
        ((Intent)localObject2).putExtra("android.intent.extra.TEXT", "#书香云集书分享# @书香云集 简介：" + ((com.ireadercity.b2.bean.b)localObject1).m());
        startActivity(Intent.createChooser((Intent)localObject2, ((com.ireadercity.b2.bean.b)localObject1).k()));
        continue;
        if ((this.C instanceof f))
        {
          localObject1 = (f)this.C;
          switch (paramMenuItem.getOrder())
          {
          default: 
            break;
          case 0: 
            this.t.a((f)localObject1);
            break;
          case 1: 
            new AlertDialog.Builder(this).setTitle("删除文件夹(不会删除书籍)?").setMessage(((f)localObject1).c()).setPositiveButton(2131230844, new o(this, (f)localObject1)).setNegativeButton(2131230845, null).show();
            break;
          case 2: 
            new AlertDialog.Builder(this).setTitle("删除文件夹(并且删除里面的所有书籍)?").setMessage(((f)localObject1).c()).setPositiveButton(2131230844, new p(this, (f)localObject1, (f)localObject1)).setNegativeButton(2131230845, null).show();
            break;
          case 3: 
            a(null, 0);
            break;
          case 4: 
            a(((f)localObject1).c(), ((f)localObject1).b());
          }
        }
      }
    }
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: iconst_1
    //   4: putstatic 1066	com/umeng/common/Log:LOG	Z
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 1068	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   12: ldc2_w 1069
    //   15: lstore_2
    //   16: getstatic 1072	com/ireadercity/b2/a:w	Ljava/lang/String;
    //   19: invokestatic 1077	com/ireadercity/b2/b/q:c	(Ljava/lang/String;)Ljava/lang/String;
    //   22: invokestatic 1083	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   25: lstore 4
    //   27: lload 4
    //   29: lstore_2
    //   30: invokestatic 1088	java/lang/System:currentTimeMillis	()J
    //   33: lload_2
    //   34: lsub
    //   35: ldc2_w 1089
    //   38: lcmp
    //   39: ifge +43 -> 82
    //   42: new 394	android/app/AlertDialog$Builder
    //   45: dup
    //   46: aload_0
    //   47: invokespecial 397	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   50: ldc_w 1092
    //   53: invokevirtual 1026	android/app/AlertDialog$Builder:setTitle	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   56: ldc_w 796
    //   59: new 1094	com/ireadercity/b2/ui/k
    //   62: dup
    //   63: aload_0
    //   64: invokespecial 1095	com/ireadercity/b2/ui/k:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   67: invokevirtual 1098	android/app/AlertDialog$Builder:setPositiveButton	(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   70: ldc_w 1100
    //   73: invokevirtual 1029	android/app/AlertDialog$Builder:setMessage	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   76: invokevirtual 410	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   79: invokevirtual 1103	android/app/Dialog:show	()V
    //   82: aload_0
    //   83: putstatic 1107	com/ireadercity/b2/a:ag	Landroid/app/Activity;
    //   86: getstatic 1109	com/ireadercity/b2/a:i	Z
    //   89: ifeq +7 -> 96
    //   92: aload_0
    //   93: invokestatic 1112	com/umeng/analytics/MobclickAgent:onError	(Landroid/content/Context;)V
    //   96: new 443	java/io/File
    //   99: dup
    //   100: new 507	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   107: getstatic 481	com/ireadercity/b2/a:n	Ljava/lang/String;
    //   110: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: ldc_w 1114
    //   116: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokespecial 474	java/io/File:<init>	(Ljava/lang/String;)V
    //   125: astore_1
    //   126: aload_1
    //   127: invokevirtual 462	java/io/File:exists	()Z
    //   130: ifne +8 -> 138
    //   133: aload_1
    //   134: invokevirtual 1117	java/io/File:createNewFile	()Z
    //   137: pop
    //   138: new 1119	java/io/ObjectInputStream
    //   141: dup
    //   142: new 1121	java/io/FileInputStream
    //   145: dup
    //   146: new 507	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   153: getstatic 481	com/ireadercity/b2/a:n	Ljava/lang/String;
    //   156: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: ldc_w 1114
    //   162: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokespecial 1122	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   171: invokespecial 1125	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   174: astore 6
    //   176: aload 6
    //   178: astore_1
    //   179: aload 6
    //   181: invokevirtual 1128	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   184: checkcast 1130	java/util/Map
    //   187: putstatic 1135	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   190: aload 6
    //   192: invokevirtual 1138	java/io/ObjectInputStream:close	()V
    //   195: getstatic 1135	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   198: ifnonnull +13 -> 211
    //   201: new 1140	java/util/HashMap
    //   204: dup
    //   205: invokespecial 1141	java/util/HashMap:<init>	()V
    //   208: putstatic 1135	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   211: getstatic 1142	com/ireadercity/b2/h/r:c	Ljava/lang/String;
    //   214: ifnonnull +57 -> 271
    //   217: new 507	java/lang/StringBuilder
    //   220: dup
    //   221: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   224: astore_1
    //   225: aload_1
    //   226: ldc_w 1144
    //   229: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: getstatic 1146	com/ireadercity/b2/a:Q	I
    //   235: invokevirtual 818	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   238: ldc_w 710
    //   241: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: getstatic 1148	com/ireadercity/b2/a:G	Ljava/lang/String;
    //   247: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: ldc_w 710
    //   253: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload_0
    //   257: invokestatic 1153	com/ireadercity/b2/h/m:a	(Landroid/content/Context;)Ljava/lang/String;
    //   260: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload_1
    //   265: invokevirtual 515	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   268: putstatic 1142	com/ireadercity/b2/h/r:c	Ljava/lang/String;
    //   271: aload_0
    //   272: putstatic 1155	com/ireadercity/b2/ui/AIReaderActivity:a	Lcom/ireadercity/b2/ui/AIReaderActivity;
    //   275: aload_0
    //   276: ldc_w 1156
    //   279: invokevirtual 1159	com/ireadercity/b2/ui/AIReaderActivity:setContentView	(I)V
    //   282: invokestatic 1164	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   285: ldc_w 1166
    //   288: invokevirtual 677	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   291: ifne +205 -> 496
    //   294: new 394	android/app/AlertDialog$Builder
    //   297: dup
    //   298: aload_0
    //   299: invokespecial 397	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   302: ldc_w 1167
    //   305: invokevirtual 1170	android/app/AlertDialog$Builder:setTitle	(I)Landroid/app/AlertDialog$Builder;
    //   308: iconst_0
    //   309: invokevirtual 1174	android/app/AlertDialog$Builder:setCancelable	(Z)Landroid/app/AlertDialog$Builder;
    //   312: ldc_w 1175
    //   315: invokevirtual 1177	android/app/AlertDialog$Builder:setMessage	(I)Landroid/app/AlertDialog$Builder;
    //   318: ldc_w 1030
    //   321: new 1179	com/ireadercity/b2/ui/l
    //   324: dup
    //   325: aload_0
    //   326: invokespecial 1180	com/ireadercity/b2/ui/l:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   329: invokevirtual 1039	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   332: invokevirtual 410	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   335: invokevirtual 439	android/app/AlertDialog:show	()V
    //   338: aload_0
    //   339: invokestatic 1182	com/ireadercity/b2/h/y:d	(Landroid/content/Context;)V
    //   342: return
    //   343: astore_1
    //   344: aload_1
    //   345: invokevirtual 1183	java/lang/NumberFormatException:printStackTrace	()V
    //   348: goto -318 -> 30
    //   351: astore_1
    //   352: aload_1
    //   353: invokevirtual 540	java/lang/Exception:printStackTrace	()V
    //   356: goto -260 -> 96
    //   359: astore_1
    //   360: aload_1
    //   361: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   364: goto -169 -> 195
    //   367: astore 7
    //   369: aconst_null
    //   370: astore 6
    //   372: aload 6
    //   374: astore_1
    //   375: aload 7
    //   377: invokevirtual 1185	java/io/FileNotFoundException:printStackTrace	()V
    //   380: aload 6
    //   382: ifnull -187 -> 195
    //   385: aload 6
    //   387: invokevirtual 1138	java/io/ObjectInputStream:close	()V
    //   390: goto -195 -> 195
    //   393: astore_1
    //   394: aload_1
    //   395: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   398: goto -203 -> 195
    //   401: astore 7
    //   403: aconst_null
    //   404: astore 6
    //   406: aload 6
    //   408: astore_1
    //   409: aload 7
    //   411: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   414: aload 6
    //   416: ifnull -221 -> 195
    //   419: aload 6
    //   421: invokevirtual 1138	java/io/ObjectInputStream:close	()V
    //   424: goto -229 -> 195
    //   427: astore_1
    //   428: aload_1
    //   429: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   432: goto -237 -> 195
    //   435: astore 7
    //   437: aconst_null
    //   438: astore 6
    //   440: aload 6
    //   442: astore_1
    //   443: aload 7
    //   445: invokevirtual 1186	java/lang/ClassNotFoundException:printStackTrace	()V
    //   448: aload 6
    //   450: ifnull -255 -> 195
    //   453: aload 6
    //   455: invokevirtual 1138	java/io/ObjectInputStream:close	()V
    //   458: goto -263 -> 195
    //   461: astore_1
    //   462: aload_1
    //   463: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   466: goto -271 -> 195
    //   469: astore_1
    //   470: aload 7
    //   472: astore 6
    //   474: aload 6
    //   476: ifnull +8 -> 484
    //   479: aload 6
    //   481: invokevirtual 1138	java/io/ObjectInputStream:close	()V
    //   484: aload_1
    //   485: athrow
    //   486: astore 6
    //   488: aload 6
    //   490: invokevirtual 1184	java/io/IOException:printStackTrace	()V
    //   493: goto -9 -> 484
    //   496: aload_0
    //   497: invokevirtual 545	com/ireadercity/b2/ui/AIReaderActivity:getApplicationContext	()Landroid/content/Context;
    //   500: invokestatic 1191	com/ireadercity/b2/e/a:a	(Landroid/content/Context;)Lcom/ireadercity/b2/e/a;
    //   503: invokevirtual 1193	com/ireadercity/b2/e/a:e	()V
    //   506: aload_0
    //   507: aload_0
    //   508: invokestatic 550	com/ireadercity/b2/c/a:a	(Landroid/content/Context;)Lcom/ireadercity/b2/c/a;
    //   511: putfield 738	com/ireadercity/b2/ui/AIReaderActivity:z	Lcom/ireadercity/b2/c/a;
    //   514: aload_0
    //   515: aload_0
    //   516: invokestatic 1198	com/ireadercity/b2/h/b:a	(Landroid/content/Context;)I
    //   519: putfield 320	com/ireadercity/b2/ui/AIReaderActivity:y	I
    //   522: aload_0
    //   523: getstatic 863	com/ireadercity/b2/a:l	Ljava/lang/String;
    //   526: invokespecial 1200	com/ireadercity/b2/ui/AIReaderActivity:b	(Ljava/lang/String;)Z
    //   529: pop
    //   530: aload_0
    //   531: invokestatic 1203	com/ireadercity/b2/a:b	(Landroid/app/Activity;)V
    //   534: aload_0
    //   535: new 1205	com/ireadercity/b2/b/c
    //   538: dup
    //   539: invokespecial 1206	com/ireadercity/b2/b/c:<init>	()V
    //   542: putfield 735	com/ireadercity/b2/ui/AIReaderActivity:u	Lcom/ireadercity/b2/b/c;
    //   545: aload_0
    //   546: new 330	java/util/ArrayList
    //   549: dup
    //   550: invokespecial 331	java/util/ArrayList:<init>	()V
    //   553: putfield 564	com/ireadercity/b2/ui/AIReaderActivity:q	Ljava/util/List;
    //   556: aload_0
    //   557: new 330	java/util/ArrayList
    //   560: dup
    //   561: invokespecial 331	java/util/ArrayList:<init>	()V
    //   564: putfield 469	com/ireadercity/b2/ui/AIReaderActivity:p	Ljava/util/List;
    //   567: aload_0
    //   568: new 330	java/util/ArrayList
    //   571: dup
    //   572: invokespecial 331	java/util/ArrayList:<init>	()V
    //   575: putfield 556	com/ireadercity/b2/ui/AIReaderActivity:o	Ljava/util/List;
    //   578: aload_0
    //   579: new 611	com/ireadercity/b2/a/r
    //   582: dup
    //   583: aload_0
    //   584: aload_0
    //   585: getfield 469	com/ireadercity/b2/ui/AIReaderActivity:p	Ljava/util/List;
    //   588: aload_0
    //   589: getfield 564	com/ireadercity/b2/ui/AIReaderActivity:q	Ljava/util/List;
    //   592: aload_0
    //   593: invokevirtual 763	com/ireadercity/b2/ui/AIReaderActivity:getLayoutInflater	()Landroid/view/LayoutInflater;
    //   596: invokespecial 1209	com/ireadercity/b2/a/r:<init>	(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;Landroid/view/LayoutInflater;)V
    //   599: putfield 609	com/ireadercity/b2/ui/AIReaderActivity:t	Lcom/ireadercity/b2/a/r;
    //   602: aload_0
    //   603: new 1211	com/ireadercity/b2/ui/a
    //   606: dup
    //   607: aload_0
    //   608: invokespecial 1212	com/ireadercity/b2/ui/a:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   611: putfield 730	com/ireadercity/b2/ui/AIReaderActivity:E	Landroid/view/View$OnClickListener;
    //   614: aload_0
    //   615: new 1214	com/ireadercity/b2/ui/n
    //   618: dup
    //   619: aload_0
    //   620: invokespecial 1215	com/ireadercity/b2/ui/n:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   623: putfield 725	com/ireadercity/b2/ui/AIReaderActivity:F	Landroid/view/View$OnClickListener;
    //   626: aload_0
    //   627: aload_0
    //   628: ldc_w 1216
    //   631: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   634: checkcast 636	android/widget/LinearLayout
    //   637: putfield 1219	com/ireadercity/b2/ui/AIReaderActivity:H	Landroid/widget/LinearLayout;
    //   640: aload_0
    //   641: aload_0
    //   642: ldc_w 1220
    //   645: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   648: checkcast 625	android/widget/RelativeLayout
    //   651: putfield 1222	com/ireadercity/b2/ui/AIReaderActivity:I	Landroid/widget/RelativeLayout;
    //   654: aload_0
    //   655: aload_0
    //   656: ldc_w 1223
    //   659: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   662: checkcast 644	android/widget/ImageButton
    //   665: putfield 1225	com/ireadercity/b2/ui/AIReaderActivity:h	Landroid/widget/ImageButton;
    //   668: aload_0
    //   669: aload_0
    //   670: ldc_w 1226
    //   673: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   676: checkcast 620	android/widget/Button
    //   679: putfield 1228	com/ireadercity/b2/ui/AIReaderActivity:k	Landroid/widget/Button;
    //   682: aload_0
    //   683: aload_0
    //   684: ldc_w 1229
    //   687: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   690: checkcast 620	android/widget/Button
    //   693: putfield 1231	com/ireadercity/b2/ui/AIReaderActivity:j	Landroid/widget/Button;
    //   696: aload_0
    //   697: aload_0
    //   698: ldc_w 1232
    //   701: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   704: checkcast 620	android/widget/Button
    //   707: putfield 616	com/ireadercity/b2/ui/AIReaderActivity:i	Landroid/widget/Button;
    //   710: aload_0
    //   711: getfield 1228	com/ireadercity/b2/ui/AIReaderActivity:k	Landroid/widget/Button;
    //   714: new 1234	com/ireadercity/b2/ui/y
    //   717: dup
    //   718: aload_0
    //   719: invokespecial 1235	com/ireadercity/b2/ui/y:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   722: invokevirtual 1239	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   725: aload_0
    //   726: getfield 1231	com/ireadercity/b2/ui/AIReaderActivity:j	Landroid/widget/Button;
    //   729: new 1241	com/ireadercity/b2/ui/af
    //   732: dup
    //   733: aload_0
    //   734: invokespecial 1242	com/ireadercity/b2/ui/af:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   737: invokevirtual 1239	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   740: aload_0
    //   741: getfield 616	com/ireadercity/b2/ui/AIReaderActivity:i	Landroid/widget/Button;
    //   744: new 1244	com/ireadercity/b2/ui/ag
    //   747: dup
    //   748: aload_0
    //   749: invokespecial 1245	com/ireadercity/b2/ui/ag:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   752: invokevirtual 1239	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   755: aload_0
    //   756: aload_0
    //   757: ldc_w 1246
    //   760: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   763: checkcast 1248	android/widget/ListView
    //   766: putfield 722	com/ireadercity/b2/ui/AIReaderActivity:s	Landroid/widget/ListView;
    //   769: aload_0
    //   770: aload_0
    //   771: ldc_w 1249
    //   774: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   777: checkcast 644	android/widget/ImageButton
    //   780: putfield 641	com/ireadercity/b2/ui/AIReaderActivity:g	Landroid/widget/ImageButton;
    //   783: aload_0
    //   784: getfield 641	com/ireadercity/b2/ui/AIReaderActivity:g	Landroid/widget/ImageButton;
    //   787: new 1251	com/ireadercity/b2/ui/ah
    //   790: dup
    //   791: aload_0
    //   792: invokespecial 1252	com/ireadercity/b2/ui/ah:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   795: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   798: aload_0
    //   799: aload_0
    //   800: ldc_w 1254
    //   803: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   806: checkcast 644	android/widget/ImageButton
    //   809: putfield 1256	com/ireadercity/b2/ui/AIReaderActivity:M	Landroid/widget/ImageButton;
    //   812: aload_0
    //   813: getfield 1256	com/ireadercity/b2/ui/AIReaderActivity:M	Landroid/widget/ImageButton;
    //   816: new 1258	com/ireadercity/b2/ui/ai
    //   819: dup
    //   820: aload_0
    //   821: invokespecial 1259	com/ireadercity/b2/ui/ai:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   824: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   827: aload_0
    //   828: aload_0
    //   829: ldc_w 1260
    //   832: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   835: checkcast 644	android/widget/ImageButton
    //   838: putfield 728	com/ireadercity/b2/ui/AIReaderActivity:L	Landroid/widget/ImageButton;
    //   841: aload_0
    //   842: getfield 728	com/ireadercity/b2/ui/AIReaderActivity:L	Landroid/widget/ImageButton;
    //   845: new 1262	com/ireadercity/b2/ui/aj
    //   848: dup
    //   849: aload_0
    //   850: invokespecial 1263	com/ireadercity/b2/ui/aj:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   853: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   856: aload_0
    //   857: aload_0
    //   858: ldc_w 1264
    //   861: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   864: checkcast 644	android/widget/ImageButton
    //   867: putfield 1266	com/ireadercity/b2/ui/AIReaderActivity:N	Landroid/widget/ImageButton;
    //   870: aload_0
    //   871: getfield 1266	com/ireadercity/b2/ui/AIReaderActivity:N	Landroid/widget/ImageButton;
    //   874: new 1268	com/ireadercity/b2/ui/ak
    //   877: dup
    //   878: aload_0
    //   879: invokespecial 1269	com/ireadercity/b2/ui/ak:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   882: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   885: aload_0
    //   886: aload_0
    //   887: ldc_w 1270
    //   890: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   893: checkcast 368	android/widget/TextView
    //   896: putfield 1272	com/ireadercity/b2/ui/AIReaderActivity:l	Landroid/widget/TextView;
    //   899: aload_0
    //   900: aload_0
    //   901: ldc_w 1273
    //   904: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   907: checkcast 625	android/widget/RelativeLayout
    //   910: putfield 623	com/ireadercity/b2/ui/AIReaderActivity:Q	Landroid/widget/RelativeLayout;
    //   913: aload_0
    //   914: aload_0
    //   915: ldc_w 1274
    //   918: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   921: checkcast 636	android/widget/LinearLayout
    //   924: putfield 634	com/ireadercity/b2/ui/AIReaderActivity:R	Landroid/widget/LinearLayout;
    //   927: aload_0
    //   928: aload_0
    //   929: ldc_w 1275
    //   932: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   935: checkcast 644	android/widget/ImageButton
    //   938: putfield 1277	com/ireadercity/b2/ui/AIReaderActivity:K	Landroid/widget/ImageButton;
    //   941: aload_0
    //   942: aload_0
    //   943: ldc_w 1278
    //   946: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   949: checkcast 644	android/widget/ImageButton
    //   952: putfield 1280	com/ireadercity/b2/ui/AIReaderActivity:e	Landroid/widget/ImageButton;
    //   955: aload_0
    //   956: getfield 1219	com/ireadercity/b2/ui/AIReaderActivity:H	Landroid/widget/LinearLayout;
    //   959: aload_0
    //   960: getfield 1282	com/ireadercity/b2/ui/AIReaderActivity:m	I
    //   963: invokevirtual 1285	android/widget/LinearLayout:setMinimumHeight	(I)V
    //   966: aload_0
    //   967: getfield 1222	com/ireadercity/b2/ui/AIReaderActivity:I	Landroid/widget/RelativeLayout;
    //   970: aload_0
    //   971: getfield 1282	com/ireadercity/b2/ui/AIReaderActivity:m	I
    //   974: invokevirtual 1286	android/widget/RelativeLayout:setMinimumHeight	(I)V
    //   977: aload_0
    //   978: aload_0
    //   979: ldc_w 1287
    //   982: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   985: checkcast 644	android/widget/ImageButton
    //   988: putfield 1289	com/ireadercity/b2/ui/AIReaderActivity:J	Landroid/widget/ImageButton;
    //   991: aload_0
    //   992: aload_0
    //   993: ldc_w 1290
    //   996: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   999: checkcast 1292	android/widget/ImageView
    //   1002: putfield 562	com/ireadercity/b2/ui/AIReaderActivity:G	Landroid/widget/ImageView;
    //   1005: aload_0
    //   1006: aload_0
    //   1007: ldc_w 1293
    //   1010: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   1013: checkcast 368	android/widget/TextView
    //   1016: putfield 744	com/ireadercity/b2/ui/AIReaderActivity:O	Landroid/widget/TextView;
    //   1019: aload_0
    //   1020: aload_0
    //   1021: ldc_w 1294
    //   1024: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   1027: putfield 741	com/ireadercity/b2/ui/AIReaderActivity:P	Landroid/view/View;
    //   1030: aload_0
    //   1031: invokevirtual 545	com/ireadercity/b2/ui/AIReaderActivity:getApplicationContext	()Landroid/content/Context;
    //   1034: ldc_w 1296
    //   1037: invokestatic 1301	com/ireadercity/b2/h/s:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   1040: ifeq +19 -> 1059
    //   1043: aload_0
    //   1044: getfield 562	com/ireadercity/b2/ui/AIReaderActivity:G	Landroid/widget/ImageView;
    //   1047: iconst_0
    //   1048: invokevirtual 1302	android/widget/ImageView:setVisibility	(I)V
    //   1051: aload_0
    //   1052: getfield 562	com/ireadercity/b2/ui/AIReaderActivity:G	Landroid/widget/ImageView;
    //   1055: invokevirtual 1305	android/widget/ImageView:requestFocus	()Z
    //   1058: pop
    //   1059: aload_0
    //   1060: getfield 562	com/ireadercity/b2/ui/AIReaderActivity:G	Landroid/widget/ImageView;
    //   1063: new 1307	com/ireadercity/b2/ui/b
    //   1066: dup
    //   1067: aload_0
    //   1068: invokespecial 1308	com/ireadercity/b2/ui/b:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   1071: invokevirtual 1309	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1074: aload_0
    //   1075: invokevirtual 545	com/ireadercity/b2/ui/AIReaderActivity:getApplicationContext	()Landroid/content/Context;
    //   1078: invokestatic 1313	com/ireadercity/b2/bean/l:a	(Landroid/content/Context;)V
    //   1081: aload_0
    //   1082: getfield 1289	com/ireadercity/b2/ui/AIReaderActivity:J	Landroid/widget/ImageButton;
    //   1085: new 1315	com/ireadercity/b2/ui/c
    //   1088: dup
    //   1089: aload_0
    //   1090: invokespecial 1316	com/ireadercity/b2/ui/c:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   1093: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1096: aload_0
    //   1097: getfield 1280	com/ireadercity/b2/ui/AIReaderActivity:e	Landroid/widget/ImageButton;
    //   1100: new 1318	com/ireadercity/b2/ui/d
    //   1103: dup
    //   1104: aload_0
    //   1105: invokespecial 1319	com/ireadercity/b2/ui/d:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   1108: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1111: aload_0
    //   1112: getfield 1277	com/ireadercity/b2/ui/AIReaderActivity:K	Landroid/widget/ImageButton;
    //   1115: new 1321	com/ireadercity/b2/ui/g
    //   1118: dup
    //   1119: aload_0
    //   1120: invokespecial 1322	com/ireadercity/b2/ui/g:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   1123: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1126: aload_0
    //   1127: getfield 1225	com/ireadercity/b2/ui/AIReaderActivity:h	Landroid/widget/ImageButton;
    //   1130: new 1324	com/ireadercity/b2/ui/h
    //   1133: dup
    //   1134: aload_0
    //   1135: invokespecial 1325	com/ireadercity/b2/ui/h:<init>	(Lcom/ireadercity/b2/ui/AIReaderActivity;)V
    //   1138: invokevirtual 1253	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1141: aload_0
    //   1142: aload_0
    //   1143: ldc_w 1326
    //   1146: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   1149: putfield 1328	com/ireadercity/b2/ui/AIReaderActivity:d	Landroid/view/View;
    //   1152: aload_0
    //   1153: getfield 1328	com/ireadercity/b2/ui/AIReaderActivity:d	Landroid/view/View;
    //   1156: bipush 8
    //   1158: invokevirtual 1329	android/view/View:setVisibility	(I)V
    //   1161: aload_0
    //   1162: aload_0
    //   1163: ldc_w 1330
    //   1166: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   1169: putfield 1332	com/ireadercity/b2/ui/AIReaderActivity:c	Landroid/view/View;
    //   1172: aload_0
    //   1173: getfield 722	com/ireadercity/b2/ui/AIReaderActivity:s	Landroid/widget/ListView;
    //   1176: aload_0
    //   1177: getfield 609	com/ireadercity/b2/ui/AIReaderActivity:t	Lcom/ireadercity/b2/a/r;
    //   1180: invokevirtual 1336	android/widget/ListView:setAdapter	(Landroid/widget/ListAdapter;)V
    //   1183: aload_0
    //   1184: invokevirtual 545	com/ireadercity/b2/ui/AIReaderActivity:getApplicationContext	()Landroid/content/Context;
    //   1187: invokestatic 1338	com/ireadercity/b2/h/y:e	(Landroid/content/Context;)V
    //   1190: getstatic 1109	com/ireadercity/b2/a:i	Z
    //   1193: ifeq +7 -> 1200
    //   1196: aload_0
    //   1197: invokespecial 1340	com/ireadercity/b2/ui/AIReaderActivity:i	()V
    //   1200: getstatic 681	com/ireadercity/b2/a:au	Z
    //   1203: ifeq -865 -> 338
    //   1206: aload_0
    //   1207: ldc_w 1341
    //   1210: invokevirtual 1217	com/ireadercity/b2/ui/AIReaderActivity:findViewById	(I)Landroid/view/View;
    //   1213: checkcast 625	android/widget/RelativeLayout
    //   1216: astore_1
    //   1217: aload_0
    //   1218: ldc_w 1342
    //   1221: aconst_null
    //   1222: invokestatic 1345	android/widget/LinearLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   1225: astore 6
    //   1227: new 1347	com/umeng/newxp/controller/ExchangeDataService
    //   1230: dup
    //   1231: getstatic 690	com/ireadercity/b2/a:c	Ljava/lang/String;
    //   1234: invokespecial 1348	com/umeng/newxp/controller/ExchangeDataService:<init>	(Ljava/lang/String;)V
    //   1237: astore 7
    //   1239: aload 6
    //   1241: ldc_w 1349
    //   1244: invokevirtual 366	android/view/View:findViewById	(I)Landroid/view/View;
    //   1247: checkcast 625	android/widget/RelativeLayout
    //   1250: astore 8
    //   1252: new 1351	com/umeng/newxp/view/ExchangeViewManager
    //   1255: dup
    //   1256: aload_0
    //   1257: aload 7
    //   1259: invokespecial 1354	com/umeng/newxp/view/ExchangeViewManager:<init>	(Landroid/content/Context;Lcom/umeng/newxp/controller/ExchangeDataService;)V
    //   1262: bipush 7
    //   1264: aload 8
    //   1266: iconst_0
    //   1267: anewarray 1356	android/graphics/drawable/Drawable
    //   1270: invokevirtual 1360	com/umeng/newxp/view/ExchangeViewManager:addView	(ILandroid/view/View;[Landroid/graphics/drawable/Drawable;)V
    //   1273: aload_1
    //   1274: aload 6
    //   1276: invokevirtual 1362	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   1279: goto -941 -> 338
    //   1282: astore 7
    //   1284: aload_1
    //   1285: astore 6
    //   1287: aload 7
    //   1289: astore_1
    //   1290: goto -816 -> 474
    //   1293: astore 7
    //   1295: goto -855 -> 440
    //   1298: astore 7
    //   1300: goto -894 -> 406
    //   1303: astore 7
    //   1305: goto -933 -> 372
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1308	0	this	AIReaderActivity
    //   0	1308	1	paramBundle	android.os.Bundle
    //   15	19	2	l1	long
    //   25	3	4	l2	long
    //   174	306	6	localObject1	Object
    //   486	3	6	localIOException1	java.io.IOException
    //   1225	61	6	localObject2	Object
    //   1	1	7	localObject3	Object
    //   367	9	7	localFileNotFoundException1	java.io.FileNotFoundException
    //   401	9	7	localIOException2	java.io.IOException
    //   435	36	7	localClassNotFoundException1	ClassNotFoundException
    //   1237	21	7	localExchangeDataService	com.umeng.newxp.controller.ExchangeDataService
    //   1282	6	7	localObject4	Object
    //   1293	1	7	localClassNotFoundException2	ClassNotFoundException
    //   1298	1	7	localIOException3	java.io.IOException
    //   1303	1	7	localFileNotFoundException2	java.io.FileNotFoundException
    //   1250	15	8	localRelativeLayout	RelativeLayout
    // Exception table:
    //   from	to	target	type
    //   16	27	343	java/lang/NumberFormatException
    //   92	96	351	java/lang/Exception
    //   190	195	359	java/io/IOException
    //   96	138	367	java/io/FileNotFoundException
    //   138	176	367	java/io/FileNotFoundException
    //   385	390	393	java/io/IOException
    //   96	138	401	java/io/IOException
    //   138	176	401	java/io/IOException
    //   419	424	427	java/io/IOException
    //   96	138	435	java/lang/ClassNotFoundException
    //   138	176	435	java/lang/ClassNotFoundException
    //   453	458	461	java/io/IOException
    //   96	138	469	finally
    //   138	176	469	finally
    //   479	484	486	java/io/IOException
    //   179	190	1282	finally
    //   375	380	1282	finally
    //   409	414	1282	finally
    //   443	448	1282	finally
    //   179	190	1293	java/lang/ClassNotFoundException
    //   179	190	1298	java/io/IOException
    //   179	190	1303	java/io/FileNotFoundException
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    this.C = paramView.getTag();
    if (this.C == null) {}
    do
    {
      do
      {
        return;
        if (!(this.C instanceof com.ireadercity.b2.bean.b)) {
          break;
        }
        paramView = (com.ireadercity.b2.bean.b)this.C;
        new StringBuilder("contextMenuItem is book ").append(paramView.k()).toString();
      } while (paramView.c());
      paramContextMenu.setHeaderTitle(paramView.k());
      paramContextMenu.add(0, 0, 0, "阅读");
      paramContextMenu.add(0, 1, 1, "评分/评论");
      paramContextMenu.add(0, 2, 2, "删除此书");
      if (this.b > 0)
      {
        paramContextMenu.add(0, 4, 4, "移动到顶层");
        paramContextMenu.add(0, 5, 5, "移到其他分类");
      }
      for (;;)
      {
        paramContextMenu.add(0, 6, 6, "分享本书");
        return;
        paramContextMenu.add(0, 3, 3, "添加到分类");
      }
    } while (!(this.C instanceof f));
    paramContextMenu.setHeaderTitle(((f)this.C).c());
    paramContextMenu.add(0, 0, 0, "打开");
    paramContextMenu.add(0, 1, 1, "删除此类(不删除书籍)");
    paramContextMenu.add(0, 2, 2, "删除此类(包括书籍)");
    paramContextMenu.add(0, 3, 3, "添加分类");
    paramContextMenu.add(0, 4, 4, "重命名");
  }
  
  protected void onDestroy()
  {
    new StringBuilder().append(System.currentTimeMillis()).toString();
    try
    {
      com.ireadercity.b2.b.q.a(com.ireadercity.b2.a.w, System.currentTimeMillis());
      super.onDestroy();
      new Thread(new j(this)).start();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (com.ireadercity.b2.h.w.c()) {}
    do
    {
      do
      {
        return true;
      } while (com.ireadercity.b2.h.w.d());
      if ((paramInt != 4) || (paramKeyEvent.getRepeatCount() != 0)) {
        break;
      }
      if (this.G.getVisibility() == 0)
      {
        this.G.setVisibility(8);
        return false;
      }
    } while (h());
    if (this.b > 0)
    {
      paramKeyEvent = this.t;
      com.ireadercity.b2.a.r.f();
      return true;
    }
    paramKeyEvent = new AlertDialog.Builder(this);
    paramKeyEvent.setTitle(2131230839);
    paramKeyEvent.setMessage(2131230840);
    paramKeyEvent.setPositiveButton(2131230844, new s(this));
    paramKeyEvent.setNegativeButton(2131230845, new t(this));
    paramKeyEvent.show();
    return false;
    return false;
  }
  
  protected void onPause()
  {
    super.onPause();
    try
    {
      h();
      new Thread(new i(this)).start();
      if (com.ireadercity.b2.a.i) {
        MobclickAgent.onPause(this);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    for (;;)
    {
      try
      {
        if (this.b > 0)
        {
          this.l.setText(this.D.c());
          this.g.setClickable(true);
          this.g.setImageResource(2130837713);
          com.ireadercity.b2.a.a(getApplicationContext());
          y.c(this);
          y.e(getApplicationContext());
        }
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        continue;
      }
      try
      {
        if (com.ireadercity.b2.a.i) {
          MobclickAgent.onResume(this);
        }
        return;
      }
      catch (Exception localException2) {}
      this.l.setText("我的书库");
      this.g.setClickable(false);
      this.g.setImageResource(2130837748);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      if (this.b > 0) {
        break label54;
      }
      a(true);
    }
    for (;;)
    {
      if (com.ireadercity.b2.a.aq)
      {
        com.ireadercity.b2.a.aq = false;
        startActivity(new Intent(this, BookInfoActivity.class));
      }
      return;
      label54:
      if (this.D != null) {
        this.t.a(this.D);
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    com.ireadercity.b2.h.w.c();
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\AIReaderActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */