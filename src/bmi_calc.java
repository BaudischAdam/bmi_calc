public class bmi_calc {


    public static void main(String[] args) {

        double h = 1.94;
        double w = -35;
        double BMI = 0 ;

        if ((h > 0) && (w > 0)) {
            BMI = w/Math.pow(h,2);
            System.out.printf("Vaše BMI: %.1f\n", BMI);
        } else System.out.printf("Hodnoty špatně zadány");


        if ((BMI < 16.5) && (BMI != 0)){
            System.out.println("Těžká podvýživa");
        } else if ((BMI >= 16.5) && (BMI < 18.5)){
            System.out.println("Podváha");
        } else if ((BMI > 18.5)&&(BMI < 25)){
            System.out.println("Ideální (zdravá) váha");
        } else if ((BMI >= 25)&&(BMI < 30)){
            System.out.println("Nadváha");
        } else if ((BMI >= 30)&&(BMI < 35)){
            System.out.println("Obezita prvního stupně");
        } else if ((BMI >= 35)&&(BMI < 40)){
            System.out.println("Obezita druhého stupně");
        } else if (BMI > 40){
            System.out.println("Obezita třetího stupně");
        }
    }
}