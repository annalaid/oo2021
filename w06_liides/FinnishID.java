import java.time.LocalDate;
import java.time.Period;

public class FinnishID implements PersonalCodeBehaviour{
    private String code;

    public FinnishID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int codeGender = Integer.parseInt(code.substring(7, 9));

        return codeGender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getMonth() {
        return Integer.parseInt(code.substring(2, 4));
    }

    @Override
    public int getDay() {
        return Integer.parseInt(code.substring(0, 2));
    }

    @Override
    public int getFullYear() {
        String birthYear = code.substring(4, 6);
        String birthCentury = code.substring(6, 7);
        if (birthCentury.equals("+")) {
            birthYear = "18" + birthYear;
        } else if (birthCentury.equals("-")) {
            birthYear = "19" + birthYear;
        } else if (birthCentury.equals("A")) {
            birthYear = "20" + birthYear;
        }

        return Integer.parseInt(birthYear);
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
