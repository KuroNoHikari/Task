class tasksheet112 {
    public static void main(String[] args) {

        int res,  a=1, b=2 , c=7 , d=8;
        res = a+b;
        System.out.println("Result is: " + res);
        System.out.println("Result is: " + (res -=a));
        System.out.println("Result is: " + (res *=b));
        System.out.println("Result is: " + (res /=b));
        res += d;
        System.out.println("Result is: " + (res %= c));
    }
}
