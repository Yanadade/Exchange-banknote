import java.util.Scanner;
class Assignment{
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Input for money = ");
        int money=kb.nextInt();
        System.out.println("Amount Money = " +money);

        if(money>=1000){
            // 8000/1000 = Amount banknote
            System.out.println("1000 bath = " + (money/1000) + " banknote");
            money=money%1000;
            //System.out.println("fraction = " +money);
        }
        if(money>=500){
            // 600/100 = Amount banknote
            System.out.println("500 bath = " + (money/500) + " banknote");
            money%=500;
            //System.out.println("fraction = " +money);
        }
        if(money>=100){
            System.out.println("100 bath = " + (money/100) + " banknote");
            money%=100;
        }
        if(money>=50){
            System.out.println("50 bath = " + (money/50) + " banknote");
            money%=50;
            //System.out.println("fraction = " +money);
        }
        if(money>=20){
            System.out.println("20 bath = " + (money/20) + " banknote");
            money%=20;
        }
        if(money>=10){
            System.out.println("10 bath = " + (money/10) + " banknote");
            money%=10;
        }
    }
}