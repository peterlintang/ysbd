package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;
import java.util.Locale;

public class f
  implements i
{
  private static final String a = "AEIOUY";
  private static final String[] b = { "GN", "KN", "PN", "WR", "PS" };
  private static final String[] c = { "L", "R", "N", "M", "B", "H", "F", "V", "W", " " };
  private static final String[] d = { "ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER" };
  private static final String[] e = { "L", "T", "K", "S", "N", "M", "B", "Z" };
  private int f = 4;
  
  private int a(f.a parama, int paramInt)
  {
    if (paramInt == 0) {
      parama.a('A');
    }
    return paramInt + 1;
  }
  
  private int a(String paramString, f.a parama, int paramInt)
  {
    if (b(paramString, paramInt))
    {
      parama.a('K');
      return paramInt + 2;
    }
    if ((paramInt == 0) && (a(paramString, paramInt, 6, "CAESAR")))
    {
      parama.a('S');
      return paramInt + 2;
    }
    if (a(paramString, paramInt, 2, "CH")) {
      return c(paramString, parama, paramInt);
    }
    if ((a(paramString, paramInt, 2, "CZ")) && (!a(paramString, paramInt - 2, 4, "WICZ")))
    {
      parama.a('S', 'X');
      return paramInt + 2;
    }
    if (a(paramString, paramInt + 1, 3, "CIA"))
    {
      parama.a('X');
      return paramInt + 3;
    }
    if ((a(paramString, paramInt, 2, "CC")) && ((paramInt != 1) || (a(paramString, 0) != 'M'))) {
      return b(paramString, parama, paramInt);
    }
    if (a(paramString, paramInt, 2, "CK", "CG", "CQ"))
    {
      parama.a('K');
      return paramInt + 2;
    }
    if (a(paramString, paramInt, 2, "CI", "CE", "CY"))
    {
      if (a(paramString, paramInt, 3, "CIO", "CIE", "CIA")) {
        parama.a('S', 'X');
      }
      for (;;)
      {
        return paramInt + 2;
        parama.a('S');
      }
    }
    parama.a('K');
    if (a(paramString, paramInt + 1, 2, " C", " Q", " G")) {
      return paramInt + 3;
    }
    if ((a(paramString, paramInt + 1, 1, "C", "K", "Q")) && (!a(paramString, paramInt + 1, 2, "CE", "CI"))) {
      return paramInt + 2;
    }
    return paramInt + 1;
  }
  
  private int a(String paramString, f.a parama, int paramInt, boolean paramBoolean)
  {
    if (a(paramString, paramInt + 1) == 'H') {
      return e(paramString, parama, paramInt);
    }
    if (a(paramString, paramInt + 1) == 'N')
    {
      if ((paramInt == 1) && (a(a(paramString, 0))) && (!paramBoolean)) {
        parama.a("KN", "N");
      }
      for (;;)
      {
        return paramInt + 2;
        if ((!a(paramString, paramInt + 2, 2, "EY")) && (a(paramString, paramInt + 1) != 'Y') && (!paramBoolean)) {
          parama.a("N", "KN");
        } else {
          parama.a("KN");
        }
      }
    }
    if ((a(paramString, paramInt + 1, 2, "LI")) && (!paramBoolean))
    {
      parama.a("KL", "L");
      return paramInt + 2;
    }
    if ((paramInt == 0) && ((a(paramString, paramInt + 1) == 'Y') || (a(paramString, paramInt + 1, 2, d))))
    {
      parama.a('K', 'J');
      return paramInt + 2;
    }
    if (((a(paramString, paramInt + 1, 2, "ER")) || (a(paramString, paramInt + 1) == 'Y')) && (!a(paramString, 0, 6, "DANGER", "RANGER", "MANGER")) && (!a(paramString, paramInt - 1, 1, "E", "I")) && (!a(paramString, paramInt - 1, 3, "RGY", "OGY")))
    {
      parama.a('K', 'J');
      return paramInt + 2;
    }
    if ((a(paramString, paramInt + 1, 1, "E", "I", "Y")) || (a(paramString, paramInt - 1, 4, "AGGI", "OGGI")))
    {
      if ((a(paramString, 0, 4, "VAN ", "VON ")) || (a(paramString, 0, 3, "SCH")) || (a(paramString, paramInt + 1, 2, "ET"))) {
        parama.a('K');
      }
      for (;;)
      {
        return paramInt + 2;
        if (a(paramString, paramInt + 1, 3, "IER")) {
          parama.a('J');
        } else {
          parama.a('J', 'K');
        }
      }
    }
    if (a(paramString, paramInt + 1) == 'G')
    {
      parama.a('K');
      return paramInt + 2;
    }
    parama.a('K');
    return paramInt + 1;
  }
  
  private boolean a(char paramChar)
  {
    return "AEIOUY".indexOf(paramChar) != -1;
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2 });
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2, paramString3 });
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2, paramString3, paramString4 });
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2, paramString3, paramString4, paramString5 });
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    return a(paramString1, paramInt1, paramInt2, new String[] { paramString2, paramString3, paramString4, paramString5, paramString6, paramString7 });
  }
  
  protected static boolean a(String paramString, int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 >= 0)
    {
      bool1 = bool2;
      if (paramInt1 + paramInt2 <= paramString.length())
      {
        paramString = paramString.substring(paramInt1, paramInt1 + paramInt2);
        paramInt2 = paramArrayOfString.length;
        paramInt1 = 0;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (paramInt1 < paramInt2)
      {
        if (paramString.equals(paramArrayOfString[paramInt1])) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      paramInt1 += 1;
    }
  }
  
  private int b(String paramString, f.a parama, int paramInt)
  {
    if ((a(paramString, paramInt + 2, 1, "I", "E", "H")) && (!a(paramString, paramInt + 2, 2, "HU")))
    {
      if (((paramInt == 1) && (a(paramString, paramInt - 1) == 'A')) || (a(paramString, paramInt - 1, 5, "UCCEE", "UCCES"))) {
        parama.a("KS");
      }
      for (;;)
      {
        return paramInt + 3;
        parama.a('X');
      }
    }
    parama.a('K');
    return paramInt + 2;
  }
  
  private int b(String paramString, f.a parama, int paramInt, boolean paramBoolean)
  {
    if ((a(paramString, paramInt, 4, "JOSE")) || (a(paramString, 0, 4, "SAN ")))
    {
      if (((paramInt == 0) && (a(paramString, paramInt + 4) == ' ')) || (paramString.length() == 4) || (a(paramString, 0, 4, "SAN "))) {
        parama.a('H');
      }
      for (;;)
      {
        return paramInt + 1;
        parama.a('J', 'H');
      }
    }
    if ((paramInt == 0) && (!a(paramString, paramInt, 4, "JOSE"))) {
      parama.a('J', 'A');
    }
    while (a(paramString, paramInt + 1) == 'J')
    {
      return paramInt + 2;
      if ((a(a(paramString, paramInt - 1))) && (!paramBoolean) && ((a(paramString, paramInt + 1) == 'A') || (a(paramString, paramInt + 1) == 'O'))) {
        parama.a('J', 'H');
      } else if (paramInt == paramString.length() - 1) {
        parama.a('J', ' ');
      } else if ((!a(paramString, paramInt + 1, 1, e)) && (!a(paramString, paramInt - 1, 1, "S", "K", "L"))) {
        parama.a('J');
      }
    }
    return paramInt + 1;
  }
  
  private boolean b(String paramString, int paramInt)
  {
    if (a(paramString, paramInt, 4, "CHIA")) {}
    int i;
    do
    {
      return true;
      if (paramInt <= 1) {
        return false;
      }
      if (a(a(paramString, paramInt - 2))) {
        return false;
      }
      if (!a(paramString, paramInt - 1, 3, "ACH")) {
        return false;
      }
      i = a(paramString, paramInt + 2);
    } while (((i != 73) && (i != 69)) || (a(paramString, paramInt - 2, 6, "BACHER", "MACHER")));
    return false;
  }
  
  private int c(String paramString, f.a parama, int paramInt)
  {
    if ((paramInt > 0) && (a(paramString, paramInt, 4, "CHAE")))
    {
      parama.a('K', 'X');
      return paramInt + 2;
    }
    if (c(paramString, paramInt))
    {
      parama.a('K');
      return paramInt + 2;
    }
    if (d(paramString, paramInt))
    {
      parama.a('K');
      return paramInt + 2;
    }
    if (paramInt > 0) {
      if (a(paramString, 0, 2, "MC")) {
        parama.a('K');
      }
    }
    for (;;)
    {
      return paramInt + 2;
      parama.a('X', 'K');
      continue;
      parama.a('X');
    }
  }
  
  private int c(String paramString, f.a parama, int paramInt, boolean paramBoolean)
  {
    if ((paramInt == paramString.length() - 1) && (!paramBoolean) && (a(paramString, paramInt - 2, 2, "IE")) && (!a(paramString, paramInt - 4, 2, "ME", "MA"))) {
      parama.c('R');
    }
    while (a(paramString, paramInt + 1) == 'R')
    {
      return paramInt + 2;
      parama.a('R');
    }
    return paramInt + 1;
  }
  
  private boolean c(String paramString)
  {
    return (paramString.indexOf('W') >= 0) || (paramString.indexOf('K') >= 0) || (paramString.indexOf("CZ") >= 0) || (paramString.indexOf("WITZ") >= 0);
  }
  
  private boolean c(String paramString, int paramInt)
  {
    if (paramInt != 0) {
      return false;
    }
    if ((!a(paramString, paramInt + 1, 5, "HARAC", "HARIS")) && (!a(paramString, paramInt + 1, 3, "HOR", "HYM", "HIA", "HEM"))) {
      return false;
    }
    return !a(paramString, 0, 5, "CHORE");
  }
  
  private int d(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt, 2, "DG"))
    {
      if (a(paramString, paramInt + 2, 1, "I", "E", "Y"))
      {
        parama.a('J');
        return paramInt + 3;
      }
      parama.a("TK");
      return paramInt + 2;
    }
    if (a(paramString, paramInt, 2, "DT", "DD"))
    {
      parama.a('T');
      return paramInt + 2;
    }
    parama.a('T');
    return paramInt + 1;
  }
  
  private int d(String paramString, f.a parama, int paramInt, boolean paramBoolean)
  {
    if (a(paramString, paramInt - 1, 3, "ISL", "YSL")) {
      return paramInt + 1;
    }
    if ((paramInt == 0) && (a(paramString, paramInt, 5, "SUGAR")))
    {
      parama.a('X', 'S');
      return paramInt + 1;
    }
    if (a(paramString, paramInt, 2, "SH"))
    {
      if (a(paramString, paramInt + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
        parama.a('S');
      }
      for (;;)
      {
        return paramInt + 2;
        parama.a('X');
      }
    }
    if ((a(paramString, paramInt, 3, "SIO", "SIA")) || (a(paramString, paramInt, 4, "SIAN")))
    {
      if (paramBoolean) {
        parama.a('S');
      }
      for (;;)
      {
        return paramInt + 3;
        parama.a('S', 'X');
      }
    }
    if (((paramInt == 0) && (a(paramString, paramInt + 1, 1, "M", "N", "L", "W"))) || (a(paramString, paramInt + 1, 1, "Z")))
    {
      parama.a('S', 'X');
      if (a(paramString, paramInt + 1, 1, "Z")) {
        return paramInt + 2;
      }
      return paramInt + 1;
    }
    if (a(paramString, paramInt, 2, "SC")) {
      return i(paramString, parama, paramInt);
    }
    if ((paramInt == paramString.length() - 1) && (a(paramString, paramInt - 2, 2, "AI", "OI"))) {
      parama.c('S');
    }
    while (a(paramString, paramInt + 1, 1, "S", "Z"))
    {
      return paramInt + 2;
      parama.a('S');
    }
    return paramInt + 1;
  }
  
  private boolean d(String paramString)
  {
    boolean bool2 = false;
    String[] arrayOfString = b;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramString.startsWith(arrayOfString[i])) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  private boolean d(String paramString, int paramInt)
  {
    return (a(paramString, 0, 4, "VAN ", "VON ")) || (a(paramString, 0, 3, "SCH")) || (a(paramString, paramInt - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) || (a(paramString, paramInt + 2, 1, "T", "S")) || (((a(paramString, paramInt - 1, 1, "A", "O", "U", "E")) || (paramInt == 0)) && ((a(paramString, paramInt + 2, 1, c)) || (paramInt + 1 == paramString.length() - 1)));
  }
  
  private int e(String paramString, f.a parama, int paramInt)
  {
    if ((paramInt > 0) && (!a(a(paramString, paramInt - 1)))) {
      parama.a('K');
    }
    for (;;)
    {
      return paramInt + 2;
      if (paramInt == 0)
      {
        if (a(paramString, paramInt + 2) == 'I') {
          parama.a('J');
        }
        for (;;)
        {
          return paramInt + 2;
          parama.a('K');
        }
      }
      if (((paramInt > 1) && (a(paramString, paramInt - 2, 1, "B", "H", "D"))) || ((paramInt > 2) && (a(paramString, paramInt - 3, 1, "B", "H", "D"))) || ((paramInt > 3) && (a(paramString, paramInt - 4, 1, "B", "H")))) {
        return paramInt + 2;
      }
      if ((paramInt > 2) && (a(paramString, paramInt - 1) == 'U') && (a(paramString, paramInt - 3, 1, "C", "G", "L", "R", "T"))) {
        parama.a('F');
      } else if ((paramInt > 0) && (a(paramString, paramInt - 1) != 'I')) {
        parama.a('K');
      }
    }
  }
  
  private int e(String paramString, f.a parama, int paramInt, boolean paramBoolean)
  {
    if (a(paramString, paramInt + 1) == 'H')
    {
      parama.a('J');
      return paramInt + 2;
    }
    if ((a(paramString, paramInt + 1, 2, "ZO", "ZI", "ZA")) || ((paramBoolean) && (paramInt > 0) && (a(paramString, paramInt - 1) != 'T'))) {
      parama.a("S", "TS");
    }
    while (a(paramString, paramInt + 1) == 'Z')
    {
      return paramInt + 2;
      parama.a('S');
    }
    return paramInt + 1;
  }
  
  private String e(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return null;
      paramString = paramString.trim();
    } while (paramString.length() == 0);
    return paramString.toUpperCase(Locale.ENGLISH);
  }
  
  private boolean e(String paramString, int paramInt)
  {
    if ((paramInt == paramString.length() - 3) && (a(paramString, paramInt - 1, 4, "ILLO", "ILLA", "ALLE"))) {
      return true;
    }
    return ((a(paramString, paramString.length() - 2, 2, "AS", "OS")) || (a(paramString, paramString.length() - 1, 1, "A", "O"))) && (a(paramString, paramInt - 1, 4, "ALLE"));
  }
  
  private int f(String paramString, f.a parama, int paramInt)
  {
    if (((paramInt == 0) || (a(a(paramString, paramInt - 1)))) && (a(a(paramString, paramInt + 1))))
    {
      parama.a('H');
      return paramInt + 2;
    }
    return paramInt + 1;
  }
  
  private boolean f(String paramString, int paramInt)
  {
    if (a(paramString, paramInt + 1) == 'M') {}
    while ((a(paramString, paramInt - 1, 3, "UMB")) && ((paramInt + 1 == paramString.length() - 1) || (a(paramString, paramInt + 2, 2, "ER")))) {
      return true;
    }
    return false;
  }
  
  private int g(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt + 1) == 'L')
    {
      if (e(paramString, paramInt)) {
        parama.b('L');
      }
      for (;;)
      {
        return paramInt + 2;
        parama.a('L');
      }
    }
    parama.a('L');
    return paramInt + 1;
  }
  
  private int h(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt + 1) == 'H')
    {
      parama.a('F');
      return paramInt + 2;
    }
    parama.a('P');
    if (a(paramString, paramInt + 1, 1, "P", "B")) {
      return paramInt + 2;
    }
    return paramInt + 1;
  }
  
  private int i(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt + 2) == 'H') {
      if (a(paramString, paramInt + 3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
        if (a(paramString, paramInt + 3, 2, "ER", "EN")) {
          parama.a("X", "SK");
        }
      }
    }
    for (;;)
    {
      return paramInt + 3;
      parama.a("SK");
      continue;
      if ((paramInt == 0) && (!a(a(paramString, 3))) && (a(paramString, 3) != 'W'))
      {
        parama.a('X', 'S');
      }
      else
      {
        parama.a('X');
        continue;
        if (a(paramString, paramInt + 2, 1, "I", "E", "Y")) {
          parama.a('S');
        } else {
          parama.a("SK");
        }
      }
    }
  }
  
  private int j(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt, 4, "TION"))
    {
      parama.a('X');
      return paramInt + 3;
    }
    if (a(paramString, paramInt, 3, "TIA", "TCH"))
    {
      parama.a('X');
      return paramInt + 3;
    }
    if ((a(paramString, paramInt, 2, "TH")) || (a(paramString, paramInt, 3, "TTH")))
    {
      if ((a(paramString, paramInt + 2, 2, "OM", "AM")) || (a(paramString, 0, 4, "VAN ", "VON ")) || (a(paramString, 0, 3, "SCH"))) {
        parama.a('T');
      }
      for (;;)
      {
        return paramInt + 2;
        parama.a('0', 'T');
      }
    }
    parama.a('T');
    if (a(paramString, paramInt + 1, 1, "T", "D")) {
      return paramInt + 2;
    }
    return paramInt + 1;
  }
  
  private int k(String paramString, f.a parama, int paramInt)
  {
    if (a(paramString, paramInt, 2, "WR"))
    {
      parama.a('R');
      return paramInt + 2;
    }
    if ((paramInt == 0) && ((a(a(paramString, paramInt + 1))) || (a(paramString, paramInt, 2, "WH"))))
    {
      if (a(a(paramString, paramInt + 1))) {
        parama.a('A', 'F');
      }
      for (;;)
      {
        return paramInt + 1;
        parama.a('A');
      }
    }
    if (((paramInt == paramString.length() - 1) && (a(a(paramString, paramInt - 1)))) || (a(paramString, paramInt - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) || (a(paramString, 0, 3, "SCH"))) {
      parama.c('F');
    }
    while (!a(paramString, paramInt, 4, "WICZ", "WITZ")) {
      return paramInt + 1;
    }
    parama.a("TS", "FX");
    return paramInt + 4;
  }
  
  private int l(String paramString, f.a parama, int paramInt)
  {
    if (paramInt == 0)
    {
      parama.a('S');
      return paramInt + 1;
    }
    if ((paramInt != paramString.length() - 1) || ((!a(paramString, paramInt - 3, 3, "IAU", "EAU")) && (!a(paramString, paramInt - 2, 2, "AU", "OU")))) {
      parama.a("KS");
    }
    if (a(paramString, paramInt + 1, 1, "C", "X")) {
      return paramInt + 2;
    }
    return paramInt + 1;
  }
  
  protected char a(String paramString, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= paramString.length())) {
      return '\000';
    }
    return paramString.charAt(paramInt);
  }
  
  public int a()
  {
    return this.f;
  }
  
  public String a(String paramString)
  {
    return a(paramString, false);
  }
  
  public String a(String paramString, boolean paramBoolean)
  {
    paramString = e(paramString);
    if (paramString == null) {
      return null;
    }
    boolean bool = c(paramString);
    int i;
    f.a locala;
    if (d(paramString))
    {
      i = 1;
      locala = new f.a(this, a());
    }
    for (;;)
    {
      if ((locala.c()) || (i > paramString.length() - 1)) {
        break label751;
      }
      switch (paramString.charAt(i))
      {
      default: 
        i += 1;
        continue;
        i = 0;
        break;
      case 'A': 
      case 'E': 
      case 'I': 
      case 'O': 
      case 'U': 
      case 'Y': 
        i = a(locala, i);
        break;
      case 'B': 
        locala.a('P');
        if (a(paramString, i + 1) == 'B') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'Ç': 
        locala.a('S');
        i += 1;
        break;
      case 'C': 
        i = a(paramString, locala, i);
        break;
      case 'D': 
        i = d(paramString, locala, i);
        break;
      case 'F': 
        locala.a('F');
        if (a(paramString, i + 1) == 'F') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'G': 
        i = a(paramString, locala, i, bool);
        break;
      case 'H': 
        i = f(paramString, locala, i);
        break;
      case 'J': 
        i = b(paramString, locala, i, bool);
        break;
      case 'K': 
        locala.a('K');
        if (a(paramString, i + 1) == 'K') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'L': 
        i = g(paramString, locala, i);
        break;
      case 'M': 
        locala.a('M');
        if (f(paramString, i)) {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'N': 
        locala.a('N');
        if (a(paramString, i + 1) == 'N') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'Ñ': 
        locala.a('N');
        i += 1;
        break;
      case 'P': 
        i = h(paramString, locala, i);
        break;
      case 'Q': 
        locala.a('K');
        if (a(paramString, i + 1) == 'Q') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'R': 
        i = c(paramString, locala, i, bool);
        break;
      case 'S': 
        i = d(paramString, locala, i, bool);
        break;
      case 'T': 
        i = j(paramString, locala, i);
        break;
      case 'V': 
        locala.a('F');
        if (a(paramString, i + 1) == 'V') {
          i += 2;
        } else {
          i += 1;
        }
        break;
      case 'W': 
        i = k(paramString, locala, i);
        break;
      case 'X': 
        i = l(paramString, locala, i);
        break;
      case 'Z': 
        i = e(paramString, locala, i, bool);
      }
    }
    label751:
    if (paramBoolean) {
      return locala.b();
    }
    return locala.a();
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, false);
  }
  
  public boolean a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return a(paramString1, paramBoolean).equals(a(paramString2, paramBoolean));
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("DoubleMetaphone encode parameter is not of type String");
    }
    return a((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */