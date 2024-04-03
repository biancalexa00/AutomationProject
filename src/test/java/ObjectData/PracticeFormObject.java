package ObjectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{

    private String firstNameFieldValue;
    private String lastNameFieldValue;
    private String emailFieldValue;
    private String mobileNoFieldValue;
    private String dobMonthValue;
    private String yearValue;
    private String dayValue;
    private String genderValue;
    private List<String>hobbies;
    private String userSubjectsValue;
    private String filePath;
    private String addressValue;
    private String subjectValue;
    private String stateLoc;
    private String cityLoc;
    public PracticeFormObject (Map<String,String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String,String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameFieldValue":
                    setFirstNameFieldValue(testData.get(key));
                    break;
                case "lastNameFieldValue":
                    setLastNameFieldValue(testData.get(key));
                    break;
                case "emailFieldValue":
                    setEmailFieldValue(testData.get(key));
                    break;
                case "mobileNoFieldValue":
                    setMobileNoFieldValue(testData.get(key));
                    break;
                case "dobMonthValue":
                    setDobMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies=getPreparedValue(testData.get(key));
                    break;
                case "userSubjectsValue":
                    setUserSubjectsValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "subjectValue":
                    setSubjectValue(testData.get(key));
                    break;
                case "stateLoc":
                    setStateLoc(testData.get(key));
                    break;
                case "cityLoc":
                    setCityLoc(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameFieldValue() {
        return firstNameFieldValue;
    }

    public void setFirstNameFieldValue(String firstNameFieldValue) {
        this.firstNameFieldValue = firstNameFieldValue;
    }

    public String getLastNameFieldValue() {
        return lastNameFieldValue;
    }

    public void setLastNameFieldValue(String lastNameFieldValue) {
        this.lastNameFieldValue = lastNameFieldValue;
    }

    public String getEmailFieldValue() {
        return emailFieldValue;
    }

    public void setEmailFieldValue(String emailFieldValue) {
        this.emailFieldValue = emailFieldValue;
    }

    public String getMobileNoFieldValue() {
        return mobileNoFieldValue;
    }

    public void setMobileNoFieldValue(String mobileNoFieldValue) {
        this.mobileNoFieldValue = mobileNoFieldValue;
    }

    public String getDobMonthValue() {
        return dobMonthValue;
    }

    public void setDobMonthValue(String dobMonthValue) {
        this.dobMonthValue = dobMonthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getUserSubjectsValue() {
        return userSubjectsValue;
    }

    public void setUserSubjectsValue(String userSubjectsValue) {
        this.userSubjectsValue = userSubjectsValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getSubjectValue() {
        return subjectValue;
    }

    public void setSubjectValue(String subjectValue) {
        this.subjectValue = subjectValue;
    }

    public String getStateLoc() {
        return stateLoc;
    }

    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc;
    }

    public String getCityLoc() {
        return cityLoc;
    }

    public void setCityLoc(String cityLoc) {
        this.cityLoc = cityLoc;
    }
}
