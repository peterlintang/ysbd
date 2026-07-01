package com.ireadercity.b2.store;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.ireadercity.b2.a;
import com.ireadercity.b2.a.h;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.e.g;
import com.ireadercity.b2.h.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public final class ak
{
  public static final HashMap<Integer, ArrayList<NetBookInfo>> a = new HashMap();
  public static final HashMap<Integer, ListView> b = new HashMap();
  g c;
  Handler d = new am(this);
  private Activity e;
  private int f;
  private ListView g;
  private int h = 1;
  private List<NetBookInfo> i;
  private h j;
  private String k = null;
  private Toast l;
  private HashMap<Integer, Integer> m = new HashMap();
  
  public ak(Activity paramActivity, ListView paramListView, int paramInt)
  {
    this.e = paramActivity;
    this.f = paramInt;
    this.g = paramListView;
  }
  
  public ak(Activity paramActivity, ListView paramListView, String paramString)
  {
    this.e = paramActivity;
    this.f = 41;
    this.g = paramListView;
    this.k = paramString;
  }
  
  /* Error */
  public static List<NetBookInfo> b(String paramString)
  {
    // Byte code:
    //   0: new 134	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 135	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: ifnonnull +5 -> 14
    //   12: aload_2
    //   13: areturn
    //   14: new 137	org/json/JSONObject
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 138	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   22: ldc -116
    //   24: invokevirtual 144	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   27: astore_0
    //   28: iconst_0
    //   29: istore_1
    //   30: iload_1
    //   31: aload_0
    //   32: invokevirtual 150	org/json/JSONArray:length	()I
    //   35: if_icmpge +286 -> 321
    //   38: aload_0
    //   39: iload_1
    //   40: invokevirtual 154	org/json/JSONArray:opt	(I)Ljava/lang/Object;
    //   43: checkcast 137	org/json/JSONObject
    //   46: astore 4
    //   48: new 76	com/ireadercity/b2/bean/NetBookInfo
    //   51: dup
    //   52: invokespecial 155	com/ireadercity/b2/bean/NetBookInfo:<init>	()V
    //   55: astore_3
    //   56: aload 4
    //   58: ldc -99
    //   60: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   63: pop
    //   64: aload_3
    //   65: aload 4
    //   67: ldc -93
    //   69: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   72: invokevirtual 165	com/ireadercity/b2/bean/NetBookInfo:d	(Ljava/lang/String;)V
    //   75: aload_3
    //   76: aload 4
    //   78: ldc -89
    //   80: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   83: invokestatic 173	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   86: invokevirtual 176	com/ireadercity/b2/bean/NetBookInfo:a	(F)V
    //   89: aload_3
    //   90: aload 4
    //   92: ldc -78
    //   94: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   97: invokevirtual 180	com/ireadercity/b2/bean/NetBookInfo:f	(Ljava/lang/String;)V
    //   100: aload_3
    //   101: aload 4
    //   103: ldc -74
    //   105: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual 184	com/ireadercity/b2/bean/NetBookInfo:c	(Ljava/lang/String;)V
    //   111: aload_3
    //   112: aload 4
    //   114: ldc -99
    //   116: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual 186	com/ireadercity/b2/bean/NetBookInfo:j	(Ljava/lang/String;)V
    //   122: aload_3
    //   123: aload 4
    //   125: ldc -68
    //   127: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   130: invokevirtual 190	com/ireadercity/b2/bean/NetBookInfo:a	(Ljava/lang/String;)V
    //   133: aload_3
    //   134: aload 4
    //   136: ldc -64
    //   138: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokevirtual 194	com/ireadercity/b2/bean/NetBookInfo:e	(Ljava/lang/String;)V
    //   144: aload_3
    //   145: aload 4
    //   147: ldc -60
    //   149: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   152: invokevirtual 198	com/ireadercity/b2/bean/NetBookInfo:h	(Ljava/lang/String;)V
    //   155: aload_3
    //   156: aload 4
    //   158: ldc -56
    //   160: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   163: invokestatic 204	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   166: invokevirtual 207	com/ireadercity/b2/bean/NetBookInfo:a	(I)V
    //   169: aload_3
    //   170: aload 4
    //   172: ldc -47
    //   174: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   177: invokestatic 204	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   180: i2l
    //   181: invokevirtual 212	com/ireadercity/b2/bean/NetBookInfo:a	(J)V
    //   184: aload_3
    //   185: aload 4
    //   187: ldc -42
    //   189: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   192: invokevirtual 216	com/ireadercity/b2/bean/NetBookInfo:b	(Ljava/lang/String;)V
    //   195: aload_3
    //   196: aload 4
    //   198: ldc -38
    //   200: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   203: invokevirtual 220	com/ireadercity/b2/bean/NetBookInfo:i	(Ljava/lang/String;)V
    //   206: aload_3
    //   207: aload 4
    //   209: ldc -34
    //   211: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   214: invokevirtual 224	com/ireadercity/b2/bean/NetBookInfo:g	(Ljava/lang/String;)V
    //   217: new 69	java/lang/StringBuilder
    //   220: dup
    //   221: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   224: getstatic 230	com/ireadercity/b2/a:p	Ljava/lang/String;
    //   227: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: ldc -24
    //   232: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: aload 4
    //   237: ldc -78
    //   239: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   242: aload 4
    //   244: ldc -78
    //   246: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   249: ldc -24
    //   251: invokevirtual 237	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   254: iconst_1
    //   255: iadd
    //   256: aload 4
    //   258: ldc -78
    //   260: invokevirtual 161	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   263: invokevirtual 238	java/lang/String:length	()I
    //   266: invokevirtual 242	java/lang/String:substring	(II)Ljava/lang/String;
    //   269: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: astore 4
    //   277: new 244	java/io/File
    //   280: dup
    //   281: aload 4
    //   283: invokespecial 245	java/io/File:<init>	(Ljava/lang/String;)V
    //   286: invokevirtual 249	java/io/File:exists	()Z
    //   289: ifeq +19 -> 308
    //   292: aload_3
    //   293: iconst_1
    //   294: invokevirtual 252	com/ireadercity/b2/bean/NetBookInfo:a	(Z)V
    //   297: aload_2
    //   298: aload_3
    //   299: invokeinterface 258 2 0
    //   304: pop
    //   305: goto +65 -> 370
    //   308: aload_3
    //   309: iconst_0
    //   310: invokevirtual 252	com/ireadercity/b2/bean/NetBookInfo:a	(Z)V
    //   313: goto -16 -> 297
    //   316: astore_0
    //   317: aload_0
    //   318: invokevirtual 261	org/json/JSONException:printStackTrace	()V
    //   321: new 69	java/lang/StringBuilder
    //   324: dup
    //   325: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   328: aload_2
    //   329: invokeinterface 264 1 0
    //   334: invokevirtual 267	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   337: ldc_w 269
    //   340: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: pop
    //   347: aload_2
    //   348: areturn
    //   349: astore_0
    //   350: aload_0
    //   351: invokevirtual 270	java/lang/NullPointerException:printStackTrace	()V
    //   354: goto -33 -> 321
    //   357: astore_0
    //   358: aload_0
    //   359: invokevirtual 271	java/lang/Exception:printStackTrace	()V
    //   362: goto -41 -> 321
    //   365: astore_3
    //   366: goto +4 -> 370
    //   369: astore_3
    //   370: iload_1
    //   371: iconst_1
    //   372: iadd
    //   373: istore_1
    //   374: goto -344 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	377	0	paramString	String
    //   29	345	1	n	int
    //   7	341	2	localArrayList	ArrayList
    //   55	254	3	localNetBookInfo	NetBookInfo
    //   365	1	3	localClassCastException	ClassCastException
    //   369	1	3	localNullPointerException	NullPointerException
    //   46	236	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	28	316	org/json/JSONException
    //   30	217	316	org/json/JSONException
    //   217	277	316	org/json/JSONException
    //   277	297	316	org/json/JSONException
    //   297	305	316	org/json/JSONException
    //   308	313	316	org/json/JSONException
    //   14	28	349	java/lang/NullPointerException
    //   30	217	349	java/lang/NullPointerException
    //   277	297	349	java/lang/NullPointerException
    //   297	305	349	java/lang/NullPointerException
    //   308	313	349	java/lang/NullPointerException
    //   14	28	357	java/lang/Exception
    //   30	217	357	java/lang/Exception
    //   217	277	357	java/lang/Exception
    //   277	297	357	java/lang/Exception
    //   297	305	357	java/lang/Exception
    //   308	313	357	java/lang/Exception
    //   217	277	365	java/lang/ClassCastException
    //   217	277	369	java/lang/NullPointerException
  }
  
  public final void a()
  {
    this.i.clear();
    this.h = 1;
  }
  
  public final void a(String paramString)
  {
    String str = null;
    this.l.setText(this.e.getResources().getString(2131230908));
    this.l.show();
    if (this.h == 1) {}
    Object localObject1;
    int i1;
    switch (this.f / 10)
    {
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      this.c = new g(this.d);
      this.c.a(y.b());
      this.c.a(y.a());
      this.c.a(a.J);
      localObject1 = this.c;
      if (this.f / 10 == 9)
      {
        Object localObject2 = PreferenceManager.getDefaultSharedPreferences(this.e);
        localObject1 = ((SharedPreferences)localObject2).getString("userName", null);
        localObject2 = ((SharedPreferences)localObject2).getString("password", null);
        new StringBuilder(" userName=").append((String)localObject1).append(" password=").append((String)localObject2).append("activity=").append(this.e).toString();
        if ((!y.d((String)localObject1)) && (!y.d((String)localObject2)))
        {
          localObject1 = new BasicNameValuePair("BookStore_uID", (String)localObject1);
          localObject2 = new BasicNameValuePair("BookStore_pWD", (String)localObject2);
          this.c.a().add(localObject1);
          this.c.a().add(localObject2);
        }
        new StringBuilder("myRequest.getParams().size()=").append(this.c.a().size()).toString();
      }
      new StringBuilder(" dataType=").append(this.f).append(" requestPageNumber=").append(this.h).append(" otherInfo=").append(paramString).toString();
      localObject1 = this.c;
      int n = this.f;
      i1 = this.h;
      this.h = (i1 + 1);
      switch (n)
      {
      default: 
        paramString = null;
        label558:
        if ((paramString != null) && (paramString.startsWith("K"))) {
          str = String.format(a.z + "/iOSServices/getBooksByKeyWords.aspx?type=%s&pageNumber=%d", new Object[] { paramString, Integer.valueOf(i1) });
        }
        break;
      }
      break;
    }
    for (;;)
    {
      ((g)localObject1).b(str);
      return;
      CloudStoreActivity.a.a.setVisibility(0);
      break;
      CloudStoreActivity.a.b.setVisibility(0);
      break;
      CloudStoreActivity.a.e.setVisibility(0);
      break;
      CloudStoreActivity.a.c.setVisibility(0);
      break;
      CloudStoreActivity.a.f.setVisibility(0);
      break;
      paramString = "free";
      break label558;
      paramString = "new";
      break label558;
      paramString = "comments";
      break label558;
      paramString = "recommended";
      break label558;
      paramString = "C" + paramString;
      break label558;
      paramString = "C" + paramString + "_new";
      break label558;
      paramString = "C" + paramString + "_comments";
      break label558;
      paramString = "K" + paramString;
      break label558;
      str = String.format(a.z + "/iOSServices/GetMyBooks.aspx?UserBookType=%d&pageNumber=%d", new Object[] { Integer.valueOf(9), Integer.valueOf(i1) });
      paramString = null;
      break label558;
      str = String.format(a.z + "/iOSServices/GetMyBooks.aspx?UserBookType=%d&pageNumber=%d", new Object[] { Integer.valueOf(2), Integer.valueOf(i1) });
      paramString = null;
      break label558;
      str = String.format(a.z + "/iOSServices/GetMyBooks.aspx?UserBookType=%d&pageNumber=%d", new Object[] { Integer.valueOf(1), Integer.valueOf(i1) });
      paramString = null;
      break label558;
      if (paramString != null) {
        str = String.format(a.z + "/iOSServices/getBooks.aspx?type=%s&pageNumber=%d", new Object[] { paramString, Integer.valueOf(i1) });
      }
    }
  }
  
  public final void b()
  {
    new StringBuilder("init=").append(this).toString();
    this.l = Toast.makeText(this.e, "", 0);
    this.i = new ArrayList();
    this.j = new h(this.e, this.i);
    an localan = new an(this, (byte)0);
    this.h = 1;
    this.g.setAdapter(this.j);
    this.g.setOnScrollListener(localan);
    this.g.setOnItemClickListener(new al(this));
  }
  
  public final void c()
  {
    if (this.k != null)
    {
      a(this.k);
      return;
    }
    a(null);
  }
  
  public final void c(String paramString)
  {
    this.k = paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */