import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a");
        double a= scanner.nextDouble();
        System.out.println("Nhap b");
        double b= scanner.nextDouble();
        System.out.println("Nhap c");
        double c= scanner.nextDouble();
        QuadraticEquation pt =new QuadraticEquation(a,b,c);
        if(pt.getDiscriminant()>0){
            System.out.printf("Phuong trinh co 2 nghiem phan biet x1=%f va x2=%f \n",pt.getRoot1(),pt.getRoot2());
        } else if (pt.getDiscriminant()==0) {
            System.out.println("Phuong trinh co nghiem duy nhat x="+pt.getRoot1());
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
