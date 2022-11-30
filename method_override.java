class Base{
    int x=0;
   void BaseFn(){
        System.out.println(x);
    }
}

class Der extends  Base{
    @Override
   void  BaseFn(){
        System.out.println("Override done");
    }
}


class  Main{
    public static void main(String [] asas){
        Der d=new Der();
        d.BaseFn();
    }
}
