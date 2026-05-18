class employee{
    int empId;
    String emp_name;
    long emp_num;
    double emp_sal;
}

class company{
    public static void main(String[] args){
        employee e1 = new employee();
        employee e2 = new employee();

        e1.empId = 1;
        e1.emp_name ="jay";
        e1.emp_num =934223422;
        e1.emp_sal =5000.33;

        e2.empId = 2;
        e2.emp_name ="surya";
        e2.emp_num =733722131;
        e2.emp_sal =649004;

        System.out.println(e1.empId);
        System.out.println(e1.emp_name);
        System.out.println(e1.emp_num);
        System.out.println(e1.emp_sal);

        System.out.println();

        System.out.println(e2.empId);
        System.out.println(e2.emp_name);
        System.out.println(e2.emp_num);
        System.out.println(e2.emp_sal);

    }
}