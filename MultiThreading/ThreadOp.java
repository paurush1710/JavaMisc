class ThreadOp{

public static void main(String[] args) {
	    System.out.println("program started .. ");
        
        int x = 20+34;
        System.out.println("Sum is : "+x);

        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("Thread Name : "+tName);

        t.setName("MyMain");
        System.out.println("Thread Name : "+t.getName());

        try{
            Thread.sleep(2000);
	    }
	    catch(Exception e){}

        UserThread userT = new UserThread();
        userT.start();


	    System.out.println("program ended .. ");
     }

}

class UserThread extends Thread{
    public void run(){
        System.out.println("This is user defined Thread");
    }
}
