public int[] front11(int[] a, int[] b) {
    int firstArrayLength = a.length;
    int secondArrayLength = b.length;
    int[] result = new int[2];
    int[] res = new int[1];
    int[] emptyArray = {};

    if(firstArrayLength >= 1 && secondArrayLength >= 1)
    {
      result[0] = a[0];
      result[1] = b[0];
      return result;
    }
    
    if(firstArrayLength >= 1 && secondArrayLength == 0)
    {
      res[0] = a[0];
      return res;
    }
    
    else if(firstArrayLength == 0 && secondArrayLength >= 1)
    {
      res[0] = b[0];
      return res;
    }
    
    
    return emptyArray;
}
