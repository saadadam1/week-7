class SampleFinally{
  public static void main(String args[]){
    try{
       int a=12/0;
    }
    finally{
      System.out.println("finally");
    }
      
    
  }
}