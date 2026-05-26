package setget;

public class bankAccount {
    private static String bankName;
    private long accNum;
    private boolean active;

    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public String getBankName(){
        return this.bankName;
    }
    public void setAccNum(long accnum){
        this.accNum = accnum;
    }
    public long getAccNum(){
        return this.accNum;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public String isActive(){
        if(this.active)
        return   "account is active";
        else
            return "account is not active";
    }
    public void display(){
        System.out.println("\tdetails\t");
        System.out.println("bank name\t" +getBankName() );
        System.out.println("accnum\t\t" +getAccNum());
        System.out.println("active\t\t"+isActive());
    }
}
