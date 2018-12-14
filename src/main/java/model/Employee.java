package model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 20,name = "first_name",nullable = false)
    private String firstName;

    @Column(length = 20,name = "second_name",nullable = false)
    private String secondName;

    @Column(length = 20,name = "middle_name",nullable = true)
    private String middleName;

    @Column(length = 20,name = "last_name", nullable = true)
    private String lastName;

    @Column(length = 20, nullable = false)
    private String position;

    @Column(length = 20,nullable = false)
    private String phone;

    @Column(name = "is_indentidied",nullable = true)
    private Boolean isIndentified;

   @Column(name = "doc_id")
   private Integer docId;

   @Column(name ="office_id", nullable = false)
   private Integer officeId;

   @Column(name = "country_id")
   private Integer countryId;

   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "doc_id")
   private Employee_Doc employeeDoc;


   public Employee_Doc getEmployeeDoc() {
        return employeeDoc;
    }

    public void setEmployeeDoc(Employee_Doc employeeDoc) {
        this.employeeDoc = employeeDoc;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIsIndentified() {
        return isIndentified;
    }

    public void setIsIndentified(Boolean isIndentified) {
        this.isIndentified = isIndentified;
    }
}
