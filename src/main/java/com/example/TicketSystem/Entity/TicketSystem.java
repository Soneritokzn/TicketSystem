package com.example.TicketSystem.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer percent;
    private Integer amount4;
    private Integer amount8;
    private Integer amount12;
    private Integer result;


    public TicketSystem(Integer id, String name, Integer percent, Integer amount4, Integer amount8, Integer amount12, Integer result) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.amount4 = amount4;
        this.amount8 = amount8;
        this.amount12 = amount12;
        this.result = result;
    }

    public Integer getAmount4() {
        return amount4;
    }

    public void setAmount4(Integer amount4) {
        this.amount4 = amount4;
    }

    public Integer getAmount8() {
        return amount8;
    }

    public void setAmount8(Integer amount8) {
        this.amount8 = amount8;
    }

    public Integer getAmount12() {
        return amount12;
    }

    public void setAmount12(Integer amount12) {
        this.amount12 = amount12;
    }

    public Integer getId() {
        return id;
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

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
