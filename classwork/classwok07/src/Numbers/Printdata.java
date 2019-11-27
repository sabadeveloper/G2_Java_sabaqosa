package Numbers;

public class Printdata implements IterfaceOfNumbers{
    public void print(ClassWork07 work){
        //work.method1();
        work.setData("levani");
        work.printName();

    }

    public void print2(ClassWork07 work2){
        work2.PrintName2();
    }

    @Override
    public void setData(String name) {

    }
}
