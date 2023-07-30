public class Easy {
    static void pMethod(String FirstName, String LastName, String Occupation, int age, int Height){
        System.out.println("FirstName: " + FirstName +", " +"LastName:" + LastName +", "+ "Occupation: "
                + Occupation + ", " +"Age: " + age + ", " + " Height " + Height);

    }
    static int multiplyNum(int x, int y, int z){
        return x*y*z;
    }
    static int addNum(int a, int b, int c){
        return a + b + c;
    }
    static int minusNum(int i, int j, int k){
        return  i - j - k;
    }
   public String myName = "SAHEED";

    public String getMyName() {
        return myName;
    }

    public static void main(String[] args) {
     pMethod("Saheed", "Adewale", "Java Developer", 15, 12);
        System.out.println(addNum(12, 3, 5));
        System.out.println(minusNum(  300, 167, 54));
        System.out.println(multiplyNum(5,9,20));
        Easy e = new Easy();
        System.out.println(e.getMyName());
    }
}
