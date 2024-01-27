//This is AI's modification of my code
public class Population {
    public static void main(String[] args) {
        int popn = 14000000;
        short male = 45;
        short female = 55;
        short m_e = 45;
        short f_e = 25;

        double malepopn = ((double) male / 100) * popn;
        double femalepopn = ((double) female / 100) * popn;

        double male_employed = ((double) m_e / 100) * malepopn;
        double female_employed = ((double) f_e / 100) * femalepopn;

        double male_unemployed = malepopn - male_employed;
        double female_unemployed = femalepopn - female_employed;

        double total_employed = female_employed + male_employed;

        System.out.println("The male population in the country is: " + malepopn);
        System.out.println("The female unemployed population in the country is: " + female_unemployed);
        System.out.println("The male unemployed population in the country is: " + male_unemployed);
        System.out.println("The total employed population in the country is: " + total_employed);
    }
}
/*
//This was my first attempt
public class Population {
    public static void main(String[] args) {
        int popn = 14000000;
        short male = 45;
        short female = 55;
        short m_e = 45;
        short f_e = 25;

        int malepopn = (int) ((male / 100) * popn);
        int femalepopn = (int) ((female / 100) * popn);

        int male_employed = (int) ((m_e / 100) * malepopn);
        int female_employed = (int) ((f_e / 100) * femalepopn);

        int male_unemployed = (int) (malepopn - male_employed);
        int female_unemployed = (int) (femalepopn - female_employed);

        int total_employed = (int) (female_employed + male_employed);


        System.out.println("The male population in the country is," + malepopn);
        System.out.println("The female unemployed population in the country is," + female_unemployed);
        System.out.println("The total employed population in the country is," + total_employed);

    }
}
 */