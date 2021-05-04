package Module0.bai11;

import java.time.LocalDate;
import java.util.ArrayList;

public class HocVien {
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Subject> subjects = new ArrayList<>();
    private String graduateType;

    public HocVien(String name, LocalDate dateOfBirth, ArrayList<Subject> subjects, String graduateType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
        this.graduateType = graduateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        for (Subject subject: subjects){
            if (subject.getDiem()<0 || subject.getDiem()>10){
                subject.setDiem(0);
            }else {
                this.subjects.add(subject);
            }
        }
    }

    public String getGraduateType() {
        setGraduateType();
        return graduateType;
    }

    public double gpa(){
        double total = 0;
        for (Subject subject : this.subjects){
            total += subject.getDiem();
        }
        return total/this.subjects.size();
    }
    public boolean isScoreDependency(){
        boolean isScoreDependency = false;
        for (int i =0; i< getSubjects().size();i++){
            if (this.subjects.get(i).getDiem()<5){
                isScoreDependency = true;
                this.subjects.get(i).setRetested(true);
            }
        }
        return isScoreDependency;
    }
    public void setGraduateType() {
        if(isScoreDependency()){
            this.graduateType= "Retest";
        }else {
            if (gpa()>7){
                this.graduateType = "Thesis";
            }else {
                this.graduateType = "Exam";
            }
        }

    }
}
