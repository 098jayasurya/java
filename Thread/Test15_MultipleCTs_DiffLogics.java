package Thread;


class AddThread extends Thread{
    @Override
    public void run(){
        int sum = 1;
        for(int i=2;i<=3;i++){
            sum = sum + i;
            System.out.println("summation" + sum);
        }
    }
}

class SubThread extends Thread{
    @Override
    public void run(){
        int sub = 1;
        for(int i =2; i<=3; i++){
            sub = sub + i;
            System.out.println("subtraction " + sub);
        }
    }
}

class MulThread extends Thread{
    @Override
    public void run(){
        int mul =1;
        for(int i =2;i<=3;i++){
            mul = mul * i;
            System.out.println("multiplication " + mul);
        }
    }
}
public class Test15_MultipleCTs_DiffLogics {
    public static void main(String[] args) {
        AddThread ad = new AddThread();
        SubThread st = new SubThread();
    MulThread mt = new MulThread();

        ad.start();
        st.start();
        mt.start();
    }
}
