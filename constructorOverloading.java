//class constructor overwriting


 class Test{
        private int id;
        private String name;
        
      public Test(){
            id=12;
            name="Abhay";
        }
         public Test(int i){
            id=i;
            name="Abhay";
        }
        
        int getID(){
            return id;
        }
        String getName(){
            return name;
        }
    }

class Main{
    
   
    
    public static void main(String [] asd){
       Test test=new Test();
Test newTest=new Test(111);
       System.out.printf("%d\n",newTest.getID());
              System.out.printf("%d",test.getID());

    }
}
