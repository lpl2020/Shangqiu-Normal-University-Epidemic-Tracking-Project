package com.example.demo.sq.entity;

public class StudentAttribute {
    private Integer id;

    private String studentNo;

    private String studentName;

    private Integer studentAge;

    private Integer studentSex;

    private String nation;

    private Integer ability1;

    private Integer ability2;

    private Integer ability3;

    private Integer ability4;

    private Integer ability5;

    private Integer ability6;

    private Integer ability7;

    private String classe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Integer getAbility1() {
        return ability1;
    }

    public void setAbility1(Integer ability1) {
        this.ability1 = ability1;
    }

    public Integer getAbility2() {
        return ability2;
    }

    public void setAbility2(Integer ability2) {
        this.ability2 = ability2;
    }

    public Integer getAbility3() {
        return ability3;
    }

    public void setAbility3(Integer ability3) {
        this.ability3 = ability3;
    }

    public Integer getAbility4() {
        return ability4;
    }

    public void setAbility4(Integer ability4) {
        this.ability4 = ability4;
    }

    public Integer getAbility5() {
        return ability5;
    }

    public void setAbility5(Integer ability5) {
        this.ability5 = ability5;
    }

    public Integer getAbility6() {
        return ability6;
    }

    public void setAbility6(Integer ability6) {
        this.ability6 = ability6;
    }

    public Integer getAbility7() {
        return ability7;
    }

    public void setAbility7(Integer ability7) {
        this.ability7 = ability7;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe == null ? null : classe.trim();
    }
}