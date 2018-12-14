package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Doc_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 5, nullable = false)
    private String code;

    public Integer getId() {
        return id;
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_type")
    private List<Employee_Doc> employeeDocs;

    public List<Employee_Doc> getEmployeeDocs() {
        return employeeDocs;
    }

    public void setEmployeeDocs(List<Employee_Doc> employeeDocs) {
        this.employeeDocs = employeeDocs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
