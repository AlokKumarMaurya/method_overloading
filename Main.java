class Main{
    static void fn(){
        System.out.println("Hello world");
    }
    
    static void fn(int a){
        System.out.println("Hello world" + a);
    }
    
     static void fn(int a,int b){
        System.out.println("Hello world" + a);
        System.out.println("Hello world" + b);
    }
    
    public static void main(String []asdd){
        fn();
        fn(8);
        fn(2,7);
    }
}
