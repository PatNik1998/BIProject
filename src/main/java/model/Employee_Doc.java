package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee_Doc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 20, nullable = false)
    private String docNumber;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date docDate;

    @Column(name = "id_type")
    private Integer idType;

    @OneToOne(
     mappedBy = "Employee_Doc",
     fetch = FetchType.LAZY,
     cascade = CascadeType.ALL,
     optional = false
    )

    private Employee employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }
}
