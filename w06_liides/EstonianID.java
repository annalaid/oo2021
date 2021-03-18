import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;

    public EstonianID(String code) {
        this.code = code;
    }

    @Override
    public int getMonth() {
        return Integer.parseInt(code.substring(3, 5));
    }

    @Override
    public int getDay() {
        return Integer.parseInt(code.substring(5, 7));
    }

    @Override
    public String getGender() {
        int codeGender = code.charAt(0);
        /*
         * if(codeGender % 2 == 0 ) { return "Female"; } else { return "Male"; }
         */
        return codeGender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        int gender = Integer.parseInt(code.substring(0, 1));
        String year = code.substring(1, 3);

        if (gender == 2 || gender == 1) {
            year = "18" + year;
        } else if (gender == 4 || gender == 3) {
            year = "19" + year;
        } else if (gender == 6 || gender == 5) {
            year = "20" + year;
        }
        /*
         * int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100
         * + Integer.parseInt(code.substring(1,3));
         */
        /*
         * int fullYear = 1800 + (Integer.parseInt(code.substring(0,1)) / 2)* 100 +
         * (Integer.parseInt(code.substring(1,3)));
         */
        return Integer.parseInt(year);
    }

    @Override
    public String getDOB() {
        
        return this.getDay() + "." + this.getMonth() + "." + this.getFullYear();
    }

    @Override
    public String getAge() {
        LocalDate date = LocalDate.of(getFullYear(), getMonth(), getDay());
        LocalDate now = LocalDate.now();
        String age = Integer.toString(Period.between(date, now).getYears());
        return age;
    }

}