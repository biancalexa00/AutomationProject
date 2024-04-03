package ObjectData;

import java.util.Map;

public class WebTableObject {
    private String firstnameValue;
    private String lastnameValue;
    private String emailValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;

    //facem o metoda care sa mapeze datele din fisierul de resurse cu reprezentarea acestui obiect

    public WebTableObject (Map<String,String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String,String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "firstnameValue":
                    setFirstnameValue(testData.get(key));
                    break;

                case "lastnameValue":
                    setLastnameValue(testData.get(key));
                    break;

                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;

                case "ageValue":
                    setAgeValue(testData.get(key));
                    break;

                case "salaryValue":
                    setSalaryValue(testData.get(key));
                    break;

                case "departmentValue":
                    setDepartmentValue(testData.get(key));
                    break;
            }
        }

    }

    public String getFirstnameValue() {
        return firstnameValue;
    }

    public void setFirstnameValue(String firstnameValue) {
        this.firstnameValue = firstnameValue;
    }

    public String getLastnameValue() {
        return lastnameValue;
    }

    public void setLastnameValue(String lastnameValue) {
        this.lastnameValue = lastnameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }
}
