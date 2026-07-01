package org.jsoup.nodes;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class Attributes$Dataset$EntrySet
  extends AbstractSet<Map.Entry<String, String>>
{
  private Attributes$Dataset$EntrySet(Attributes.Dataset paramDataset) {}
  
  public Iterator<Map.Entry<String, String>> iterator()
  {
    return new Attributes.Dataset.DatasetIterator(this.this$1, null);
  }
  
  public int size()
  {
    int i = 0;
    Attributes.Dataset.DatasetIterator localDatasetIterator = new Attributes.Dataset.DatasetIterator(this.this$1, null);
    while (localDatasetIterator.hasNext()) {
      i += 1;
    }
    return i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\nodes\Attributes$Dataset$EntrySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */