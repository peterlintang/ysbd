package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import com.ireadercity.b2.a.l;
import com.ireadercity.b2.b.n;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.e;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.store.CloudStoreBaseActivity;
import com.ireadercity.b2.ui.widget.SegmentedRadioGroup;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class SyncCloudInfoActivity
  extends CloudStoreBaseActivity
{
  public static String b = "SyncCloudInfoActivity";
  List<e> a = new ArrayList();
  private ImageButton c;
  private ImageButton d;
  private ListView e;
  private SegmentedRadioGroup f;
  private l g;
  
  /* Error */
  public static List<e> a(String paramString)
  {
    // Byte code:
    //   0: new 30	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 31	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: invokestatic 48	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   12: ifeq +5 -> 17
    //   15: aload_2
    //   16: areturn
    //   17: new 50	org/json/JSONObject
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 53	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   25: ldc 55
    //   27: invokevirtual 59	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   30: astore_0
    //   31: iconst_0
    //   32: istore_1
    //   33: iload_1
    //   34: aload_0
    //   35: invokevirtual 65	org/json/JSONArray:length	()I
    //   38: if_icmpge +165 -> 203
    //   41: aload_0
    //   42: iload_1
    //   43: invokevirtual 69	org/json/JSONArray:opt	(I)Ljava/lang/Object;
    //   46: checkcast 50	org/json/JSONObject
    //   49: astore_3
    //   50: new 71	com/ireadercity/b2/bean/e
    //   53: dup
    //   54: invokespecial 72	com/ireadercity/b2/bean/e:<init>	()V
    //   57: astore 4
    //   59: aload 4
    //   61: aload_3
    //   62: ldc 74
    //   64: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   67: putfield 80	com/ireadercity/b2/bean/e:a	Ljava/lang/String;
    //   70: aload 4
    //   72: aload_3
    //   73: ldc 82
    //   75: invokevirtual 86	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   78: putfield 89	com/ireadercity/b2/bean/e:b	I
    //   81: aload 4
    //   83: aload_3
    //   84: ldc 91
    //   86: invokevirtual 95	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   89: d2f
    //   90: putfield 98	com/ireadercity/b2/bean/e:c	F
    //   93: aload 4
    //   95: aload_3
    //   96: ldc 100
    //   98: invokevirtual 95	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   101: d2f
    //   102: putfield 102	com/ireadercity/b2/bean/e:d	F
    //   105: aload 4
    //   107: aload_3
    //   108: ldc 104
    //   110: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   113: putfield 106	com/ireadercity/b2/bean/e:e	Ljava/lang/String;
    //   116: aload 4
    //   118: aload_3
    //   119: ldc 108
    //   121: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   124: putfield 110	com/ireadercity/b2/bean/e:f	Ljava/lang/String;
    //   127: aload 4
    //   129: aload_3
    //   130: ldc 112
    //   132: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   135: putfield 114	com/ireadercity/b2/bean/e:g	Ljava/lang/String;
    //   138: aload 4
    //   140: aload_3
    //   141: ldc 116
    //   143: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   146: putfield 119	com/ireadercity/b2/bean/e:h	Ljava/lang/String;
    //   149: aload 4
    //   151: aload_3
    //   152: ldc 121
    //   154: invokevirtual 125	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   157: putfield 129	com/ireadercity/b2/bean/e:i	J
    //   160: aload 4
    //   162: aload_3
    //   163: ldc 91
    //   165: invokevirtual 86	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   168: putfield 132	com/ireadercity/b2/bean/e:j	I
    //   171: aload 4
    //   173: aload_3
    //   174: ldc -122
    //   176: invokevirtual 78	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   179: putfield 137	com/ireadercity/b2/bean/e:k	Ljava/lang/String;
    //   182: aload_2
    //   183: aload 4
    //   185: invokeinterface 143 2 0
    //   190: pop
    //   191: iload_1
    //   192: iconst_1
    //   193: iadd
    //   194: istore_1
    //   195: goto -162 -> 33
    //   198: astore_0
    //   199: aload_0
    //   200: invokevirtual 146	org/json/JSONException:printStackTrace	()V
    //   203: getstatic 24	com/ireadercity/b2/ui/SyncCloudInfoActivity:b	Ljava/lang/String;
    //   206: astore_0
    //   207: new 148	java/lang/StringBuilder
    //   210: dup
    //   211: ldc -106
    //   213: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: aload_2
    //   217: invokeinterface 154 1 0
    //   222: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   225: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: pop
    //   229: aload_2
    //   230: areturn
    //   231: astore_0
    //   232: aload_0
    //   233: invokevirtual 163	java/lang/NullPointerException:printStackTrace	()V
    //   236: goto -33 -> 203
    //   239: astore_0
    //   240: aload_0
    //   241: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   244: goto -41 -> 203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramString	String
    //   32	163	1	i	int
    //   7	223	2	localArrayList	ArrayList
    //   49	125	3	localJSONObject	JSONObject
    //   57	127	4	locale	e
    // Exception table:
    //   from	to	target	type
    //   17	31	198	org/json/JSONException
    //   33	191	198	org/json/JSONException
    //   17	31	231	java/lang/NullPointerException
    //   33	191	231	java/lang/NullPointerException
    //   17	31	239	java/lang/Exception
    //   33	191	239	java/lang/Exception
  }
  
  public static List<e> a(List<e> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      e locale = (e)paramList.next();
      String str = locale.k.substring(locale.k.lastIndexOf('/') + 1, locale.k.length());
      if (!new File(com.ireadercity.b2.a.l + "/" + str).exists()) {
        localArrayList.add(locale);
      }
    }
    return localArrayList;
  }
  
  public static void a(b paramb, e parame, com.ireadercity.b2.c.a parama)
  {
    String str = b;
    new StringBuilder("foundProgress! title=").append(parame.f).append(" id=").append(parame.a).toString();
    if (paramb.y())
    {
      parama.b(paramb.j(), parame.b, parame.c);
      parama.a(paramb.j(), parame.b);
      parama = b;
      new StringBuilder("updateBookLastReadingChapter=").append(parame.b).append(" perInChapter.progress=").append(parame.c).append(" localBook=").append(paramb.k()).toString();
    }
    do
    {
      long l1;
      do
      {
        return;
        if (!paramb.z()) {
          break;
        }
        if (paramb.h() == 0) {
          paramb.c(com.ireadercity.b2.a.T);
        }
        long l2 = Long.parseLong(paramb.v()) / (paramb.h() * 1024);
        l1 = l2;
        if (Long.parseLong(paramb.v()) % (paramb.h() * 1024) != 0L) {
          l1 = l2 + 1L;
        }
      } while (l1 <= 0L);
      float f1 = parame.d / 100.0F / (1.0F / (float)l1);
      int i = (int)f1;
      f1 -= i;
      parama.a(paramb.j(), i, f1 * 100.0F);
      parama.a(paramb.j(), i);
      parame = b;
      new StringBuilder("updateBookLastReadingChapter=").append(i).append(" progressOnThisChapter=").append(f1 * 100.0F).append(" localBook=").append(paramb.k()).toString();
      return;
    } while (!paramb.A());
    str = b;
    new StringBuilder("PDF:chapter=").append(parame.b).toString();
    parama.a(paramb.j(), parame.b);
    parame.d = parame.c;
  }
  
  private String c()
  {
    int j = 0;
    Object localObject1 = Long.valueOf(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getLong("lastSyncProgressTime", 0L));
    Object localObject2 = b;
    new StringBuilder().append(new Date(((Long)localObject1).longValue()).toLocaleString()).toString();
    localObject2 = com.ireadercity.b2.c.a.a(this);
    Object localObject3 = ((com.ireadercity.b2.c.a)localObject2).a(((Long)localObject1).longValue());
    localObject1 = new JSONArray();
    int i = 0;
    float f1;
    if (i < ((List)localObject3).size()) {
      for (;;)
      {
        Object localObject4;
        try
        {
          b localb = (b)((List)localObject3).get(i);
          if (localb.e() == 0) {
            break label639;
          }
          localObject4 = new NetBookInfo();
          ((NetBookInfo)localObject4).k(localb.l());
          localb.d(((NetBookInfo)localObject4).d());
          if (y.d(localb.i())) {
            break label639;
          }
          localObject4 = new JSONObject();
          ((JSONObject)localObject4).put("bookid", localb.i());
          ((JSONObject)localObject4).put("lastReadDate", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(Long.parseLong(localb.f()))));
          if (localb.y())
          {
            ((JSONObject)localObject4).put("chapter", localb.e());
            ((JSONObject)localObject4).put("perInChapter", localb.b() * 100.0F);
            ((JSONObject)localObject4).put("totalPercent", (localb.e() + localb.b()) / localb.h() * 100.0F);
            ((JSONArray)localObject1).put(localObject4);
          }
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
        }
        HashMap localHashMap;
        if (localException2.z())
        {
          String str = b;
          new StringBuilder("TXTgetLastReadingChapter=").append(localException2.e()).toString();
          ((JSONObject)localObject4).put("chapter", localException2.e());
          ((JSONObject)localObject4).put("totalPercent", localException2.b() * 100.0F);
          localHashMap = ((com.ireadercity.b2.c.a)localObject2).b(localException2.j(), localException2.e());
          if (localHashMap == null) {
            break;
          }
          f1 = Float.parseFloat((String)localHashMap.get("progress"));
          label417:
          ((JSONObject)localObject4).put("perInChapter", f1);
        }
        else
        {
          int k = n.a().a(localHashMap);
          ((JSONObject)localObject4).put("chapter", localHashMap.e());
          ((JSONObject)localObject4).put("perInChapter", localHashMap.e() / k * 100.0F);
          ((JSONObject)localObject4).put("totalPercent", k);
        }
      }
    }
    localObject2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("DeleteSyncIDs", "").split(";");
    i = j;
    for (;;)
    {
      if (i < localObject2.length) {
        try
        {
          if (y.d(localObject2[i])) {
            break label646;
          }
          localObject3 = new JSONObject();
          ((JSONObject)localObject3).put("bookid", localObject2[i]);
          ((JSONObject)localObject3).put("chapter", -1);
          ((JSONObject)localObject3).put("perInChapter", -1);
          ((JSONObject)localObject3).put("totalPercent", -1);
          ((JSONObject)localObject3).put("lastReadDate", "");
          ((JSONArray)localObject1).put(localObject3);
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
        }
      }
      localObject2 = b;
      ((JSONArray)localObject1).toString();
      return ((JSONArray)localObject1).toString();
      f1 = 0.0F;
      break label417;
      label639:
      i += 1;
      break;
      label646:
      i += 1;
    }
  }
  
  private boolean d()
  {
    try
    {
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
      localEditor.putString("DeleteSyncIDs", "");
      localEditor.commit();
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public final void a()
  {
    Object localObject1 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("userName", null);
    Object localObject2 = b;
    new StringBuilder("preCheckUser userName=").append((String)localObject1).toString();
    if (localObject1 == null)
    {
      localObject1 = getLayoutInflater().inflate(2130903051, null);
      localObject2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
      new AlertDialog.Builder(this).setTitle(getResources().getText(2131230901)).setView((View)localObject1).setPositiveButton(getResources().getText(2131230902), new gq(this, (View)localObject1)).setNeutralButton(getResources().getText(2131230904), new gp(this, (SharedPreferences)localObject2)).setNegativeButton(getResources().getText(2131230903), new go(this)).show();
      ((EditText)((View)localObject1).findViewById(2131361896)).requestFocus();
      return;
    }
    try
    {
      b();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void b()
  {
    String str = b;
    Object localObject = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    str = ((SharedPreferences)localObject).getString("userName", null);
    localObject = ((SharedPreferences)localObject).getString("password", null);
    new gr(this).execute(new String[] { str, localObject, c() });
  }
  
  public final void b(List<e> paramList)
  {
    this.a = paramList;
    this.g.a(paramList);
    this.g.notifyDataSetChanged();
  }
  
  public final void c(List<e> paramList)
  {
    this.g.a(paramList);
    this.g.notifyDataSetChanged();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903150);
    paramBundle = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    if (Long.valueOf(paramBundle.getLong("lastSyncProgressTime", 0L)).longValue() != 0L)
    {
      paramBundle = paramBundle.getString("lastSyncProgressResult", "");
      String str = b;
      new StringBuilder("CACHED strJsonStr=").append(paramBundle).toString();
      this.a = a(paramBundle);
    }
    this.g = new l(getApplicationContext());
    this.g.a(this);
    this.g.a(this.a);
    this.c = ((ImageButton)findViewById(2131361817));
    this.c.setOnClickListener(new gj(this));
    this.d = ((ImageButton)findViewById(2131362350));
    this.d.setOnClickListener(new gk(this));
    this.f = ((SegmentedRadioGroup)findViewById(2131362330));
    this.f.setOnCheckedChangeListener(new gn(this));
    this.e = ((ListView)findViewById(2131362351));
    this.e.setAdapter(this.g);
  }
  
  protected void onDestroy()
  {
    if (this.g != null) {
      this.g.a();
    }
    super.onDestroy();
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\SyncCloudInfoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */