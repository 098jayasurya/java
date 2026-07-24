package Thread;

    class printNumbers{
    private int number;
    private boolean numberPrinted;

    public synchronized void printEvenNumbers(int number){
        while(!numberPrinted){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print(number +" ");
        numberPrinted = false;
        notify();
    }
    

    public synchronized void printOddNumbers(int number){
        while(numberPrinted){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.print(number +" ");
        numberPrinted = true;
        notify();
    }
    }

    class EvenNumber extends Thread{
        private printNumbers pN;

        public EvenNumber(printNumbers pN){
            this.pN = pN;
        }

        @Override
        public void run(){
            for(int i = 2;i<=20;i++){
                pN.printEvenNumbers(i);
                i++;
            }
        }
    }

      class oddNumber extends Thread{
        private printNumbers pN;

        public oddNumber(printNumbers pN){
            this.pN = pN;
        }

        @Override
        public void run(){
            for(int i = 1;i<=19;i++){
                pN.printOddNumbers(i);
                i++;
        }
    }


}
public class Test40_ITC_OddEven {
    public static void main(String[] args){
    printNumbers printNumbers = new printNumbers();
    EvenNumber en = new EvenNumber(printNumbers);
    oddNumber on = new oddNumber(printNumbers);

    en.start();
    on.start();
    }
    }