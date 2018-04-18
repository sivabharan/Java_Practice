package JavaSamplePrograms;

public class Interface implements Pet {

        public void test(){
            System.out.println("Interface Method Implemented");
        }
        public static void main(String args[]){
            Pet p = new Interface();
            p.test();
        }
}

interface Pet{
    public void test();
}

