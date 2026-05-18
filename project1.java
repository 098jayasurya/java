class Student01{
    String name ="jaya";
    int rollNumber=90;
    long[] phoneNum={9381144674,555435345};
    String sclass="1OTH ";

}
class Student02{
    String name ="jaya";
    int rollNumber=90;
    long[] phoneNum={9381144674,555435345};
    String sclass="1OTH ";

}
class Test01_student{
    public static void main(String[] args){
    Student01 s1 = new Student01();
    Student02 s2 = new Student02();

    System.out.println("s1.name"+s1.name);
    System.out.println(s1.rollNumber);
    System.out.println(s1.phoneNum[0]);
    System.out.println(s1.sclass);
}
}